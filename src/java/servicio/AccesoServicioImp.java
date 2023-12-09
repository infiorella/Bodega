package servicio;

public class AccesoServicioImp implements AccesoServicio{

    @Override
    public Object[] validarEmpleado(String usu, String pas) {
        Object[] fil={"E002", "Empleado 2"};
        
        if(fil!=null){
            return fil;
        }
        
        return null;
    }
    
}
