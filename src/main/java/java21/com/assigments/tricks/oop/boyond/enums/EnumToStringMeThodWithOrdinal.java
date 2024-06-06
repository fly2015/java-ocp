/*
 * EnumToString.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.enums;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EnumToStringMeThodWithOrdinal
{
    public static void main(String[] args) {
        var at = AccountType.valueOf("FD");
        System.out.println(at.ordinal()+" "+at);
    }
}
enum AccountType{
    CHECKING("Checking account"), SAVINGS("Savings account"),
    FD("Fixed Deposit");
    
    private String desc;
    AccountType(String desc){
        this.desc =  desc;
    }
    
    @Override
    public String toString(){
        return "Acct type:"+super.toString();
    }
    
}



/*
 * Changes:
 * $Log: $
 */