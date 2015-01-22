/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.parametros;

/**
 *
 * @author Luis
 */
public class MateriaParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_CARRERA = "SCAR";
    public static final String OPERACION_SELECT_POR_CAMPO_DETALLADO = "SCPD";
    public static final String OPERACION_SELECT_POR_PROCESO = "SPRC";
    public static final String OPERACION_SELECT_SIN_CAMPO_DETALLADO_POR_CARRERA = "SMCDCAR";
    public static final String OPERACION_SELECT_SIN_CAMPO_DETALLADO = "SMCD";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM informacion.pa_materias(?,?,?,?,?,?);";
    public static final String CONSULTA_MATERIAS_POR_PROCESO_CON_CAMPOS_DETALLADOS = "SELECT mat.id, mat.codigo_carrera, mat.nombre_carrera, mat.codigo_materia, mat.nombre_materia,"
            + "ARRAY (SELECT (cd ,'>',ce)::character varying FROM informacion.campo_detallado AS cd"
            + " INNER JOIN informacion.campo_especifico AS ce ON cd.id_campo_especifico = ce.id"
            + " INNER JOIN informacion.materia_campo_detallado AS mcd ON cd.id = mcd.id_campo_detallado"
            + " WHERE mcd.id_materia = mat.id) AS campos"
            + " FROM informacion.materia AS mat"
            + " INNER JOIN informacion.materia_proceso AS mp ON mat.id = mp.id_materia"
            + " WHERE mp.id_proceso = %s;";
}
