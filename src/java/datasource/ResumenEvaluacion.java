/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

/**
 *
 * @author dbsiavichay
 */
public class ResumenEvaluacion implements Comparable<ResumenEvaluacion> {
    
    private int numero;
    private String materia;
    private Double certeza;
    private Integer idMateria;

    public ResumenEvaluacion() {
    }

    public ResumenEvaluacion(int numero, String materia, Double certeza, Integer idMateria) {
        this.numero = numero;
        this.materia = materia;
        this.certeza = certeza;
        this.idMateria = idMateria;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getCerteza() {
        return certeza;
    }

    public void setCerteza(Double certeza) {
        this.certeza = certeza;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }
    
   
    @Override
    public int compareTo(ResumenEvaluacion o) {
        return o.getCerteza().compareTo(this.certeza);
    }
    
    
}
