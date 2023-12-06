/*
 * ResultSetUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ResultSetUsage
{
    public static void main(String[] args) throws SQLException
    {
        Connection conn = null;
        PreparedStatement prepareStatement = conn.prepareStatement("");
        ResultSet rs = prepareStatement.executeQuery();
        rs.getString(1);//Collum name
        rs.getString("column label");
        
        prepareStatement.execute();
        prepareStatement.getUpdateCount();
        prepareStatement.getResultSet();
    }
}



/*
 * Changes:
 * $Log: $
 */