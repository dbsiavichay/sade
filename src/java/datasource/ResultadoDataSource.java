/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

import conocimiento.entidades.Detalle;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author dbsiavichay
 */
public class ResultadoDataSource implements JRDataSource {

    private List<Detalle> detalles;
    private Integer indiceDetalleActual;

    public ResultadoDataSource(List<Detalle> detalles) {
        this.detalles = detalles;
        this.indiceDetalleActual = -1;
    }

    @Override
    public boolean next() throws JRException {
        return ++indiceDetalleActual < this.detalles.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        if ("materia".equals(jrf.getName())) {
            valor = detalles.get(indiceDetalleActual).getMateria().getNombreMateria();       
        } else if ("certeza".equals(jrf.getName())) {
            valor = detalles.get(indiceDetalleActual).getValor() * 100;
        }else if ("item".equals(jrf.getName())) {
            valor = indiceDetalleActual+1;
        }else if ("carrera".equals(jrf.getName())) {
            valor = detalles.get(indiceDetalleActual).getMateria().getNombreCarrera();
        }
        return valor;
    }
}
