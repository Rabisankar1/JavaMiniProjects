package JavaMiniProject;
import java.util.*;
public class TodoApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while(true){

            System.out.println("\n1 Add Task");
            System.out.println("2 View Tasks");
            System.out.println("3 Remove Task");
            System.out.println("4 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    break;

                case 2:
                    for(int i=0;i<tasks.size();i++){
                        System.out.println((i+1) + " " + tasks.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter task number: ");
                    int num = sc.nextInt();
                    tasks.remove(num-1);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
