/*
 * Test4generic.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4generic
{
    public static void main(String[] args)
    {
        List<? extends Animal> animalList = new ArrayList<>();
       // Animal animal = animalList.get(0);
        List<Animal> animalSpecList = new ArrayList<>();
        animalSpecList.add(new Cat());
        animalSpecList.add(new Dog());
        animalSpecList.add(new ToyCat());
        
        animalList = animalSpecList;
        produce(animalList);
        
        
        List<? super Cat> animalList2 = new ArrayList<Animal>();
        animalList2.add(new Cat());
        animalList2.add(new ToyCat());
       
        consume(animalList2);
        
    }
    
    
    static void produce(List<? extends Animal> list)
    {
        for (Animal animal : list)
        {
            animal.name();
        }
    }
    
    static void consume(List<?> list)
    {
        for (Object animal : list)
        {
            Animal a = (Animal) animal;
            a.name();
        }
    }
    
    protected static abstract class Animal
    {
        abstract void name();
    }
    
    static class Dog extends Animal
    {
        /**
         * @see java21.com.assigments.jse11.Test4generic.Animal#name()
         */
        @Override
        void name()
        {
           System.out.println("Dog");
            
        }
        
    }
    
    static class Cat extends Animal
    {
        /**
         * @see java21.com.assigments.jse11.Test4generic.Animal#name()
         */
        @Override
        void name()
        {
            System.out.println("Cat");
            
        }
        
    }
    
    static class ToyCat extends Cat
    {
       
    }
}



/*
 * Changes:
 * $Log: $
 */