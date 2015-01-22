/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.parametros;

/**
 *
 * @author Denis
 */
public class DetalleParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_REPORTE_Y_MATERIA = "SREPMAT";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM conocimiento.pa_detalles(?,?,?,?,?);";
    public static final String CONSULTA_POR_REPORTE = "SELECT det.id, det.valor, det.id_reporte, det.id_materia,"
            + "mat.id, mat.codigo_carrera, mat.nombre_carrera, mat.codigo_materia, mat.nombre_materia"
            + " FROM conocimiento.detalle AS det"
            + " INNER JOIN informacion.materia AS mat ON det.id_materia = mat.id"
            + " WHERE det.id_reporte = %s"
            + " ORDER BY -det.valor;";
}
