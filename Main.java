package gl.com;

public class Main {

	public static void main(String[] args) {

			AdminDepartment obj = new AdminDepartment();
			
			System.out.println(obj.departmentName());
			System.out.println(obj.getTodaysWork());
			System.out.println(obj.getWorkDeadline());
			System.out.println(obj.getTodayaholiday());
			System.out.println("                     ");
			//create HrDepartment
			HrDepartment a1 = new HrDepartment();
			System.out.println(a1.departmentName());
			System.out.println(a1.getTodaysWork());
			System.out.println(a1.doActivity());
			System.out.println(a1.getWorkDeadline());
			System.out.println(a1.getTodayaholiday());
			System.out.println("                    ");
			//create TechDepartment
			TechDepartment b1 = new TechDepartment();
			System.out.println(b1.departmentName());
			System.out.println(b1.getTodaysWork());
			System.out.println(b1.getStackinformation());
			System.out.println(b1.getWorkDeadline());
			System.out.println(b1.getTodayaholiday());
			System.out.println("                     ");
		}


	}


