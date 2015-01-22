/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.parametros;

/**
 *
 * @author Denis
 */
public class FuncionParametros {
    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_GRUPO_Y_ROL = "SGRUROL";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM seguridad.pa_funciones(?,?,?,?,?,?,?,?,?,?);";
    public static final String CONSULTA_FUNCIONES_POR_ROL_CON_OBJETOS = "SELECT fnc.id ,fnc.agregar,fnc.editar,fnc.eliminar, fnc.orden,fnc.activo,fnc.id_grupo, fnc.id_accion,fnc.id_rol,"
            + "gru.id,gru.nombre,gru.orden,gru.padre,"
            + "acc.id,acc.nombre,acc.url,acc.activo,"
            + "rol.id, rol.codigo, rol.nombre, rol.activo"
            + " FROM seguridad.funcion AS fnc"
            + " INNER JOIN seguridad.grupo AS gru ON fnc.id_grupo = gru.id"
            + " INNER JOIN seguridad.accion AS acc ON fnc.id_accion = acc.id"
            + " INNER JOIN seguridad.rol AS rol ON fnc.id_rol = rol.id"
            + " WHERE rol.id = %s"
            + " ORDER BY gru.orden,fnc.orden;";
}
