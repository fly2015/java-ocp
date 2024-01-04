/*
 * PracticeUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.localization;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RBPracticeUsage
{
    private static final Logger logger = Logger.getLogger(RBPracticeUsage.class.getName());
    public static void main(String[] args)
    {
        final Instant instant = LocalDate.of(2023, 12, 10).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        logger.info(instant.toString());
        logger.info(instant.plus(10, ChronoUnit.DAYS).toString());// days and smaller
        logger.info(instant.plus(10, ChronoUnit.MINUTES).toString());
        
        logger.info(Period.ofDays(1).plus(Period.ofDays(10)).toString());//no chaining, days and greater
        logger.info(Duration.ofHours(10).plusHours(10).toString());// no chaining, days and smaller
        
        Locale.setDefault(new Locale.Builder().setLanguage("fr").build());
        
        final URL resource = RBPracticeUsage.class.getResource("");
        final Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        //final Locale locale = new Locale.Builder().setLanguage("en").build();
        final URLClassLoader loader = new URLClassLoader(new URL[] {resource});


        ResourceBundle rs1 = ResourceBundle.getBundle("Zoo", locale, loader);
        System.out.println(rs1.getObject("unknown"));
        System.out.println(rs1.getObject("hello"));
        System.out.println(rs1.getObject("hello2"));
        
        // Will use default
        final Locale locale1 = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
        final URLClassLoader loader1 = new URLClassLoader(new URL[] {resource});
        ResourceBundle rs2 = ResourceBundle.getBundle("Zoo", locale1, loader1);
        System.out.println(rs1.getObject("unknown"));
        System.out.println(rs2.getObject("hello"));
       // System.out.println(rs2.getObject("hello2")); Exception
        
        
        final DateTimeFormatter ofLocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(LocalDate.now().format(ofLocalizedDate));
        System.out.println(ofLocalizedDate.format(LocalDate.now()));
        System.out.println(ofLocalizedDate.withLocale(new Locale("en")).format(LocalDate.now()));
        
        
        
        Locale.setDefault(Category.DISPLAY, new Locale.Builder().setRegion("us").build());
    }
}



/*
 * Changes:
 * $Log: $
 */