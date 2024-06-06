/*
 * SetupDatabase.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class SetupDatabase
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement())
        {

            dropExisting(conn);
            createTables(conn);
            createStoredProcedures(conn);

            printCount(conn, "SELECT count(*) FROM names");
        }
    }


     static void dropExisting(Connection conn) throws SQLException
    {
        run(conn, "DROP PROCEDURE read_e_names IF EXISTS");
        run(conn, "DROP PROCEDURE read_names_by_letter IF EXISTS");
        run(conn, "DROP PROCEDURE magic_number IF EXISTS");
        run(conn, "DROP PROCEDURE double_number IF EXISTS");
        run(conn, "DROP TABLE names IF EXISTS");
        run(conn, "DROP TABLE exhibits IF EXISTS");
    }


     static void createTables(Connection conn) throws SQLException
    {
        run(conn, """
                CREATE TABLE exhibits (
                  id INTEGER PRIMARY KEY,
                  name VARCHAR(255),
                  num_acres DECIMAL(4,1))""");

        run(conn, """
                CREATE TABLE names (
                   id INTEGER PRIMARY KEY,
                   species_id integer REFERENCES exhibits (id),
                   name VARCHAR(255))""");

        run(conn, "INSERT INTO exhibits VALUES (1, 'African Elephant', 7.5)");
        run(conn, "INSERT INTO exhibits VALUES (2, 'Zebra', 1.2)");

        run(conn, "INSERT INTO names VALUES (1, 1, 'Elsa')");
        run(conn, "INSERT INTO names VALUES (2, 2, 'Zelda')");
        run(conn, "INSERT INTO names VALUES (3, 1, 'Ester')");
        run(conn, "INSERT INTO names VALUES (4, 1, 'Eddie')");
        run(conn, "INSERT INTO names VALUES (5, 2, 'Zoe')");
    }


     static void createStoredProcedures(Connection conn) throws SQLException
    {
        String noParams = """
                CREATE PROCEDURE read_e_names()
                READS SQL DATA DYNAMIC RESULT SETS 1
                BEGIN ATOMIC
                DECLARE result CURSOR WITH RETURN FOR SELECT * FROM names WHERE LOWER(name) LIKE 'e%';
                OPEN result;
                END""";

        String inParam = """
                CREATE PROCEDURE read_names_by_letter(IN prefix VARCHAR(10))
                READS SQL DATA DYNAMIC RESULT SETS 1
                BEGIN ATOMIC
                DECLARE result CURSOR WITH RETURN FOR
                SELECT * FROM names WHERE LOWER(name) LIKE CONCAT(LOWER(prefix), '%');
                OPEN result;
                END""";

        String inOutParam = """
                CREATE PROCEDURE double_number(INOUT num INT) READS SQL DATA
                  DYNAMIC RESULT SETS 1
                  BEGIN ATOMIC
                  SET num = num * 2;
                  END""";

        String outParam = """
                CREATE PROCEDURE magic_number(OUT num INT) READS SQL DATA
                      BEGIN ATOMIC
                     SET num = 42;
                      END""";

        run(conn, noParams);
        run(conn, inParam);
        run(conn, outParam);
        run(conn, inOutParam);
    }


     static void run(Connection conn, String sql) throws SQLException
    {
        try (PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.executeUpdate();
        }
    }


     static void printCount(Connection conn, String sql) throws SQLException
    {
        try (PreparedStatement ps = conn.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery())
        {
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}

/*
 * Changes:
 * $Log: $
 */