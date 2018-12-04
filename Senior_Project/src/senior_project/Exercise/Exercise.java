/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Exercise;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import senior_project.Database;
import senior_project.Senior_Project;

/**
 *
 * @author yessi
 */
public class Exercise {
        
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    String state = "SELECT * FROM seniorproject.exercises WHERE id = '";
    
    private int numEx;
    private int[] id;
    private byte[] im;
    private String name;
    private String description;
    private String Dlink;
    private String Ilink;
    
    public Exercise(int numEx, String name, String description, 
            String Dlink, String Ilink) {
        this.numEx = numEx;
        this.name = name;
        this.description = description;
        this.Dlink = Dlink;
        this.Ilink = Ilink;
    }
    
    public Exercise() {
        // hard-coded for testing
    }

    /**
     * @param n
     * @param t
     * @return the numEx
     */
    public int getNumEx(String n, int t) {
        numEx = 0;
        if(n.compareTo("T")==0){
            try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.exercises"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        int temp = (set.getInt("type"));
                        if(temp == t)
                            numEx++;
                    }
                }
            }catch(SQLException e){ System.out.println("No exercises in the database");};
            System.out.println("Exercises for type " + t + " :" +numEx);
        }
        else {
            try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.exermusc"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        String m = "mus" + Integer.toString(t);
                        boolean temp = (set.getBoolean(m));
                        if(temp)
                            numEx++;
                    }
                }
            }catch(SQLException e){ System.out.println("No exercises in the database");};
            System.out.println("Exercises for muscles " + t + " :" +numEx);
        }
        return numEx;
    }

    /**
     * @param numEx the numEx to set
     */
    public void setNumEx(int numEx) {
        this.numEx = numEx;
    }

    /**
     * @param n
     * @param t
     * @param c
     * @return the id
     */
    public int[] getId(String n, int t, int c) {
        id = new int[c];
        int count = 0;
        if(n.compareTo("T")==0){
            try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.exercises"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        int temp = (set.getInt("type"));
                        int temp2 = (set.getInt("id"));
                        System.out.println(temp2 + ", ");
                        if(temp == t){
                            id[count] = temp2;
                            count++;
                        }
                    }
                }
            }catch(SQLException e){ System.out.println("No exercises in the database");};
            System.out.println("Exercises for type " + t + " :" +numEx);
        }
        else {
            try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.exermusc"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        int temp2 = (set.getInt("exerID"));
                        String m = "mus" + Integer.toString(t);
                        boolean temp = (set.getBoolean(m));
                        if(temp){
                            id[count] = temp2;
                            count++;
                        }
                    }
                }
            }catch(SQLException e){ System.out.println("No exercises in the database");};
        }
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int[] id) {
        this.id = id;
    }

    /**
     * @param id
     * @return the name
     */
    public String getName(int id) {
        name = "";
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    //name = (set.getString("name"));
                    String temp = (set.getString("name"));
                    if(temp != null)
                        name = temp;
                    else
                        name = "No name";
                }
            }
        }catch(SQLException e){ System.out.println("No exercises in the database");};
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id
     * @return the description
     */
    public String getDescription(int id) {
        description = "";
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    //description = (set.getString("description"));
                    String temp = (set.getString("description"));
                    if(temp != null)
                        description = temp;
                    else
                        description = "No description";
                }
            }
        }catch(SQLException e){ System.out.println("No exercises in the database");};
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param id
     * @return the Dlink
     */
    public String getDlink(int id) {
        Dlink = "";
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    //Dlink = (set.getString("Dlink"));
                    String temp = (set.getString("Dlink"));
                    if(temp != null)
                        Dlink = temp;
                    else
                        Dlink = "https://www.google.com/webhp";
                }
            }
        }catch(SQLException e){ System.out.println("No exercises in the database");};
        return Dlink;
    }

    /**
     * @param Dlink the Dlink to set
     */
    public void setDlink(String Dlink) {
        this.Dlink = Dlink;
    }

    /**
     * @param id
     * @return the Ilink
     */
    public String getIlink(int id) {
        Ilink = "";
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    //Ilink = (set.getString("Ilink"));
                    String temp = (set.getString("Ilink"));
                    if(temp != null)
                        Ilink = temp;
                    else
                        Ilink = "https://www.google.com/webhp";
                }
            }
        }catch(SQLException e){ System.out.println("No exercises in the database");};
        return Ilink;
    }

    /**
     * @param Ilink the Ilink to set
     */
    public void setIlink(String Ilink) {
        this.Ilink = Ilink;
    }

    /**
     * @param id
     * @return the im
     */
    public byte[] isIm(int id) {
        im = null;
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    Blob image = set.getBlob("image"); //retrieving the blob
                    im = image.getBytes(1, (int)image.length()); //getting al the bytes of the blob
                }
            }
        }catch(SQLException e){ System.out.println("No exercises in the database");}
        return im;
    }

    /**
     * @param im the im to set
     */
    public void setIm(byte[] im) {
        this.im = im;
    }
}
