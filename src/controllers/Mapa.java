package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap() {

        System.out.println("\n---------------- Ejercicio 1 ----------------");
        // Mapa de capitales: String y Strng
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru", "Lima");
        capitales.put("Colombia", "Bogota");

        // for each
        System.out.println("\nMapa de capitales: ");
        for (String pais : capitales.keySet()) {
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        }

        // Ejemplo acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println("\nLa capital de Ecuador es: " + capital);

        // Mapa de empleados: Integer y Empleado
        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Disenador"));
        // Se eliminó la inserción duplicada con clave 1

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Mapa de empleado, con Empleado y Integer
        Map<Empleado, Integer> empleadoDos = new HashMap<>();

        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Tester");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadoDos.put(emp1, 1000);
        empleadoDos.put(emp2, 1200);
        empleadoDos.put(emp3, 1500);
        empleadoDos.put(emp4, 2000);

        for (Map.Entry<Empleado, Integer> entry : empleadoDos.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public void ejemploConTreeMap() {

        System.out.println("\n---------------- Ejercicio 2 ----------------");
        // Mapa de personas: Integer y String
        Map<Integer, String> personas = new TreeMap<>();
        personas.put(1, "Juan");
        personas.put(2, "Maria");
        personas.put(3, "Pedro");

        // for each
        System.out.println("\nPersonas:");
        for (Integer id : personas.keySet()) {
            System.out.println("ID: " + id + ", Nombre: " + personas.get(id));
        }

        // Ejemplo de acceso directo
        String nombre = personas.get(1);
        System.out.println("\nEl nombre de la persona con ID 1 es: " + nombre);

        // Mapa de empleado, con Empleado y Integer
        // Asegúrate de que Empleado implemente Comparable
        Map<Empleado, Integer> empleadoDos = new TreeMap<>();

        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Tester");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadoDos.put(emp1, 1000);
        empleadoDos.put(emp2, 1200);
        empleadoDos.put(emp3, 1500);
        empleadoDos.put(emp4, 2000);

        for (Map.Entry<Empleado, Integer> entry : empleadoDos.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public void ejemploConLinkedHashMap() {

        System.out.println("\n---------------- Ejercicio 3 ----------------");
        // Mapa de productos: String y Integer
        Map<String, Integer> productos = new LinkedHashMap<>();
        productos.put("Manzana", 100);
        productos.put("Pera", 80);
        productos.put("Banana", 50);
        productos.put("Naranja", 60);
        productos.put("Kiwi", 70);

        // for each
        System.out.println("\nProductos y precios:");
        for (String producto : productos.keySet()) {
            System.out.println("El precio de " + producto + " es " + productos.get(producto) + " pesos");
        }

        // Ejemplo de acceso directo
        Integer precioManzana = productos.get("Manzana");
        System.out.println("\nEl precio de la Manzana es: " + precioManzana);
    }
}
