/*
 * CourseFinder.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.modules.course.locator;

import java.util.List;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

import java21.com.assigments.tricks.modules.course.api.ICourseFacade;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CourseFinder
{
    public static List<ICourseFacade> findAllCourse()
    {
       return ServiceLoader.load(ICourseFacade.class).stream().map(Provider<ICourseFacade>::get).toList();
    }
}



/*
 * Changes:
 * $Log: $
 */