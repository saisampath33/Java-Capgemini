package Encapsulation;

class Credentials{
	private String Username;
	private String pwd;
	public void SetPwd(String Username,String pwd) {
		if(Username.length() > 2 && pwd.length() > 2) {
			this.Username = Username;
			this.pwd = pwd;
		}
	}
	public void getPwd(){
		System.out.println("Username is: "+Username+" and pwd is "+pwd);
	}
}
public class SocialMedia {
	public static void main(String[] args) {
		Credentials obj = new Credentials();
		obj.SetPwd("Sampath", "Sai");
		obj.getPwd();
	}

}
