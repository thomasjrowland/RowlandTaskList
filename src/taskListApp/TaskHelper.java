package taskListApp;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskHelper {
	
	private static Scanner scnr = new Scanner(System.in);
	
	
	public static void listTasks(ArrayList<Task> taskList) {
		
		System.out.println();
		
			int i = 1;
			for (Task t : taskList) {
				System.out.printf("%d.\tNAME: %s\n\tDESCRIPTION: %s\n\tDUE: %s \n\tCOMPLETE? ", i, t.getName(), t.getDescription(), t.getDueDate());
				System.out.println(t.getTaskComplete());
				System.out.println();
			
				i++;
			}
				
	}
	
	
	
	@SuppressWarnings("deprecation")
	public static Task addTask() {
		
		Task t = new Task();
		
		t.setName(Validator.getString(scnr, "Who is handling this task? "));
		t.setDescription(Validator.getString(scnr, "Describe the task: "));
		t.setDueDate(Validator.getDate(scnr, "When is the task due? (MM/DD/YYYY) ").toGMTString());
				
		return t;
		
		
	}
	
	
	
	public static int deleteTask(ArrayList<Task> taskList) {
		
		listTasks(taskList);
		System.out.println();		
		int taskNumber = Validator.getInt(scnr, "Which task would you like to delete? ");
		return taskNumber;
			
	}
	
	
	
	public static int markTaskComplet(ArrayList<Task> taskList) {
		
		listTasks(taskList);
		System.out.println();		
		int taskNumber = Validator.getInt(scnr, "Which task would you like to mark as done? ");
		return taskNumber;
		
	}
	
	

	public static boolean quit() {
		
		return Validator.getYesNo(scnr, "Are you sure you'd like to quit? ");
		
		
	}

}
