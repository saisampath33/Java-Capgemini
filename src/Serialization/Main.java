package Serialization;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            // Create file
            File file = new File("sample.dat");
            if (!file.exists()) {
                file.createNewFile();
            }

            // Create students
            Student s1 = new Student(1, "Smith", 76);
            Student s2 = new Student(2, "Allen", 65);

            // Write objects into file (Serialization)
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.close();

            // Read objects from file (Deserialization)
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            while (true) {
                try {
                    Student s = (Student) ois.readObject();
                    System.out.println(s);
                } catch (EOFException e) {
                    System.out.println("end of file reached. all objects read");
                    break;
                }
            }

            ois.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

