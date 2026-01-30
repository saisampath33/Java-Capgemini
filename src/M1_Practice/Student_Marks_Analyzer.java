package M1_Practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Student_Marks_Analyzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		System.out.println("Enter number of students: ");
		int cnt = sc.nextInt();
		for(int i=0;i<cnt;i++) {
			System.out.println("Enter Student ID: ");
			int id = sc.nextInt();
			System.out.println("Enter Student Name: ");
			String name = sc.next();
			System.out.println("Enter Marks: ");
			int marks = sc.nextInt();
			
			list.add(new Student(id,name,marks));
		}
		StudentUtility u = new StudentUtility();
		u.setstudentList(list);
		double avg = u.averageMarks(u.convertToStream());
		System.out.println("Average is: "+avg);
		Student top = u.findTopper(u.convertToStream());
		System.out.println("Top Scorer");
		System.out.println(top.getName() + "-"+ top.getMarks());
		System.out.println("\nStudents Sorted by Marks:");
        u.sortByMarks(u.convertToStream())
            .forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));

		
	}

}
class Student{
	private int id;
	private String name;
	private int marks;
	public Student(int id,String name,int marks) {
		this.id = id;
		this.name= name;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public String getName(){
		return name;
	}
	public int getMarks() {
		return marks;
	}
}
class StudentUtility{
	private List<Student> studentList;
	
	public void setstudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public List<Student> getstudentList(){
		return studentList;
	}
	
	public Stream<Student> convertToStream(){
		return studentList.stream();
	}
	
	public double averageMarks(Stream<Student> stream1) {
		return stream1.mapToInt(Student::getMarks)
						.average()
						.orElse(0);
	}
	public Student findTopper(Stream<Student> stream1) {
		return stream1.max(Comparator.comparingInt(Student::getMarks))
				.orElse(null);
	}
	public List<Student> sortByMarks(Stream<Student> stream) {
        return stream.sorted(Comparator.comparingInt(Student::getMarks))
                     .collect(Collectors.toList());
    }
}
