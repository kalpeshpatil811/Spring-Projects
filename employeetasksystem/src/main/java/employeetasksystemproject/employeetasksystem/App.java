package employeetasksystemproject.employeetasksystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		System.out.println("=========================================");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Employee Department: " + employee.getDepartment());
		System.out.println("Employee Designation: " + employee.getDesignation());
		System.out.println("Employee Password: " + employee.getPassword());
		System.out.println();
		System.out.println("Superior Id: " + employee.getSuperior().getEmployeeId());
		System.out.println("Superior Name: " + employee.getSuperior().getEmployeeName());
		System.out.println("Superior Department: " + employee.getSuperior().getDepartment());
		System.out.println("Superior Designation: " + employee.getSuperior().getDesignation());
		System.out.println("Superior Password: " + employee.getSuperior().getPassword());
		System.out.println("Superior Rating: " + employee.getSuperior().getRating());
		System.out.println("=========================================");
		System.out.println();

		for (Task t : employee.getTaskList()) {
			System.out.println("Task Id: " + t.getTaskId());
			System.out.println("Task Name: " + t.getTaskName());
			System.out.println("Task Description: " + t.getTaskDescription());
			System.out.println("Date Of Allocation: " + t.getDateOfAllocation());
			System.out.println("Deadline: " + t.getDeadline());
			System.out.println("Allocated To: " + t.getAllocatedTo().getEmployeeName());
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();

		for (Attendance a : employee.getAttendanceList()) {
			System.out.println("Attendance Id: " + a.getAttendanceId());
			System.out.println("Attendance Date: " + a.getAttendanceDate());
			System.out.println("Attendance Status: " + a.getStatus());
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();

		System.out.println("Employee Rating: " + employee.getRating());
		System.out.println("=========================================");
	}
}