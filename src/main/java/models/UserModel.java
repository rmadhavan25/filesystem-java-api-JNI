package models;

public class UserModel {
    private String name;
    private String phone;
    private String password;
    private String logInStatus;

    public UserModel(){
        
    }

    public UserModel(String name,String phone, String password,String logInStatus) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.logInStatus = logInStatus;
    }

    public UserModel(String logInStatus) {
        this.logInStatus = logInStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogInStatus() {
        return logInStatus;
    }

    public void setLogInStatus(String logInStatus) {
        this.logInStatus = logInStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    

    
}