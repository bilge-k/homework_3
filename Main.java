package odev3;

public class Main {

	public static void main(String[] args) {
		User user =new User();
		user.setName("BİLGE");
		Student student =new Student();
		student.setPraticipationRate(38);
		Instructor instructor =new Instructor();
		instructor.setDownlodads("java");
		
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
				
				
				
				
				

	}

}
