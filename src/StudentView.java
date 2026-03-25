public class StudentView {

    private String name;

    public StudentView(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Nombre: " + name);
    }
}