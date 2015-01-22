/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.entidades;

import informacion.entidades.Materia;

/**
 *
 * @author Denis
 */
public class Detalle implements Comparable<Detalle> {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private Double valor;
    private Integer idReporte;
    private Integer idMateria;
    private Reporte reporte; 
    private Materia materia;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Detalle() {
        this.reporte = new Reporte(); 
        this.materia = new Materia();
    }

    public Detalle(Integer id, Double valor, Integer idReporte, Integer idMateria) {
        this.id = id;
        this.valor = valor;
        this.idReporte = idReporte;
        this.idMateria = idMateria;
    }       
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }   
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Sobreescritos">
    @Override
    public int compareTo(Detalle o) {
        return o.getValor().compareTo(this.valor);
    }
    //</editor-fold>     
}
