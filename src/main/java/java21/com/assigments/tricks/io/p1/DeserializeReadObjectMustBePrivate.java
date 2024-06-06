/*
 * DeserializeCallNoParamParentConstructor.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DeserializeReadObjectMustBePrivate
{
    public static void main(String args[])
            throws IOException, ClassNotFoundException {
          try (FileOutputStream outputFile = new FileOutputStream("storage.dat");
               ObjectOutputStream outputStream = new ObjectOutputStream(outputFile)) {
            GraduateStudent stud1 = new GraduateStudent("Aesop", 100, 1);
            System.out.println(stud1);
            outputStream.writeObject(stud1);
          }

          System.out.println("Deserialize...");
          try (FileInputStream inputFile = new FileInputStream("storage.dat");
               ObjectInputStream inputStream = new ObjectInputStream(inputFile)) {
            GraduateStudent stud2 = (GraduateStudent) inputStream.readObject();
            System.out.println(stud2);
          }
        }
}

 class Person {
    protected transient String name;
    public Person() { 
        this.name = "NoName"; 
        System.out.println("Construct Person");
    }
    public Person(String name) { this.name = name; }
  }

 class Student extends Person {
     protected long studNum;
     public Student() {
         System.out.println("Construct Student");
     }
     public Student(String name, long studNum) {
       super(name);
       this.studNum = studNum;
     }
   }
 
  class GraduateStudent extends Student implements Serializable {
   /** serialVersionUID */
    private static final long serialVersionUID = 1L;
private int year;
   public GraduateStudent(String name, long studNum, int year) {
     super(name, studNum);
     this.year = year;
   }

   public String toString() {
     return "(" + name + ", " + studNum + ", " + year  + ")";
   }
   
   private void readObject(ObjectInputStream ois)
           throws IOException, ClassNotFoundException {
         ois.defaultReadObject();
         this.name = "NewName";
         this.studNum = 200;
         this.year = 2;
       }
 }

/*
 * Changes:
 * $Log: $
 */