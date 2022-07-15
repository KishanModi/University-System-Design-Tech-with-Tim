class Enroll {
	String date;
	int grade;
	Student student;
	Course course;

	Enroll(Student student, Course course, String date, int grade) {
		try{
			if(!(student instanceof Student)){
				Exception e = new Exception("Invalid Student");
				throw e;
			}
			if(!(course instanceof Course)){
				Exception e = new Exception("Invalid Course");
				throw e;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		this.student = student;
		this.course = course;
		this.date = "Now";
		this.grade = -1;
	}

	void set_grade(int grade) {
		this.grade = grade;
	}
}
