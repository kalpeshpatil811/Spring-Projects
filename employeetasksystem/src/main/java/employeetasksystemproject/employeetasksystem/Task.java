package employeetasksystemproject.employeetasksystem;

public class Task {

	private int taskId;
	private String taskName;
	private String taskDescription;
	private String dateOfAllocation;
	private String deadline;
	private Employee allocatedTo;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(int taskId, String taskName, String taskDescription, String dateOfAllocation, String deadline,
			Employee allocatedTo) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.dateOfAllocation = dateOfAllocation;
		this.deadline = deadline;
		this.allocatedTo = allocatedTo;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getDateOfAllocation() {
		return dateOfAllocation;
	}

	public void setDateOfAllocation(String dateOfAllocation) {
		this.dateOfAllocation = dateOfAllocation;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public Employee getAllocatedTo() {
		return allocatedTo;
	}

	public void setAllocatedTo(Employee allocatedTo) {
		this.allocatedTo = allocatedTo;
	}

}