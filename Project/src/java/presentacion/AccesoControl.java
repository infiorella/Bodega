package presentacion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import servicio.AccesoServicio;


public class AccesoControl extends org.apache.struts.action.Action {
   private AccesoServicio as;

    public void setAs(AccesoServicio as) {
        this.as = as;
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AccesoForm f=(AccesoForm) form;
        
        //Object[]fil={"E001","Empleado 1"};
        Object[]fil=as.validarEmpleado(f.getUsu(), f.getPas());
        
        if(fil!=null){
            request.getSession().setAttribute("fil", fil);
            return mapping.findForward("Menu");
        }else{
            request.getSession().setAttribute("msg", "Acceso No Permitido");
            return mapping.findForward("Mensaje");
        }
         
    }
}
