/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

import evidencia.entidades.Titulo;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author dbsiavichay
 */
public class ReporteDataSource implements JRDataSource {

    private List<Titulo> titulos;
    private Integer indiceTituloActual;

    public ReporteDataSource(List<Titulo> perfiles) {
        this.titulos = perfiles;
        this.indiceTituloActual = -1;
    }

    @Override
    public boolean next() throws JRException {
        return ++indiceTituloActual < titulos.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        if ("categoria".equals(jrf.getName())) {
            valor = titulos.get(this.indiceTituloActual).getCategoria().getNombre();
        } else if ("titulo".equals(jrf.getName())) {
            valor = titulos.get(this.indiceTituloActual).getNombre();
        } else if ("registro".equals(jrf.getName())) {
            valor = titulos.get(this.indiceTituloActual).getRegistro();
        }
        return valor;
    }
}
