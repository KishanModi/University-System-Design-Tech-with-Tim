import java.util.ArrayList;

class Professor extends Person{

	float Salary;
	Boolean got_raise = false;
	ArrayList<Course> Courses;
	Professor(String first,String last, String dob,String phone,//
			Address address, float Salary){
		super(first,last,dob,phone,address);
		this.Salary = Salary;
		Courses = new ArrayList<Course>();
	}

	Professor(String first,String last, String dob,String phone,//
			ArrayList<Address> addresses, float Salary){
		super(first,last,dob,phone,addresses);
		this.Salary = Salary;
		Courses = new ArrayList<Course>();
	}

	void check_for_raise(){
		if(Courses.size()>=4 && !got_raise){
			Salary+=20000;
			got_raise = true;
		}
	}

	void addCourse(Course course){
		try{
			if(!(course instanceof Course)){
				Exception e = new Exception("Invalid Course");
				throw e;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		Courses.add(course);
	}
}
