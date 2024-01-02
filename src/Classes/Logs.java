package Classes;

public class Logs {
    private String name;
    private String username;
    private String password;

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
        this.name = name;
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
        this.username = username;
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
    
    public boolean credVerifier(String name, String username, String password) {
        return (name.isEmpty() && username.isEmpty() && password.isEmpty());
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
}

