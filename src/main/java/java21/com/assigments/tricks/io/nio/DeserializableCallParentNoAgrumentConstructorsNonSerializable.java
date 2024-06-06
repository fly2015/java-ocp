/*
 * DeserializableCallTheFirstParentConstructorNonSerializeble.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class DeserializableCallParentNoAgrumentConstructorsNonSerializable
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Child8 child8 = new Child8();
        System.out.println(child8.x);// Child8
        System.out.println(child8.y);// Child8
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("./Child8.dat")));)
        {
            objectOutputStream.writeObject(child8);
        }
        
        System.out.println("Deserializable");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("./Child8.dat")));)
        {
            Child8 child82 =  (Child8)objectInputStream.readObject();
            System.out.println(child82.x);//Parent8X
            System.out.println(child82.y);//
        }
    }
}
class ParentX
{
    protected String y;
    protected String x;
    public ParentX()
    {
        this.y = "ParentXY";
        this.x = "ParentXX";
    }
}
class Parent8 extends ParentX
{
    protected String x; // load the nearest parent
    
    public Parent8()
    {
        // System.out.println("Parent8");
        this.x = "Parent8X";
    }
     
}

class Child8 extends Parent8 implements Serializable
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    public Child8()
    {
        this.x = "Child8X";
        this.y = "Child8Y";
    }
}

/*
 * Changes:
 * $Log: $
 */