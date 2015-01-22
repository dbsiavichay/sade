/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.parametros;

/**
 *
 * @author Luis
 */
public class CampoDetalladoTituloParametros {

    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID"; 
    public static final String OPERACION_SELECT_POR_TITULO = "STIT"; 
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String OPERACION_ELIMINAR = "DEL";    
    public static final String OPERACION_ELIMINAR_POR_CAMPO_TITULO = "DEL2";    
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM evidencia.\"pa_campos_detallados_titulos\"(?,?,?,?);";
    
    public static final String CONSULTA_AREA_PERFIL_TODOS_CON_OBJETOS = "SELECT aper.id, aper.id_area, aper.id_perfil,"
            + "are.id, are.nombre, are.id_categoria,"
            + "per.id, per.nombre, per.registro, per.id_docente"
            + " FROM evidencia.area_perfil AS aper"
            + " INNER JOIN informacion.area AS are ON aper.id_area = are.id"
            + " INNER JOIN evidencia.perfil AS per ON aper.id_perfil = per.id"
            + " ORDER BY are.nombre,per.nombre;";
    public static final String CONSULTA_AREA_PREFIL_POR_AREA_CON_OBJETOS = "SELECT aper.id, aper.id_area, aper.id_perfil,"
            + "are.id, are.nombre, are.id_categoria,"
            + "per.id, per.nombre, per.registro, per.id_docente"
            + " FROM evidencia.area_perfil AS aper"
            + " INNER JOIN informacion.area AS are ON aper.id_area = are.id"
            + " INNER JOIN evidencia.perfil AS per ON aper.id_perfil = per.id"
            + " WHERE are.id = %s"
            + " ORDER BY are.nombre,per.nombre;";        
}
