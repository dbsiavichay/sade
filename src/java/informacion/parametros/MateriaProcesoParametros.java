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
    public static final String CONSULTA_POR_PROCESO_Y_DOCENTE_CON_REGLAS = "SELECT mtp.id, mtp.codigo_carrera, mtp.nombre_carrera, mtp.codigo_materia, mtp.nombre_materia, mtp.id_proceso,"
            + "ARRAY(SELECT (SELECT reg::character varying"
            + " FROM conocimiento.regla AS reg"
            + " INNER JOIN informacion.area AS are ON are.id = reg.id_area"
            + " INNER JOIN evidencia.area_perfil AS arp ON arp.id_area = are.id"
            + " WHERE arp.id_perfil = per.id AND reg.codigo_materia = mtp.codigo_materia"
            + " ORDER BY reg.factor_certeza DESC"
            + " LIMIT 1) AS reglas"
            + " FROM evidencia.perfil AS per"
            + " WHERE per.id_docente = %s) as reglas"
            + " FROM informacion.materia_proceso AS mtp"
            + " WHERE mtp.id_proceso = %s;";
}
