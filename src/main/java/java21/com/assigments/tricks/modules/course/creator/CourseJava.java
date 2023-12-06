/*
 * CourseJava.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.modules.course.creator;

import java21.com.assigments.tricks.modules.course.api.ICourseFacade;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CourseJava implements ICourseFacade
{

    /**
     * @see java21.com.assigments.tricks.modules.course.api.ICourseFacade#getName()
     */
    @Override
    public String getName()
    {
        // TODO Auto-generated method stub
        return "Java";
    }

    /**
     * @see java21.com.assigments.tricks.modules.course.api.ICourseFacade#getSubject()
     */
    @Override
    public String getSubject()
    {
        // TODO Auto-generated method stub
        return "Java";
    }

    /**
     * @see java21.com.assigments.tricks.modules.course.api.ICourseFacade#getHour()
     */
    @Override
    public int getHour()
    {
        // TODO Auto-generated method stub
        return 10;
    }

}



/*
 * Changes:
 * $Log: $
 */