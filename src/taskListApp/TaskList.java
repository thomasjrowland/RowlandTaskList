package taskListApp;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
	
	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean quit = true;
		
		ArrayList<Task> taskList = new ArrayList<>();
		
		Task t1 = new Task("Test Name", "Test Description", "Test DueDate", true);
		taskList.add(t1);

		do {
		
		System.out.println();
		System.out.println("Welcome to your task list manager!");
		System.out.println();
		System.out.println("   1. List tasks");
		System.out.println("   2. Add task");
		System.out.println("   3. Delete task");
		System.out.println("   4. Mark task complete");
		System.out.println("   5. Quit");
		System.out.println();
		
		int menuOption = Validator.getInt(scnr, "Please make your selection: ", 1, 5);
		
		switch (menuOption) {
		
			case 1:
				do {
					TaskHelper.listTasks(taskList);
					quit = false;
				} while (!Validator.getYesNo(scnr, "Return to main? "));
				break;
				
			case 2:
				taskList.add(TaskHelper.addTask());
				quit = false;
				break;
				
			case 3:
				int removeNum = TaskHelper.deleteTask(taskList);
				
				try {
					taskList.remove(removeNum-1);
				} catch (Exception e) {
					System.out.println("Invalid Entry, returning to main menu...");
				}				
				quit = false;
				break;
				
			case 4:
				
				int completeNum = TaskHelper.markTaskComplet(taskList);
				
				try {
					taskList.get(completeNum - 1).setComplete(true);
				} catch (Exception e) {
					System.out.println("Invalid Entry, returning to main menu...");
				}				
				quit = false;
				break;
				
				
			case 5:
				quit = TaskHelper.quit();
				break;
		}
		
		} while (!quit);
		

	}

}
