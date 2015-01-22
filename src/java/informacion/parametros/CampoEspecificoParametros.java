/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.parametros;

/**
 *
 * @author Luis
 */
public class CampoEspecificoParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_CAMPO_AMPLIO = "SAMP";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM informacion.pa_campos_especificos(?,?,?,?,?);";
    public static final String CONSULTA_CAMPOS_ESPECIFICOS_POR_CAMPO_AMPLIO_CON_OBJETOS = "SELECT csp.id, csp.codigo, csp.nombre, csp.id_campo_amplio,"
            + "ARRAY(SELECT cdt::character varying FROM informacion.campo_detallado AS cdt WHERE cdt.id_campo_especifico = csp.id) AS campos_detallados"
            + " FROM informacion.campo_especifico AS csp"
            + " WHERE id_campo_amplio = %s;";
}
