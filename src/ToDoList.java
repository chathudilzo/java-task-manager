import java.util.ArrayList;

public class ToDoList {
    class Task{
        String description;
        boolean isCompleted;

        public Task(String description){
            this.description=description;
            this.isCompleted=false;
        }
    }


    private ArrayList<Task> tasks=new ArrayList<>();

    public void addTask(String description){
        tasks.add(new Task(description));
        System.out.println("Task Added "+description);
    }


    public void viewTasks(){
        System.out.println("\nYour TodDo List");
        for(int i=0;i<tasks.size();i++){
            Task task=tasks.get(i);
            System.out.println((i+1)+" ."+task.description+"["+(task.isCompleted?"Completed":"Not Completed")+"]");
        }
    }

    public void markTaskCompleted(int taskIndex){
        if(taskIndex>=0&& taskIndex<tasks.size()){
            tasks.get(taskIndex).isCompleted=true;
            System.out.println("Task marked as completed!");
        }else{
            System.out.println("Invalid Task number");
        }
    }

    public void deleteTask(int taskIndex){
        if(taskIndex>=0&& taskIndex<tasks.size()){
            tasks.remove(taskIndex);
            System.out.println("Task Deleted!");
        }else{
            System.out.println("Invalid task number!");
        }
    }
}
