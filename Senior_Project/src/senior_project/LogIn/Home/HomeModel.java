/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Home;

import java.sql.*;
import senior_project.Database;
import senior_project.Senior_Project;

/**
 *
 * @author yessi
 */
public class HomeModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    String uD = "SELECT * FROM seniorproject.userdis WHERE userID = '";
    String uA = "SELECT * FROM seniorproject.userallergies WHERE userID = '";
    String p = "SELECT * FROM seniorproject.personal WHERE userID = '";
    String m = "SELECT * FROM seniorproject.medical WHERE userID = '";
    String pI = "SELECT * FROM seniorproject.profilepicture WHERE userID = '";
    
    private String fname;
    private String lname;
    private String gender;
    private String add;
    private String st;
    private String city;
    private String zip;
    private String email;
    private String DOB;
    private int hFt;
    private int hIn;
    private int weight;
    private int numDis;
    private boolean[] dis;
    private int numAll;
    private boolean[] all;
    private byte[] image;
    
    public HomeModel(String fname, String lname, String gender, String add, String st, 
            String city, String zip, String email, String DOB, int hFt, int hIn, 
            int weight, int numDis, boolean[] dis, int numAll, boolean[] all, byte[] image){
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.add = add;
        this.st = st;
        this.city = city;
        this.zip = zip;
        this.email = email;
        this.DOB = DOB;
        this.hFt = hFt;
        this.hIn = hIn;
        this.weight = weight;
        this.numDis = numDis;
        this.dis = dis;
        this.numAll = numAll;
        this.all = all;
        this.image = image;
    }
    
    public HomeModel(){
        // hard-coded for testing
    }
    
    public void getInfo(int id, int ND, int NA) {
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.personal WHERE userID = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    fname = (set.getString("firstName"));
                    lname = (set.getString("lastName"));
                    gender = (set.getString("sex"));
                    add = (set.getString("address"));
                    st = (set.getString("state"));
                    city = (set.getString("city"));
                    zip = (set.getString("zipcode"));
                    email = (set.getString("email"));
                    DOB = (set.getString("birthday"));
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.medical WHERE userID = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    hFt = (set.getInt("heightFt"));
                    hIn = (set.getInt("heightInches"));
                    weight = (set.getInt("weight"));
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.profilepicture WHERE userID = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    Blob b = set.getBlob("image"); //retrieving the blob
                    if(b != null)
                        image = b.getBytes(1, (int)b.length()); //getting al the bytes of the blob
                }
            }
            System.out.println("HomeModel - Image:\n" + image);
        }catch(SQLException e){ System.out.println("User not in the database");};
        dis = new boolean[ND];
        int count = 1;
        int index = 0;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.userdis WHERE userID = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    while(count <= ND){
                        String m = "dis" + Integer.toString(count);
                        boolean temp = (set.getBoolean(m));
                        dis[index] = temp;
                        index++;
                        count++;
                    }
                }
            }
        }catch(SQLException e){System.out.println("User not in the database");};
        all = new boolean[NA];
        int count2 = 1;
        int index2 = 0;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.userallergies WHERE userID = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                        while(count2 <= NA){
                        String m = "all" + Integer.toString(count2);
                        boolean temp = (set.getBoolean(m));
                        all[index2] = temp;
                        index2++;
                        count2++;
                    }
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the add
     */
    public String getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(String add) {
        this.add = add;
    }

    /**
     * @return the st
     */
    public String getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(String st) {
        this.st = st;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the hFt
     */
    public int gethFt() {
        return hFt;
    }

    /**
     * @param hFt the hFt to set
     */
    public void sethFt(int hFt) {
        this.hFt = hFt;
    }

    /**
     * @return the hIn
     */
    public int gethIn() {
        return hIn;
    }

    /**
     * @param hIn the hIn to set
     */
    public void sethIn(int hIn) {
        this.hIn = hIn;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the numDis
     */
    public int getNumDis() {
        return numDis;
    }

    /**
     * @param numDis the numDis to set
     */
    public void setNumDis(int numDis) {
        this.numDis = numDis;
    }

    /**
     * @return the dis
     */
    public boolean[] getDis() {
        return dis;
    }

    /**
     * @param dis the dis to set
     */
    public void setDis(boolean[] dis) {
        this.dis = dis;
    }

    /**
     * @return the numAll
     */
    public int getNumAll() {
        return numAll;
    }

    /**
     * @param numAll the numAll to set
     */
    public void setNumAll(int numAll) {
        this.numAll = numAll;
    }

    /**
     * @return the all
     */
    public boolean[] getAll() {
        return all;
    }

    /**
     * @param all the all to set
     */
    public void setAll(boolean[] all) {
        this.all = all;
    }

    /**
     * @return the image
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
    
}
