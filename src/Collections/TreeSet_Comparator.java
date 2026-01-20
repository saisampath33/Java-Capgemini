package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Comparator {

	public static void main(String[] args) {
		
		// pass comparator object to TreeSet
        TreeSet<Vehicle> ts = new TreeSet<>(new VehicleComparator());
		ts.add(new Vehicle(12,"Suziki"));
		ts.add(new Vehicle(11,"Honda"));
		ts.add(new Vehicle(2,"BMW"));
		ts.add(new Vehicle(1,"Audi"));
		System.out.println(ts);
		
		
	}

}

class VehicleComparator implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		 // sorting by name
        int res = o1.name.compareTo(o2.name);

        // if names are same, then sort by id (to avoid duplicates removal)
        // if return 0 both names are equal
        // < 0 (negative) o1 is smaller than o2
        // > 0 (positive) o1 is greater than o2
        
        if (res == 0) {
            return o1.id - o2.id;
        }

        return res;
	}
	
}
class Vehicle{
	int id;
	String name;
	Vehicle(){
		
	}
	Vehicle(int id,String name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return name+":"+id;
	}
}
