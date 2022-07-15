import java.util.ArrayList;

class Course {
	String name;
	String code;
	int max;
	int min;
	ArrayList<Professor> professors;
	ArrayList<Enroll> enrollments;

	Course(String name, String code, int max, int min, //
			ArrayList<Professor> professors) {
		this.name = name;
		this.code = code;
		this.max = max;
		this.min = min;
		this.enrollments = new ArrayList<Enroll>();
		for (Professor p : professors) {
			try {
				if (!(professors instanceof ArrayList)) {
					Exception e = new Exception("Invalid Professor");
					throw e;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			this.professors.add(p);
		}
	}

	Course(String name, String code, int max, int min, //
			Professor professor) {
		this.name = name;
		this.code = code;
		this.max = max;
		this.min = min;
		this.enrollments = new ArrayList<Enroll>();
		try {
			if (!(professor instanceof Professor)) {
				Exception e = new Exception("Invalid Professor");
				throw e;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.professors.add(professor);
	}

	void add_professor(Professor professor) {
		try {
			if (!(professor instanceof Professor)) {
				Exception e = new Exception("Invalid Professor");
				throw e;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.professors.add(professor);
	}

	void add_enrollment(Enroll enroll){
		try{
			if(!(enroll instanceof Enroll)){
				Exception e = new Exception("Invalid Enrollment");
				throw e;
			}
			if(enrollments.size()==max){
				Exception e = new Exception("Course is full");
				throw e;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		enrollments.add(enroll);
	}


	Boolean is_cancelled(){
		return enrollments.size()<=min;
	}
}
