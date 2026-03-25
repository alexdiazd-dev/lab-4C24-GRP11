public class StudentModel {

    private String name;

    public StudentModel(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Nombre: " + name);
    }
}