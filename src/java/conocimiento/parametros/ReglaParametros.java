/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.parametros;

/**
 *
 * @author dbsiavichay
 */
public class ReglaParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_CAMPO_ESPECIFICO = "SCAMESP";
    public static final String OPERACION_SELECT_CAMPO_MATERIA_CAMPO_TITULO = "SREG";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM conocimiento.pa_reglas(?,?,?,?,?);";
    
    public static final String CONSULTA_REGLAS_TODOS = "SELECT reg.id, reg.id_campo_especifico_titulo, reg.id_campo_especifico_materia, reg.certeza,"
            + "cet.id, cet.codigo, cet.nombre, cet.id_campo_amplio,"
            + "cem.id, cem.codigo, cem.nombre, cem.id_campo_amplio"
            + " FROM conocimiento.regla AS reg"
            + " INNER JOIN informacion.campo_especifico AS cet ON cet.id = reg.id_campo_especifico_titulo"
            + " INNER JOIN informacion.campo_especifico AS cem ON cem.id = reg.id_campo_especifico_materia"
            + " ORDER BY cet.nombre, cem.nombre;";
    
    public static final String CONSULTA_REGLAS_POR_CAMPO_ESPECIFICO = "SELECT reg.id, reg.id_campo_especifico_titulo, reg.id_campo_especifico_materia, reg.certeza,"
            + "cet.id, cet.codigo, cet.nombre, cet.id_campo_amplio,"
            + "cem.id, cem.codigo, cem.nombre, cem.id_campo_amplio"
            + " FROM conocimiento.regla AS reg"
            + " INNER JOIN informacion.campo_especifico AS cet ON cet.id = reg.id_campo_especifico_titulo"
            + " INNER JOIN informacion.campo_especifico AS cem ON cem.id = reg.id_campo_especifico_materia"
            + " WHERE reg.id_campo_especifico_titulo = %s"
            + " ORDER BY cet.nombre, cem.nombre;";
}
