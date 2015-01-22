/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.parametros;

/**
 *
 * @author Luis
 */
public class TituloParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_DOCENTE = "SDOC";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM evidencia.\"pa_titulos\"(?,?,?,?,?,?,?);";
    public static final String CONSULTA_TITULOS_POR_DOCENTE_CON_CAMPOS = "SELECT tit.id, tit.nombre, tit.registro, tit.url_documento, tit.id_docente, tit.id_categoria,"
            + "cat.id, cat.codigo, cat.nombre, cat.ponderacion, cat.estudio_formal, cat.orden,"
            + " ARRAY (SELECT (cd,'>',ce)::character varying FROM informacion.campo_detallado AS cd"
            + " INNER JOIN informacion.campo_especifico AS ce ON cd.id_campo_especifico = ce.id"
            + " INNER JOIN evidencia.campo_detallado_titulo AS cdt ON cd.id = cdt.id_campo_detallado"
            + " WHERE cdt.id_titulo = tit.id) AS campos"
            + " FROM evidencia.titulo AS tit"
            + " INNER JOIN informacion.categoria AS cat ON cat.id = tit.id_categoria"
            + " WHERE tit.id_docente = %s"
            + " ORDER BY -cat.orden;";
}
