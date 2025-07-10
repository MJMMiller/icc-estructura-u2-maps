import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;
import dao.EmpleadoDAO;
import dao.EmpleadoDAOHashMap;
import dao.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        System.out.println("Nombre: Mateo Miller");
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoController empleadoController = new EmpleadoController(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoController empleadoController2 = new EmpleadoController(empleadoDAOTree);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoController.addEmpleado(emp1);
        empleadoController.addEmpleado(emp2);
        empleadoController.addEmpleado(emp3);
        empleadoController.addEmpleado(emp4);
        empleadoController.addEmpleado(emp5);

        empleadoController2.addEmpleado(emp1);
        empleadoController2.addEmpleado(emp2);
        empleadoController2.addEmpleado(emp3);
        empleadoController2.addEmpleado(emp4);
        empleadoController2.addEmpleado(emp5);

        System.out.println("\n---------------- Ejercicio con DAO ---------------- ");
        System.out.println("-- HashMap");
        empleadoController.listarEmpleados();
        System.out.println("\n-- TreeMap");
        empleadoController.listarEmpleados();
        
    }

    private static void runMapExample() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap(); // ENTRA EN CUALQUIER ORDEN
        mapa.ejemploConTreeMap(); // CLAVE DEBE SER VARIABLE PRIMITIVA - ORDENA EN ORDEN NATURAL
        mapa.ejemploConLinkedHashMap(); // GUARDA CONTIGUAMENTE
    }

    private static void runEjercicios() {
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("\n---------------- Ejercicio con Anagrama ---------------- ");
        System.out.println("\nPalabras: listen / silent: " + ejercicios.areAnagrams("listen", "silent"));
        System.out.println("Palabras: hello / bello: " + ejercicios.areAnagrams("hello", "bello"));
        System.out.println("Palabras: triangle / integral: " + ejercicios.areAnagrams("triangle", "integral"));

        System.out.println("\n---------------- Ejercicio sumaDos ---------------- ");
        int[] numsA = {9, 2, 3, 6};

        int objetivoA = 5;
        int[] resA = ejercicios.sumatoriaDeDos(numsA, objetivoA);

        if (resA != null) {
            System.out.println("\nNumeros: [9,2,3,6] - Objetivo: 5 : " + "[" + resA[0] + "," + resA[1] + "]");
        } else {
            System.out.println("Numeros: [9,2,3,6] - Objetivo: 5 : null");
        }

        int objetivoB = 10;
        int[] resB = ejercicios.sumatoriaDeDos(numsA, objetivoB);

        if (resB != null) {
            System.out.println("Numeros: [9,2,3,6] - Objetivo: 10 : " + "[" + resB[0] + "," + resB[1] + "]");
        } else {
            System.out.println("Numeros: [9,2,3,6] - Objetivo: 10 : null");
        }

        System.out.println("\n---------------- Ejercicio contarCaracteres ---------------- ");
        System.out.print("\nPalabra a contar (hola): ");
        ejercicios.contarCaracteres("hola");

        System.out.println("\n---------------- Ejercicio con Anagrama ---------------- ");
        System.out.println("\nPalabras: roma / amor: " + ejercicios.sonAnagramas("roma", "amor"));
    }
}
