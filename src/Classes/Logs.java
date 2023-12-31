/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author cris
 */
public class Logs {
    private String name;
    private String username;
    private String password;
    private int code;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if (!name.isEmpty() || !usernameExist(name)) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        if (!username.isEmpty()) {
            this.username = username;
        } else {
            this.username = "";
        }
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the email to set
     */
    public void setCode(int code) {
        this.code = code;
    }
    
    public boolean nameVerifier (String name) {
        return !name.matches(".*[0-9\\p{P}&&[^.]].*|^$");
    }
    
    public boolean usernameVerifier (String username) {
        return !username.equals("");
    }
    
    public boolean passVerifier(String password, String username) {
       return !(username.equals(password) || username.equals("") || username.length() < 12);
    }
    
    public boolean usernameExist(String username) {
        if (username.isEmpty()) {
        return false; 
        }
        
        try {
            File accounts = new File("Account.txt");
            try (Scanner myReader = new Scanner(accounts)) {
                while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    
                    if (line.startsWith("Username: ") && line.contains(username)) {
                        myReader.close();
                        return true;
                    }
                }
            }
            return false;
        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            return false;
        }
    }
}

