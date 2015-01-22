/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.parametros;

/**
 *
 * @author Luis
 */
public class CompetenciaParametros {
      
    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_ELIMINAR = "DEL";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_USUARIO = "SUSU";
    public static final String OPERACION_SELECT_POR_ROL = "SROL";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM seguridad.pa_competencias(?,?,?,?,?);";
    public static final String CONSULTA_COMPETENCIAS_POR_USUARIO_CON_OBJETOS = "SELECT cmp.id, cmp.activo, cmp.id_rol, cmp.id_usuario,"
            + "rol.id, rol.codigo, rol.nombre, rol.activo"
            + " FROM seguridad.competencia AS cmp"
            + " INNER JOIN seguridad.rol AS rol ON cmp.id_rol = rol.id"
            + " WHERE cmp.id_usuario = %s;";
    
}
