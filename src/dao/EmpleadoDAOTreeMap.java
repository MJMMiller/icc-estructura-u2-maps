package dao;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private final Map<Empleado, Empleado> map;

    public EmpleadoDAOTreeMap() {
        this.map = new TreeMap<>();
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        map.put(empleado, empleado);
    }

    @Override
    public void removeEmpleado(int id) {
        map.remove(new Empleado(id));
    }

    @Override
    public void listEmpleados() {
        for (Empleado empleado : map.values()) {
            System.out.println(empleado);
        }
    }
}
