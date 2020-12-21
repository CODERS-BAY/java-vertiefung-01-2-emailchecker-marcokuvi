package com.codersbay;

public class EmailChecker {

    private String email;

    public EmailChecker(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean checkIfAtIsThere() {
        if (email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfEmailContainsDomain() {
        String[] domains = {".com", ".at", ".de", ".org"};
        for (String domain : domains) {
            if (email.contains(domain)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean checkForSpecialCharacters() {
        String[] specialCharacters = {"+", "-", "&&", "||", "!", "(", ")", "{", "}", "[", "]", "^", "~", "*", "?", ":",};
        for (String specialCharacter : specialCharacters) {
            if (email.contains(specialCharacter)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public boolean checkIfXUserPutsAreBeforeAtSymbol() {
        String[] emailSplit = email.split("@");
        if (emailSplit[0].length() >= 5) {
            return true;
        } else {
            return false;
        }
    }
}