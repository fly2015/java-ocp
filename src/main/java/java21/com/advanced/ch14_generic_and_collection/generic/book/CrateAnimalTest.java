/*
 * CrateAnimalTest.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.book;

import java21.com.advanced.ch14_generic_and_collection.generic.sdo.Animal;
import java21.com.advanced.ch14_generic_and_collection.generic.sdo.Dog;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CrateAnimalTest
{
    public static void main(String[] args)
    {
        // Case 1
        CrateAnimal<Animal> crateAnimal1 = new CrateAnimal<Animal>();
        crateAnimal1.packPackage(new Dog());
        crateAnimal1.packPackage(new Animal());
        Animal emptyPackage = crateAnimal1.emptyPackage();
        
        // Case 2
        CrateAnimal<Dog> crateAnimal2 = new CrateAnimal<Dog>();
        crateAnimal2.packPackage(new Dog());
        Dog emptyPackage2 = crateAnimal2.emptyPackage();
        
        // Case 3
        CrateAnimal<?> crateAnimal3 = new CrateAnimal<Animal>();
        //crateAnimal3.packPackage(new Animal()); //-> DO NOT COMPILE
        Animal emptyPackage3 = crateAnimal3.emptyPackage();
        
        // Case 4
        CrateAnimal<? extends Animal> crateAnimal4 = new CrateAnimal<Dog>();
        //crateAnimal4.packPackage(new Animal()); //-> DO NOT COMPILE
        Animal emptyPackage4 = crateAnimal4.emptyPackage();
        
        // Case 5
        CrateAnimal<? super Dog> crateAnimal5 = new CrateAnimal<Dog>();
        //crateAnimal5.packPackage(new Animal()); //-> DO NOT COMPILE
        Animal emptyPackage5 = crateAnimal5.emptyPackage();
        
        // Case 6
        CrateAnimal<? super Dog> crateAnimal6 = new CrateAnimal<Dog>();
        crateAnimal5.packPackage(new Dog()); //-> OK lowest type is a upper bound can accepted
        Animal emptyPackage6 = crateAnimal6.emptyPackage();
    }
}



/*
 * Changes:
 * $Log: $
 */