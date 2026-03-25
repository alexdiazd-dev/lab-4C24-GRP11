public class StudentController {
    public static void main(String[] args) {
        System.out.println("Controlador de estudiantes");
        greetStudent("Alex");
    }

    // Método simple para saludar a un estudiante
    public static void greetStudent(String name) {
        System.out.println("¡Hola, " + name + "! Bienvenido al sistema de estudiantes.");
    }
}