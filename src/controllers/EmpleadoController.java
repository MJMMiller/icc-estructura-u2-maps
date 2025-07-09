package controllers;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoController {

    private EmpleadoDAO empleadoDAO;

    public EmpleadoController(EmpleadoDAO empleadoDAO){
        this.empleadoDAO = empleadoDAO;
    }

    public void addEmpleado(Empleado empleado){
        empleadoDAO.addEmpleado(empleado);
    }

    public void removeEmpleado(int id){
        empleadoDAO.removeEmpleado(id);
    }

    public void listarEmpleados(){
        empleadoDAO.listEmpleados();
    }
}