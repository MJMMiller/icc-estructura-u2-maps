package dao;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> map;

    public EmpleadoDAOHashMap() {
        this.map = new HashMap<>();
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        map.put(empleado, empleado);
    }

    @Override
    public void removeEmpleado(int id) {
        Empleado temp = new Empleado(id);
        map.remove(temp);
    }

    @Override
    public void listEmpleados() {
        for (Empleado empleado : map.values()) {
            System.out.println(empleado);
        }
    }
}
