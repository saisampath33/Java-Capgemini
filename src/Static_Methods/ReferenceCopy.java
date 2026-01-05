package Static_Methods;

class Animal{
	int num;
	Animal(int num){
		this.num = num;
	}
}
public class ReferenceCopy {
	public static void main(String[] args) {
		Animal obj = new Animal(1);
		System.out.println(obj.num);
		Animal obj2 = obj;
		obj2.num++;
		System.out.println(obj2.num);
		
	}
}
