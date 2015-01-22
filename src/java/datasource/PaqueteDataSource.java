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
public class PaqueteDataSource implements JRDataSource {

    private List<Detalle> resultados;
    private Integer indiceResultadoActual;

    public PaqueteDataSource(List<Detalle> resultados) {
        this.resultados = resultados;
        this.indiceResultadoActual = -1;
    }

    @Override
    public boolean next() throws JRException {
        return ++indiceResultadoActual < this.resultados.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        if ("cedula".equals(jrf.getName())) {
            valor = resultados.get(indiceResultadoActual).getReporte().getDocente().getCedula();
        } else if ("docente".equals(jrf.getName())) {
            valor = resultados.get(indiceResultadoActual).getReporte().getDocente().getNombreCompleto();
        } else if ("valor".equals(jrf.getName())) {
            valor = resultados.get(indiceResultadoActual).getValor() * 100;
        }else if ("item".equals(jrf.getName())) {
            valor = indiceResultadoActual+1;
        }
        return valor;
    }
}
