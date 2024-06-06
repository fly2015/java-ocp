/*
 * PracticalUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Types;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class JDBCPracticalUsage
{
    public static void main(String[] args)
    {
        final Connection conn = getConnection();
        setUpDataBase(conn);
       //selectWithStatement(conn);
       //selectWithStatementUsingExecute(conn);
       //updateWithStatementUsingExecute(conn);
       //selectWithPrepareStatement(conn);
        //updateWithPrepareStatement(conn);
        //selectCount(conn);
        //callStoreProdedureWithoutParam(conn);
        //callStoreProdedureWithInParam(conn);
        //callStoreProdedureWithInOutParam(conn);
        //callStoreProdedureWithOutParam(conn);
       // insertRecordWithTransaction(conn);
        //addBatchWithStatement(conn);
        addBatchWithPrepareStatement(conn);
        try
        {
            if(!conn.isClosed())
            {
                conn.close();
            }
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void addBatchWithPrepareStatement(Connection conn)
    {
        String sql = "INSERT INTO names VALUES (?, ?, ?)";
        try(PreparedStatement ps = conn.prepareStatement(sql);)
        {
            
            for (int i=8; i <11; i++)
            {
                ps.setInt(1, i);
                ps.setInt(2, 2);
                ps.setString(3, "Hien " + i);
                
                ps.addBatch();
            }
           // ps.addBatch(sql1);
            //ps.addBatch(sql2);
            
            final int[] executeBatch = ps.executeBatch();
            System.out.println(executeBatch.length);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        selectWithStatement(conn);
        
    }

    private static void addBatchWithStatement(Connection conn)
    {
        String sql1 = "INSERT INTO names VALUES (8, 2, 'H')";
        String sql2 = "INSERT INTO names VALUES (9, 2, 'Y')";
        try(Statement ps = conn.createStatement();)
        {
            
            
            ps.addBatch(sql1);
            ps.addBatch(sql2);
            
            final int[] executeBatch = ps.executeBatch();
            System.out.println(executeBatch.length);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        selectWithStatement(conn);
    }

    private static void insertRecordWithTransaction(Connection conn)
    {
        String sql = "INSERT INTO names VALUES (?, ?, ?)";
        try(PreparedStatement ps = conn.prepareStatement(sql);)
        {
            conn.setAutoCommit(false);
            ps.setInt(1, 6);
            ps.setInt(2, 2);
            ps.setString(3, "Hien");
            
            conn.commit();
            
            System.out.println(ps.executeUpdate());
            
            final Savepoint sp1 = conn.setSavepoint("sp1");
            ps.setInt(1, 7);
            ps.setInt(2, 2);
            ps.setString(3, "Hien");
            System.out.println(ps.executeUpdate());
            
            conn.rollback(sp1);
            conn.commit();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
        selectWithStatement(conn);
    }

    private static void callStoreProdedureWithOutParam(Connection conn)
    {
        final String sql = "{call magic_number(?)}";
        try(CallableStatement cstm = conn.prepareCall(sql))
        {
            cstm.registerOutParameter(1, Types.INTEGER);
            cstm.execute();
            System.out.println(cstm.getInt(1));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private static void callStoreProdedureWithInOutParam(Connection conn)
    {
        final String sql = "{?= call double_number(?)}";
        try(CallableStatement cstm = conn.prepareCall(sql))
        {
            cstm.registerOutParameter(1, Types.DOUBLE);
            cstm.setInt(1, 10);
            //cstm.setString("", 10);//Can set IN with parameter name
            final boolean rs = cstm.execute();
            System.out.println(cstm.getDouble(1));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
    }


    private static void callStoreProdedureWithInParam(Connection conn)
    {
        //noParam
        final String sql = "{call read_names_by_letter(?)}";
        try(CallableStatement cstm = conn.prepareCall(sql))
        {
            cstm.setString(1, "e");
            final ResultSet rs = cstm.executeQuery();
            //rs.absolute(0);
            //rs.relative(1);
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + " - " + rs.getString(3));
            }  
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    
    private static void callStoreProdedureWithoutParam(Connection conn)
    {
        //noParam
        final String sql = "{call read_e_names()}";
        try(CallableStatement cstm = conn.prepareCall(sql))
        {
            final boolean execute = cstm.execute();
            System.out.println(execute);//false
            ResultSet rs = cstm.getResultSet();
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + " - " + rs.getString(3));
            }

            final ResultSet rs1 = cstm.executeQuery();
            while (rs1.next())
            {
                System.out.println(rs1.getInt(1) + " - " + rs1.getString(3));
            }
             
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private static void selectCount(Connection conn)
    {
        String sql = "SELECT count(*) as num FROM names";
        //Manipulate with table names
        try (PreparedStatement pstm = conn.prepareStatement(sql);)
        {
            final ResultSet rs = pstm.executeQuery();
            if(rs.next())
            {
                System.out.println(rs.getString("num"));
                System.out.println(rs.getInt(1));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
    }
    
    private static void updateWithPrepareStatement(Connection conn)
    {
        //Manipulate with table names
        String sql = "update names set name = ? where id = ?";
        try (PreparedStatement pstm = conn.prepareStatement(sql);)
        {
            pstm.setString(1, "AAAA");
            pstm.setInt(2, 1);
            final boolean rs = pstm.execute();
            if(!rs)
            {
                System.out.println(pstm.getUpdateCount());
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
    }


    private static void selectWithPrepareStatement(Connection conn)
    {
        //Manipulate with table names
        String sql = "select * from names where id = ? and name = ?";
        try (PreparedStatement pstm = conn.prepareStatement(sql);)
        {
            pstm.setObject(1, 1);
            pstm.setString(2, "Elsa");
            try(final ResultSet rs = pstm.executeQuery())
            {
                StringBuilder builder = new StringBuilder();
                builder.append("ID - Name");
                builder.append("\n");
                builder.append("=================");
                while (rs.next())
                {
                    builder.append("\n");
                    builder.append(rs.getString(1) + " - " + rs.getString(3));
                    builder.append("\n");
                    builder.append(rs.getString("id") + " - " + rs.getString("name"));
                    builder.append("\n");
                }
                System.out.println(builder.toString());
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
    }

    private static void selectWithStatement(final Connection conn)
    {
        //Manipulate with table names
        String sql = "select * from names";
        try(Statement sttm = conn.createStatement();
                final ResultSet rs = sttm.executeQuery(sql))
        {
            StringBuilder builder = new StringBuilder();
            builder.append("ID - Name");
            builder.append("\n");
            builder.append("=================");
            while (rs.next())
            {
                builder.append("\n");
                builder.append(rs.getString(1) + " - " + rs.getString(3));
                builder.append("\n");
                builder.append(rs.getString("id") + " - " + rs.getString("name"));
                builder.append("\n");
            }

            System.out.println(builder.toString());
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private static void updateWithStatementUsingExecute(Connection conn)
    {
        //Manipulate with table names
        String sql = "update names set name = 'AAA'";
        try (Statement sttm = conn.createStatement();)
        {
            final boolean rs = sttm.execute(sql);
            // System.out.println(rs);
            if (!rs)
            {
                System.out.println(sttm.getUpdateCount());
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
    }
    
    private static void selectWithStatementUsingExecute(final Connection conn)
    {
        // Manipulate with table names
        String sql = "select * from names";
        try (Statement sttm = conn.createStatement();)
        {
            final boolean ex = sttm.execute(sql);
            if (ex)
            {
                final ResultSet rs = sttm.getResultSet();

                StringBuilder builder = new StringBuilder();
                builder.append("ID - Name");
                builder.append("\n");
                builder.append("=================");
                while (rs.next())
                {
                    builder.append("\n");
                    builder.append(rs.getString(1) + " - " + rs.getString(3));
                    builder.append("\n");
                    builder.append(rs.getString("id") + " - " + rs.getString("name"));
                    builder.append("\n");
                }

                System.out.println(builder.toString());
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    private static void setUpDataBase(final Connection conn)
    {
        try
        {
            SetupDatabase.dropExisting(conn);
            SetupDatabase.createTables(conn);
            SetupDatabase.createStoredProcedures(conn);
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static Connection getConnection()
    {
        String url = "jdbc:hsqldb:file:ocp";
        try
        {
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        throw new RuntimeException("Get Connection failed.");
    }
}



/*
 * Changes:
 * $Log: $
 */