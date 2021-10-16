package gl.com;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return"Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "Commplete your documents submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}

