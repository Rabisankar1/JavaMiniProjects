package JavaMiniProject;
import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Search Student");
            System.out.println("4 Delete Student");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    students.add(new Student(id,name,age));
                    break;

                case 2:
                    for(Student s : students){
                        s.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();

                    for(Student s : students){
                        if(s.id == sid){
                            s.display();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    students.removeIf(s -> s.id == did);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
