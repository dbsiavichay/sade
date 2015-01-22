/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.parametros;

/**
 *
 * @author Luis
 */
public class MateriaCampoDetalladoParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_CAMPO_DETALLADO = "SCPD";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String OPERACION_ELIMINAR_POR_MATERIA_Y_CAMPO = "DELMC";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM informacion.pa_materias_campo_detallado(?,?,?,?);";
    public static final String CONSULTA_POR_CAMPO_DETALLADO_Y_CARRERA = "SELECT cpd.id AS outid, cpd.id_materia AS outid_materia, cpd.id_campo_detallado AS outid_campo_detallado"
            + " FROM informacion.materia_campo_detallado AS cpd"
            + " INNER JOIN informacion.materia AS mat ON cpd.id_materia = mat.id"
            + " WHERE cpd.id_campo_detallado = %s AND mat.codigo_carrera='%s';";
    public static final String CONSULTA_POR_CAMPO_DETALLADO = "SELECT mcd.id, mcd.id_materia, mcd.id_campo_detallado,"
            + "mat.id, mat.codigo_carrera, mat.nombre_carrera, mat.codigo_materia, mat.nombre_materia"
            + " FROM informacion.materia_campo_detallado AS mcd"
            + " INNER JOIN informacion.materia AS mat ON mat.id = mcd.id_materia"
            + " WHERE mcd.id_campo_detallado = %s"
            + " ORDER BY mat.nombre_carrera, mat.nombre_materia;";
}
