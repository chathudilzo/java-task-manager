import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    ToDoList todoList=new ToDoList();

    while(true){
        System.out.println("\n---ToDo List Menu---");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete task");;
        System.out.println("5. Exit");

        int choice=scanner.nextInt();

        scanner.nextLine();

        switch (choice){
            case 1:
                System.out.print("Enter task description");
                String description=scanner.nextLine();
                todoList.addTask(description);
                break;
            case 2:
                System.out.print("Todo List");
                todoList.viewTasks();
                break;
            case 3:
                System.out.print("Enter index to complete");
                int taskIndex= scanner.nextInt();
                todoList.markTaskCompleted(taskIndex);
                break;
            case 4:
                System.out.print("Enter task number you want to delete");
                taskIndex=scanner.nextInt()-1;
                todoList.deleteTask(taskIndex);
                break;
            case 5:
                System.out.print("Good Bye!");
                scanner.close();
                return;

            default:
                System.out.print("Invalid option, Please try again!");
        }
    }

    }
}