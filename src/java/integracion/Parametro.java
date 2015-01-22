/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

/**
 *
 * @author Daniel
 */
public class Parametro {

    private int posicion;
    private Object valor;
    private Boolean entrada;
    private String nombre;
    private Integer tipo;

    public Parametro() {
        posicion = 0;
        valor = null;
    }

    public Parametro(int posicion, Object valor, Boolean entrada, String nombre, Integer tipo) {
        this.posicion = posicion;
        this.valor = valor;
        this.entrada = entrada;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Boolean getEntrada() {
        return entrada;
    }

    public void setEntrada(Boolean entrada) {
        this.entrada = entrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
