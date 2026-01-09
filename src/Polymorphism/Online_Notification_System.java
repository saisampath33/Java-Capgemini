package Polymorphism;

public class Online_Notification_System {
	public static void main(String[] args) {
		Notification n = new EmailNotification();
		Notification n1 = new SMSNotification();
		Notification n2 = new PushNotification();
		n.send();
		n1.send();
		n2.send();
	}
}
class Notification{
	void send() {
		System.out.println("Sending Email Notification");
	}
}
class EmailNotification extends Notification{
	void send() {
		System.out.println("Notification from Email");
	}
}
class SMSNotification extends Notification{
	void send() {
		System.out.println("Notification from SMS");
	}
}
class PushNotification extends Notification{
	void send() {
		System.out.println("Pushed Notification");
	}
};
