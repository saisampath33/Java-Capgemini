package OOPS;

public class Online_Learning_System {

	public static void main(String[] args) {
		
		  Instructor instructor =  new Instructor(401, "John Smith", "john@edutrack.com", "Web Development", 500, 30);

	      Candidate student =  new Candidate(301, "Alice", "alice@gmail.com", "Java Full Stack", 65);

	      PremiumStudent premiumStudent = new PremiumStudent(302, "Bob", "bob@gmail.com", "MERN Stack", 80, "Gold", 0.10, instructor);
	      
	      User[] users = { student, premiumStudent, instructor };
	      
	      for (User u : users) {
	            System.out.println();
	            u.getDetails();
	            u.showRole();
	      }
	      System.out.println();
	      PaymentMode payment = new UPIPayment(); // Upcasting
	      Enrollment enrollment = new Enrollment(premiumStudent, payment, 8000);
	      enrollment.confirmEnrollment();
	}

}

abstract class User{
	protected int userId;
	protected String name;
	protected String email;
	
	public User(int userId,String name,String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	
	void getDetails() {
		System.out.println("ID: "+userId);
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
	}
	abstract void showRole();
	
}
class Candidate extends User{
	protected String courseName;
	protected int progressPercent;
	Candidate(int userId,String name,String email,String courseName,int progressPercent){
		super(userId,name,email);
		this.courseName = courseName;
		this.progressPercent = progressPercent;
	}
	void calculateProgress() {
		System.out.println("Progress: "+progressPercent+"%");
	}
	void getDetails() {
		super.getDetails();
		System.out.println("Course: "+courseName);
		System.out.println("Progress: "+progressPercent+"%");
	}
	void showRole() {
		System.out.println("I am a Student");
	}
}

class Instructor extends User{
	String subject;
	int hourlyRate;
	int hoursTaken;
	Instructor(int userId,String name,String email,String subject,int hourlyRate,int hoursTaken){
		super(userId,name,email);
		this.subject = subject;
		this.hourlyRate = hourlyRate;
		this.hoursTaken = hoursTaken;
	}
	public double  calculateSalary() {
		return hourlyRate*hoursTaken;
	}
	void getDetails() {
		super.getDetails();
		System.out.println("Subject: "+subject);
		System.out.println("Salary: "+calculateSalary());
	}
	void showRole() {
		System.out.println("I am a instructor");
	}
}
interface PaymentMode{
	void makePayment(double amount);
}
class CardPayment implements PaymentMode{
	
	 // default access (package-private) so we should mention public keyword while overriding from interfaces
	public void makePayment(double amount) { 
		System.out.println("Payment Successful using Credit");
	}
}
class UPIPayment implements PaymentMode{
	public void makePayment(double amount) {
		System.out.println("Payment Successful using UPI");
	}
}
interface CertificateEligible{
	void generateCertificate();
}

class PremiumStudent extends Candidate implements CertificateEligible{
	private String subscriptionType;
	private double discountPercent;
	private Instructor instructor;
	PremiumStudent(int userId, String name, String email, String courseName, int progressPercent,String subscriptionType,double discountPercent,Instructor instructor) {
		super(userId, name, email, courseName, progressPercent);
		this.subscriptionType = subscriptionType;
		this.discountPercent = discountPercent;
		this.instructor = instructor;
	}
	public double calculateFinalFee(double baseFee) {
		return baseFee * (1 - discountPercent);
	}
	void getDetails(){
		super.getDetails();
        System.out.println("Subscription: " + subscriptionType);
        System.out.println("Assigned Instructor: " + instructor.name);
        System.out.println("Final Fee After Discount: " + calculateFinalFee(8000));
        generateCertificate();
	}
	void showRole() {
		System.out.println("I am Premium Student");
	}
	public void generateCertificate() {
		System.out.println("Certificate Generated: Yes");
	}
} 

class Enrollment{
	private Candidate student;
	private PaymentMode paymentMode;
	private double courseFee;
	public Enrollment(Candidate student, PaymentMode paymentMode, double courseFee) {
        this.student = student;
        this.paymentMode = paymentMode;
        this.courseFee = courseFee;
    }
	public void confirmEnrollment() {
		paymentMode.makePayment(courseFee);
		System.out.println("Enrollment Confirmed");
	}
}
