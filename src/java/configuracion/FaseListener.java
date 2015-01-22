/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author Daniel
 */
public class FaseListener implements PhaseListener {

    private static final long serialVersionUID = 1L;

    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println((new StringBuilder("   Despues de la fase  --> ")).append(event.getPhaseId().toString()).append("--Vista ").
                append(event.getFacesContext().getViewRoot().getViewId()).
                toString());
        if (event.getPhaseId() == PhaseId.RENDER_RESPONSE) {
            System.out.println("******Peticion Procesada!!****");
            System.out.println("<<<  <<<   <<    <<     <");
            System.out.println((""));
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        if (event.getPhaseId() == PhaseId.RESTORE_VIEW) {
            System.out.println((""));
            System.out.println((" >   >   >>   >>   >>>    >>>"));
            System.out.println(("****  Procesando una nueva Peticion   ****"));
        }
        System.out.println((new StringBuilder("   Antes de la fase  --> ")).append(event.getPhaseId().toString()).toString());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
