/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Recommendations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import senior_project.Database;
import senior_project.Senior_Project;

/**
 *
 * @author yessi
 */
public class RecommendationsModel {

    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    private int cal_ageH;
    private int cal_ageL;
    private int cal_s;
    private int cal_m;
    private int cal_a;
    
    private int ex_age;
    private int ex_low;
    private int ex_high;
    private String ex_msg;
    
    private String f1;
    private String f2;
    private String f3;
    private String f4;
    private String f5;
    
    RecommendationsModel(int cal_ageH, int cal_ageL, int cal_s, int cal_m,
                        int cal_a, int ex_age, int ex_low, int ex_high, String ex_msg){
        this.cal_ageH = cal_ageH;
        this.cal_ageL = cal_ageL;
        this.cal_s = cal_s;
        this.cal_m = cal_m;
        this.cal_a = cal_a;
        this.ex_age = ex_age;
        this.ex_low = ex_low;
        this.ex_high = ex_high;
        this.ex_msg = ex_msg;
    }
    
    RecommendationsModel(){
        //test with hard coding
    }
    
    public void getCal(int Uage, String g){
        if(g.compareTo("F") == 0){
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM seniorproject.recfood_f"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        int temp_Al = (set.getInt("age_l"));
                        int temp_Ah = (set.getInt("age_h"));
                        int temp_s = (set.getInt("sedentary"));
                        int temp_m = (set.getInt("moderately active"));
                        int temp_a = (set.getInt("active"));
                        if(temp_Al <= Uage && Uage <= temp_Ah){
                            setCal_ageH(temp_Ah);
                            setCal_ageL(temp_Al);
                            setCal_s(temp_s);
                            setCal_m(temp_m);
                            setCal_a(temp_a);
                        }
                    }
                }
            }catch(SQLException e){ System.out.println("User not in the database");};
        }
        else{
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM seniorproject.recfood_m"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        int temp_Al = (set.getInt("age_l"));
                        int temp_Ah = (set.getInt("age_h"));
                        int temp_s = (set.getInt("sedentary"));
                        int temp_m = (set.getInt("moderately active"));
                        int temp_a = (set.getInt("active"));
                        if(temp_Al <= Uage && Uage <= temp_Ah){
                            setCal_ageH(temp_Ah);
                            setCal_ageL(temp_Al);
                            setCal_s(temp_s);
                            setCal_m(temp_m);
                            setCal_a(temp_a);
                        }
                    }
                }
            }catch(SQLException e){ System.out.println("User not in the database");};
        }
    }  
    
    public void getEx(int Uage){
        int previous = 0;
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM seniorproject.recexer_age"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        int temp_A = (set.getInt("age"));
                        int temp_l = (set.getInt("low"));
                        int temp_h = (set.getInt("high"));
                        String temp_m = (set.getString("message"));
                        if(temp_A >= Uage && Uage >= previous){
                            setEx_age(temp_A);
                            setEx_low(temp_l);
                            setEx_high(temp_h);
                            setEx_msg(temp_m);
                        }
                        previous = temp_A;
                    }
                }
            }catch(SQLException e){ System.out.println("User not in the database");};
    }
    
    public void getD(int id){
        int[] Food = new int[5];
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.disfood WHERE disID = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    Food[0] = (set.getInt("food1ID"));
                    Food[1] = (set.getInt("food2ID"));
                    Food[2] = (set.getInt("food3ID"));
                    Food[3] = (set.getInt("food4ID"));
                    Food[4] = (set.getInt("food5ID"));
                }
            }
        }catch(SQLException e){ System.out.println("No diseases in the database");};
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.foods"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int temp = (set.getInt("id"));
                    String temp2 = set.getString("name");
                    if(temp == Food[0])
                        f1 = temp2;
                    if(temp == Food[1])
                        f2 = temp2;
                    if(temp == Food[2])
                        f3 = temp2;
                    if(temp == Food[3])
                        f4 = temp2;
                    if(temp == Food[4])
                        f5 = temp2;
                }
            }
        }catch(SQLException e){ System.out.println("No diseases in the database");};
    }

    /**
     * @return the cal_ageH
     */
    public int getCal_ageH() {
        return cal_ageH;
    }

    /**
     * @param cal_ageH the cal_ageH to set
     */
    public void setCal_ageH(int cal_ageH) {
        this.cal_ageH = cal_ageH;
    }

    /**
     * @return the cal_ageL
     */
    public int getCal_ageL() {
        return cal_ageL;
    }

    /**
     * @param cal_ageL the cal_ageL to set
     */
    public void setCal_ageL(int cal_ageL) {
        this.cal_ageL = cal_ageL;
    }

    /**
     * @return the cal_s
     */
    public int getCal_s() {
        return cal_s;
    }

    /**
     * @param cal_s the cal_s to set
     */
    public void setCal_s(int cal_s) {
        this.cal_s = cal_s;
    }

    /**
     * @return the cal_m
     */
    public int getCal_m() {
        return cal_m;
    }

    /**
     * @param cal_m the cal_m to set
     */
    public void setCal_m(int cal_m) {
        this.cal_m = cal_m;
    }

    /**
     * @return the cal_a
     */
    public int getCal_a() {
        return cal_a;
    }

    /**
     * @param cal_a the cal_a to set
     */
    public void setCal_a(int cal_a) {
        this.cal_a = cal_a;
    }

    /**
     * @return the ex_age
     */
    public int getEx_age() {
        return ex_age;
    }

    /**
     * @param ex_age the ex_age to set
     */
    public void setEx_age(int ex_age) {
        this.ex_age = ex_age;
    }

    /**
     * @return the ex_low
     */
    public int getEx_low() {
        return ex_low;
    }

    /**
     * @param ex_low the ex_low to set
     */
    public void setEx_low(int ex_low) {
        this.ex_low = ex_low;
    }

    /**
     * @return the ex_high
     */
    public int getEx_high() {
        return ex_high;
    }

    /**
     * @param ex_high the ex_high to set
     */
    public void setEx_high(int ex_high) {
        this.ex_high = ex_high;
    }

    /**
     * @return the ex_msg
     */
    public String getEx_msg() {
        return ex_msg;
    }

    /**
     * @param ex_msg the ex_msg to set
     */
    public void setEx_msg(String ex_msg) {
        this.ex_msg = ex_msg;
    }
    
     public int AgeCalculator(int year, int month, int day) {
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month, day);
        int age = getAge(birthday.getTime());
        System.out.println("age: " + age);  // prints "age: 26"
        return age;
    }
    
    public int getAge(Date dateOfBirth) {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
        if (birthDate.after(today)) {
            throw new IllegalArgumentException("You don't exist yet");
        }
        int todayYear = today.get(Calendar.YEAR);
        int birthDateYear = birthDate.get(Calendar.YEAR);
        int todayDayOfYear = today.get(Calendar.DAY_OF_YEAR);
        int birthDateDayOfYear = birthDate.get(Calendar.DAY_OF_YEAR);
        int todayMonth = today.get(Calendar.MONTH);
        int birthDateMonth = birthDate.get(Calendar.MONTH);
        int todayDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int birthDateDayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
        int age = todayYear - birthDateYear;

        // If birth date is greater than todays date (after 2 days adjustment of leap year) then decrement age one year
        if ((birthDateDayOfYear - todayDayOfYear > 3) || (birthDateMonth > todayMonth)){
            age--;

        // If birth date and todays date are of same month and birth day of month is greater than todays day of month then decrement age
        } else if ((birthDateMonth == todayMonth) && (birthDateDayOfMonth > todayDayOfMonth)){
            age--;
        }
        return age;
    }

    /**
     * @return the f1
     */
    public String getF1() {
        return f1;
    }

    /**
     * @param f1 the f1 to set
     */
    public void setF1(String f1) {
        this.f1 = f1;
    }

    /**
     * @return the f2
     */
    public String getF2() {
        return f2;
    }

    /**
     * @param f2 the f2 to set
     */
    public void setF2(String f2) {
        this.f2 = f2;
    }

    /**
     * @return the f3
     */
    public String getF3() {
        return f3;
    }

    /**
     * @param f3 the f3 to set
     */
    public void setF3(String f3) {
        this.f3 = f3;
    }

    /**
     * @return the f4
     */
    public String getF4() {
        return f4;
    }

    /**
     * @param f4 the f4 to set
     */
    public void setF4(String f4) {
        this.f4 = f4;
    }

    /**
     * @return the f5
     */
    public String getF5() {
        return f5;
    }

    /**
     * @param f5 the f5 to set
     */
    public void setF5(String f5) {
        this.f5 = f5;
    }
    
}
