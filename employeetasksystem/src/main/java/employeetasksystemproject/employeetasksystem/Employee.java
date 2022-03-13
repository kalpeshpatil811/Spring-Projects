package employeetasksystemproject.employeetasksystem;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String department;
	private String designation;
	private String password;
	private Employee superior;
	private List<Task> taskList;
	private List<Attendance> attendanceList;
	private Rating rating;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String department, String designation, String password,
			Employee superior, List<Task> taskList, List<Attendance> attendanceList, Rating rating) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.designation = designation;
		this.password = password;
		this.superior = superior;
		this.taskList = taskList;
		this.attendanceList = attendanceList;
		this.rating = rating;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getSuperior() {
		return superior;
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public List<Attendance> getAttendanceList() {
		return attendanceList;
	}

	public void setAttendanceList(List<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

}