package Encapsulation;

public class EncapsulationStudentMarks {

	static class Student {
		private int marks;

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			if (marks < 0 || marks > 100) {
				System.out.println("Invalid marks");
				return;
			} 
				this.marks = marks;
			

		}

		public static void main(String[] args) {
			Student s = new Student();
			s.setMarks(789);
			System.out.println(s.getMarks());

		}

	}

}
