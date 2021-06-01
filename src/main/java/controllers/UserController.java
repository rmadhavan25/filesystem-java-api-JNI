package controllers;
import java.sql.*;

import models.*;;

//contoller to verify user
public class UserController {
    Connection con = null;

    public UserController(){
        String url = "jdbc:mysql://localhost:3306/file_system";
        String userName = "root";
        String password = "sudha10";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public UserModel signIn(String phone,String password){
        if(isUser(phone)){
            if(isValidUser(phone, password)){
                return new UserModel("OK");
            }
            else{
                return new UserModel("Incorrect Password");
            }
        }
        return new UserModel("User Doesn't Exist");
    }

    public boolean isUser(String phone){
        //operation from database
        String sql = "select * from users where phone="+phone;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }

    public boolean isValidUser(String phone,String password){
        //operation from database
        String sql = "select * from users where phone=\'"+phone+"\'and password=\'"+password+"\'";
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
}