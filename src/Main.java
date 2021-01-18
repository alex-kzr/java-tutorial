public class Main {
    public static void main(String[] args){
        Controller controller = new Controller();
        controller.execute();
    }
}

class Controller {
    ModelLayer modelLayer = new DBLayer();
    View view = new ConsoleView();

    void execute() {
        Student student = modelLayer.getStudent();
        view.showStudent(student);
    }
}

interface ModelLayer {
    Student getStudent();
}

class DBLayer implements ModelLayer {

    @Override
    public Student getStudent() {
        return new Student();
    }
}

class FSLayer implements ModelLayer {

    @Override
    public Student getStudent() {
        return new Student();
    }
}

class Student {
    String name = "Alex";
    int age = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface View {
    void showStudent (Student student);
}

class ConsoleView implements View {

    @Override
    public void showStudent(Student student) {
        System.out.println("Student name: " + student.getName() + " age: " + student.getAge());
    }
}