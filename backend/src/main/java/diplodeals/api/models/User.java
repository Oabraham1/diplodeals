package diplodeals.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class User {
    private String firstName;

    private String lastName;

    private String email;
    @JsonIgnore
    private String hashedpassword;

    private boolean isAdmin;

    private Map<String, String> savedBooks;

    public User() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedpassword() {
        return hashedpassword;
    }

    public void setHashedpassword(String hashedpassword) {
        this.hashedpassword = hashedpassword;
    }

    public Map<String, String> getSavedBooks() {
        return savedBooks;
    }

    public void setSavedBooks(Map<String, String> savedBooks) {
        this.savedBooks = savedBooks;
    }

    /**
     * Checks for user object is emptiness.
     *
     * @return if no email set, the user is empty.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return this.email == null || "".equals(this.getEmail());
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}