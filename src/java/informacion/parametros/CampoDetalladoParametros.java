/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.parametros;

/**
 *
 * @author Luis
 */
public class CampoDetalladoParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";    
    public static final String OPERACION_SELECT_POR_CAMPO_ESPECIFICO = "SESP"; 
    public static final String OPERACION_SELECT_POR_TITULO = "STIT"; 
    public static final String OPERACION_SELECT_POR_MATERIA = "SMAT"; 
    public static final String OPERACION_SELECT_TODOS = "STOD";    
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM informacion.pa_campos_detallados(?,?,?,?,?);";    
}
