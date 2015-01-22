/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.parametros;

/**
 *
 * @author Denis
 */
public class ReporteParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_PROCESO_Y_DOCENTE = "SPRCDOC";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM conocimiento.pa_reportes(?,?,?,?,?);";
    public static final String CONSULTA_REPORTE = "SELECT rep.id, rep.id_proceso, rep.id_docente, rep.url,"
            + "prc.id, prc.codigo, prc.descripcion, prc.inicia, prc.finaliza, prc.activo,"
            + "doc.id, doc.cedula,doc.contrasena,doc.nombres, doc.apellidos,doc.telefono_fijo, doc.telefono_celular,doc.email,doc.activo"
            + " FROM conocimiento.reporte AS rep"
            + " INNER JOIN informacion.proceso As prc ON rep.id_proceso = prc.id"
            + " INNER JOIN seguridad.usuario as doc ON rep.id_docente = doc.id"
            + " WHERE rep.id = %s;";
    public static final String CONSULTA_REPORTES_POR_PROCESO = "SELECT rep.id, rep.id_proceso, rep.id_docente, rep.url,"
            + "prc.id, prc.codigo, prc.descripcion, prc.inicia, prc.finaliza, prc.activo,"
            + "doc.id, doc.cedula,doc.contrasena,doc.nombres, doc.apellidos,doc.telefono_fijo, doc.telefono_celular,doc.email,doc.activo"
            + " FROM conocimiento.reporte AS rep"
            + " INNER JOIN informacion.proceso As prc ON rep.id_proceso = prc.id"
            + " INNER JOIN seguridad.usuario as doc ON rep.id_docente = doc.id"
            + " WHERE rep.id_proceso = %s;";
    public static final String CONSULTA_REPORTES_TODOS = "SELECT rep.id, rep.id_proceso, rep.id_docente, rep.url,"
            + "prc.id, prc.codigo, prc.descripcion, prc.inicia, prc.finaliza, prc.activo,"
            + "doc.id, doc.cedula,doc.contrasena,doc.nombres, doc.apellidos,doc.telefono_fijo, doc.telefono_celular,doc.email,doc.activo"
            + " FROM conocimiento.reporte AS rep"
            + " INNER JOIN informacion.proceso As prc ON rep.id_proceso = prc.id"
            + " INNER JOIN seguridad.usuario as doc ON rep.id_docente = doc.id;";
    public static final String CONSULTA_REPORTES_POR_PROCESO_PROMEDIO = "SELECT usu.id, usu.cedula,usu.nombres, usu.apellidos, avg(det.valor)"
            + " FROM conocimiento.detalle AS det"
            + " INNER JOIN conocimiento.reporte AS rep ON rep.id = det.id_reporte"
            + " INNER JOIN seguridad.usuario AS usu ON usu.id = rep.id_docente"
            + " WHERE rep.id_proceso = %s"
            + " GROUP BY usu.id, usu.cedula,usu.nombres, usu.apellidos"
            + " ORDER BY -avg(det.valor);";
}
