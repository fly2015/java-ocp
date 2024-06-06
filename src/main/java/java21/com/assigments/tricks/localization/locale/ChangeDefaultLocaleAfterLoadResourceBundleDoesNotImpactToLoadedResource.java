/*
 * ChangeDefaultLocaleAfterLoadResourceBundleDoesNotImpactToLoadedResource.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.locale;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ChangeDefaultLocaleAfterLoadResourceBundleDoesNotImpactToLoadedResource
{
    //  Changing the default locale of the application does not change the locale associated with the resource bundle rbs. 
    // The value of the key "greeting" from this resource bundle is printed one more time.
    
    public static void main(String[] args) {
        Locale norLocale = new Locale("no", "NO");
        ResourceBundle rbs = ResourceBundle.getBundle("MyResources", norLocale);
        System.out.println(rbs.getString("greeting"));// Long time no see! 
        Locale.setDefault(norLocale); // No impact to rbs
        System.out.println(rbs.getString("greeting"));//Long time no see!
      }
}



/*
 * Changes:
 * $Log: $
 */