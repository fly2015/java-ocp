/*
 * Student.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.modules.course.enrollment;

import java21.com.assigments.tricks.modules.course.locator.CourseFinder;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Student
{
    public static void main(String[] args)
    {
        System.out.println(CourseFinder.findAllCourse().get(0).getName());
    }
}



/*
 * Changes:
 * $Log: $
 */