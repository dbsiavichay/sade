/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.entidades;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Luis
 */
public class Usuario {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    @Size(min = 11, max = 11, message = "La cedula incorrecta, recuerde incluir el guión")
    private String cedula;    
    private String contrasena;
    private String nombres;
    private String apellidos;
    @Size(max = 9, message = "El telefono debe tener 9 caracteres -  incluido el numero de area")
    @Pattern(regexp = "[0-9]*")
    private String telefonoFijo;
    @Size(max = 10, message = "El celular debe tener diez caracteres.")
    @Pattern(regexp = "[0-9]*")
    private String telefonoCelular;
    private String email;
    private Boolean activo;
    private String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    private String numeros = "1234567890";
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Usuario() {
        this.nombres = new String();
        this.apellidos = new String();
    }

    public Usuario(Integer id, String cedula, String contrasena, String nombres, String apellidos, String telefonoFijo, String telefonoCelular, String email, Boolean activo) {
        this.id = id;
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.email = email;
        this.activo = activo;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Set y Get">                    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getNombreCompleto() {
        return this.nombres + " " + this.apellidos;
    }

    public void encriptarContrasena() {
        if(this.contrasena.trim().length()==0 || this.contrasena == null){
            return;
        }
        String encriptado = "";
        for (int i = 0; i < this.contrasena.length(); i++) {
            String c = String.valueOf(this.contrasena.charAt(i));            
            int index;
            if(this.mayusculas.contains(c)){
                index = this.mayusculas.indexOf(c) + 1;
                index=index<=14?index+=13:(index+=13)-27;index--;
                encriptado+=String.valueOf(this.mayusculas.charAt(index));
            }else if(this.minusculas.contains(c)){
                index = this.minusculas.indexOf(c) + 1;
                index=index<=12?index+=15:(index+=15)-27;index--;
                encriptado+=String.valueOf(this.minusculas.charAt(index));
            }else if(this.numeros.contains(c)){
                index = this.numeros.indexOf(c) + 1;
                index=index<=5?index+=5:(index+=5)-10;index--;
                encriptado+=String.valueOf(this.numeros.charAt(index));
            }
        }
        this.contrasena = encriptado;
    }
    
    public void desencriptarContrasena() {
        if(this.contrasena.trim().length()==0 || this.contrasena == null){
            return;
        }
        String desencriptado = "";
        for (int i = 0; i < this.contrasena.length(); i++) {
            String c = String.valueOf(this.contrasena.charAt(i));            
            int index;
            if(this.mayusculas.contains(c)){
                index = this.mayusculas.indexOf(c) +1;
                index=index>14?index-=13:27-(index-=13);index--;
                desencriptado+=String.valueOf(this.mayusculas.charAt(index));
            }else if(this.minusculas.contains(c)){
                index = this.minusculas.indexOf(c) +1;
                index=index>12?index-=15:27-(index-=15);index--;
                desencriptado+=String.valueOf(this.minusculas.charAt(index));
            }else if(this.numeros.contains(c)){
                index = this.numeros.indexOf(c)+1;
                index=index>5?index-=5:10-(index+=5);index--;
                desencriptado+=String.valueOf(this.numeros.charAt(index));
            }
        }
        this.contrasena = desencriptado;
    }
    //</editor-fold>
}
