/*
 * InheritAnotationDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch13_annotation;

import java.lang.annotation.Inherited;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InheritAnotationDemo
{

}

//Vertebrate.java
@Inherited 
@interface Vertebrate {}
//Mammal.java
@Vertebrate 
class Mammal {}
//Dolphin.java
class Dolphin extends Mammal {}


/*
 * Changes:
 * $Log: $
 */