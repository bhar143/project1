package gl.com;

public class HrDepartment extends SuperDepartment {
	//declare method departmentNameof return type 
	public String departmentName() {
		return"Welcome to HR Department";
	}
	public String getTodaysWork() {
		return "Fill todays timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}
}
	