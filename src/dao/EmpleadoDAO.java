package dao;

import models.Empleado;

public interface EmpleadoDAO {

    void addEmpleado(Empleado empleado);
    void removeEmpleado(int id);
    void listEmpleados();
}