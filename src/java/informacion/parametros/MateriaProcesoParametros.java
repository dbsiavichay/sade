/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.parametros;

/**
 *
 * @author dbsiavichay
 */
public class MateriaProcesoParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_PROCESO = "SPRC";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String OPERACION_ELIMINAR_POR_MATERIA_Y_PROCESO = "DELMP";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM informacion.\"pa_materias_proceso\"(?,?,?,?);";
    public static final String CONSULTA_POR_PROCESO_Y_CARRERA = "SELECT mpr.id AS outid, mpr.id_materia AS outid_materia, mpr.id_proceso AS outid_proceso"
            + " FROM informacion.materia_proceso AS mpr"
            + " INNER JOIN informacion.materia AS mat ON mpr.id_materia = mat.id"
            + " WHERE mpr.id_proceso = %s AND mat.codigo_carrera='%s';";
    public static final String CONSULTA_POR_MATERIA = "SELECT mp.id, mp.id_materia, mp.id_proceso,"
            + "mat.id, mat.codigo_carrera, mat.nombre_carrera, mat.codigo_materia, mat.nombre_materia,"
            + "pro.id, pro.codigo, pro.descripcion, pro.inicia, pro.finaliza, pro.activo"
            + " FROM informacion.materia_proceso AS mp "
            + " INNER JOIN informacion.materia AS mat ON mp.id_materia = mat.id"
            + " INNER JOIN informacion.proceso AS pro ON mp.id_proceso = pro.id"
            + " WHERE mp.id_materia = %s;";
}
