package senior_project;

import java.sql.*;

public class Database
{   
    String host = "jdbc:mysql://127.0.0.1:3306";
    String uName = "root";
    String uPass = "pass";
    private Connection myConnection = null;
    private Statement myStatement = null;
    ResultSet myRs = null; 
    public Database(){        
        long millis = System.currentTimeMillis();
        boolean SQLException = false;
        try
        {
            myConnection = DriverManager.getConnection(host, uName, uPass);
            myStatement = myConnection.createStatement();
        }
        catch (SQLException e)
        {
            SQLException = true;
            System.err.println("Failed to connect to your database.");
            System.out.println(e.getMessage());
        }
        finally
        {
            if (SQLException)
                Senior_Project.prepareShutdown();
        }
        System.out.println("Database -> Connected! (" + 
                (System.currentTimeMillis() - millis) + " MS)");
    }
    
    /**
     * @return the myConnection
     */
    public Connection getMyConnection() {
        return myConnection;
    }

    /**
     * @param myConnection the myConnection to set
     */
    public void setMyConnection(Connection myConnection) {
        this.myConnection = myConnection;
    }

    /**
     * @return the myStatement
     */
    public Statement getMyStatement() {
        return myStatement;
    }

    /**
     * @param myStatement the myStatement to set
     */
    public void setMyStatement(Statement myStatement) {
        this.myStatement = myStatement;
    }
}