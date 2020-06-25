package ru.job4j.ex;

/**
 * Created by Sergey
 */
public class User {

    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        if(username.length()<3){
            valid=false;
        }
        return valid;
    }

}
