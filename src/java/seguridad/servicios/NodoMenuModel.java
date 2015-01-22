/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.servicios;

import java.util.ArrayList;
import java.util.List;
import seguridad.entidades.Accion;
import seguridad.entidades.Funcion;
import seguridad.entidades.Grupo;
import seguridad.entidades.NodoMenu;

/**
 *
 * @author Denis
 */
public class NodoMenuModel {

    public static List<NodoMenu> generarMenuUsuario(Integer idRol) throws Exception {
        List<NodoMenu> menu = new ArrayList<NodoMenu>();
        try {
            GrupoModel grupoModel = new GrupoModel();
            List<Grupo> grupos = grupoModel.encontrarPorPadre(0);

            for (Grupo grupo : grupos) {
                NodoMenu nodoRaiz = getNodo(grupo, idRol);
                if (!nodoRaiz.getHijos().isEmpty()) {
                    nodoRaiz.setDescripcion(grupo.getNombre());
                    menu.add(nodoRaiz);
                }
            }

        } catch (Exception e) {
            throw e;
        }
        return menu;
    }

    private static NodoMenu getNodo(Grupo grupoRaiz, Integer idRol) throws Exception {
        NodoMenu nodoRaiz = new NodoMenu();
        GrupoModel grupoModel = new GrupoModel();
        try {
            List<Grupo> gruposHijas = grupoModel.encontrarPorPadre(grupoRaiz.getId());
            if (!gruposHijas.isEmpty()) {
                for (Grupo grupo : gruposHijas) {
                    NodoMenu nodo = getNodo(grupo, idRol);
                    if (!nodo.getHijos().isEmpty()) {
                        nodo.setDescripcion(grupo.getNombre());
                        nodoRaiz.getHijos().add(nodo);
                    }
                }
            }
            FuncionModel funcionModel = new FuncionModel();
            List<Funcion> funciones = funcionModel.encontrarPorGrupoYRol(grupoRaiz.getId(), idRol);
            if (!funciones.isEmpty()) {
                AccionModel accionModel = new AccionModel();
                for (Funcion funcion : funciones) {
                    Accion accion = accionModel.encontrar(funcion.getIdAccion());
                    NodoMenu nodo = new NodoMenu();
                    nodo.setCodigo(funcion.getId().toString());
                    nodo.setDescripcion(accion.getNombre());
                    if (accion.getActivo()) {
                        nodo.setUrl(accion.getUrl());
                    } else {
                        nodo.setUrl("errores/nodisponible.xhtml");
                    }
                    nodoRaiz.getHijos().add(nodo);
                }
            }

        } catch (Exception e) {
            throw e;
        }
        return nodoRaiz;
    }
}
