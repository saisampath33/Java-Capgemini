package ObjectClass;


class Employee implements Cloneable {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // creates copy of object
    }
}


public class Clone_Method {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee s1 = new Employee(33,"Sampath");
		Employee s2 = (Employee) s1.clone();
		System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);

	}

}
