/*
 * ClassPreamble.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch13_annotation;

import java.lang.annotation.Documented;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
@Documented
public abstract @interface ClassPreamble
{
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}

/*
 * Changes:
 * $Log: $
 */