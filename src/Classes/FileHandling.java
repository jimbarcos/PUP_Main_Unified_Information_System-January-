package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandling {
    private String fName;
    private String fUsername;
    private String fPassword;
    private int fCode;

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the fUsername
     */
    public String getfUsername() {
        return fUsername;
    }

    /**
     * @param fUsername the fUsername to set
     */
    public void setfUsername(String fUsername) {
        this.fUsername = fUsername;
    }

    /**
     * @return the fPassword
     */
    public String getfPassword() {
        return fPassword;
    }

    /**
     * @param fPassword the fPassword to set
     */
    public void setfPassword(String fPassword) {
        this.fPassword = fPassword;
    }

    /**
     * @return the fCode
     */
    public int getfCode() {
        return fCode;
    }

    /**
     * @param fCode the fCode to set
     */
    public void setfCode(int fCode) {
        this.fCode = fCode;
    }
    
    // Method to check if username exist within a file
    public boolean isUsernameExist(String fUsername) {
        try {
            File accounts = new File("Account.txt");
            try (Scanner myReader = new Scanner(accounts)) {
                while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    
                    if (line.startsWith("Username: ") && line.contains(fUsername)) {
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
    
    // Method to check if password and username exist within a file.
    public boolean isUnamePassValid(String fUsername, String fPassword) {
        try {
            File accounts = new File("Account.txt");
            Scanner myReader = new Scanner(accounts);

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                
                if (line.startsWith("Username: ") && line.contains(fUsername)
                && myReader.nextLine().split(": ")[1].equals(fPassword)) {
                    myReader.close();
                    return true;
                }
            }
            return false;
        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            return false;
        }
    }
    
    // Method to add data in the file
    public boolean storeData(String fName, String fUsername, String fPassword,int fCode) {
        File accounts = new File("Account.txt");
        if (accounts.exists()) {
            try (FileWriter fileWriter = new FileWriter(accounts, true)) {
                fileWriter.write("Name: " + fName + "\n");
                fileWriter.write("Username: " + fUsername + "\n");
                fileWriter.write("Password: " + fPassword + "\n");
                fileWriter.write("Back-up Code: " + fCode + "\n\n");

                fileWriter.close();
            } catch (IOException e) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return false;
    }
}
