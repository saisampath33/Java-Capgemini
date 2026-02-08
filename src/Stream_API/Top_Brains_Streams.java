package Stream_API;
import java.util.*; 
public class Top_Brains_Streams{
    public static void main(String[] args){
        ArrayList<Product> al = new ArrayList<>();
        al.add(new Product("Milk",800,"Dairy"));
        al.add(new Product("Butter",1200,"Dairy"));
        al.add(new Product("Tomato",1600,"Groceries"));
        al.add(new Product("Onion",800,"Groceries"));
        al.add(new Product("Paneer",2000,"Dairy"));
        al.stream()
            .filter(p->p.price>1000)
            .forEach(System.out::println);
    }
}

class Product{
    String name;
    double price;
    String category;
    Product(String name,double price,String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String toString(){
        return name.toUpperCase()+" "+(int)price+" "+category;
    }
}

