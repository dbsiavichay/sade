/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inferencia.controladores;

import conocimiento.entidades.Detalle;
import conocimiento.entidades.Regla;
import conocimiento.entidades.Reporte;
import conocimiento.servicios.ReglaModel;
import evidencia.entidades.Titulo;
import evidencia.servicios.TituloModel;
import informacion.entidades.CampoDetallado;
import informacion.entidades.CampoEspecifico;
import informacion.entidades.Materia;
import informacion.servicios.MateriaModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import seguridad.entidades.Usuario;

/**
 *
 * @author dbsiavichay
 */
public class MotorInferenciaModel {

    public static Reporte evaluarPerfil(Usuario docente, Integer idProceso) throws Exception {
        Reporte reporte = new Reporte();
        reporte.setIdDocente(docente.getId());
        reporte.setDocente(docente);

        MateriaModel materiaModel = new MateriaModel();
        TituloModel tituloModel = new TituloModel();
        ReglaModel reglaModel = new ReglaModel();

        try {
            List<Materia> materias = materiaModel.consultaMateriaPorProcesoConCampos(idProceso);
            List<Titulo> titulos = tituloModel.consultaTitulosPorDocenteConCampos(docente.getId());

            for (Materia materia : materias) {
                CampoEspecifico campoMateria = materia.getCamposDetallados().get(0).getCampoEspecifico();                
                Double resultado = 0.001;
                for (Titulo titulo : titulos) {
                    List<CampoEspecifico> camposEvaluados = new ArrayList<CampoEspecifico>();
                    for (CampoDetallado campoTitulo : titulo.getCamposDetallados()) {
                        double x, y;
                        if (!camposEvaluados.contains(campoTitulo.getCampoEspecifico())) {
                            Regla regla = reglaModel.encontrarRegla(campoTitulo.getIdCampoEspecifico(), campoMateria.getId());
                            if (regla != null) {
                                x = resultado;
                                y = regla.getCerteza() * titulo.getCategoria().getPonderacion();
                                if (x > 0.0 && y > 0.0) {
                                    resultado = x + (y * (1 - x));
                                }
                                if (x < 0.0 && y < 0.0) {
                                    resultado = x + (y * (1 + x));
                                }
                                if (-1.0 < x * y && x * y <= 0.0) {
                                    resultado = (x + y) / (1 - Math.min(Math.abs(x), Math.abs(y)));
                                }
                                camposEvaluados.add(campoTitulo.getCampoEspecifico());
                            }
                        }
                    }
                }

                resultado = Math.floor(resultado * 100.0) / 100.0;                
                Detalle detalle = new Detalle();
                detalle.setIdMateria(materia.getId());
                detalle.setValor(resultado);
                detalle.setMateria(materia);
                reporte.getDetalles().add(detalle);
            }
            Collections.sort(reporte.getDetalles());
        } catch (Exception e) {
            reporte = null;
            throw e;
        }
        return reporte;
    }
}
