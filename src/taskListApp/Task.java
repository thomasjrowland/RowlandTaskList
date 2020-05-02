package taskListApp;

public class Task {
	
	private String name;
	private String description;
	private String dueDate;
	private boolean taskComplete;
	
	//constructors

	
	public Task() {
	}
	
	public Task(String name) {
		this.name = name;
	}
	
	public Task(String name, String description) {
		this.name = name;
		this.description = description;
	}	
	
	public Task(String name, String description, String dueDate) {
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
	}
	
	public Task(String name, String description, String dueDate, boolean taskComplete) {
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.taskComplete = taskComplete;
	}

	//getters
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getDueDate() {
		return this.dueDate;
	}
	
	public boolean getTaskComplete() {
		return this.taskComplete;
	}
	
	//setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDueDate(String date) {
		this.dueDate = date;
	}
	
	public void setComplete(boolean taskComplete) {
		this.taskComplete = taskComplete;
	}
	

}
