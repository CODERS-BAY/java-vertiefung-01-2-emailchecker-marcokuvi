package com.codersbay;

public class Main {

    public static void main(String[] args) {
        EmailChecker emailChecker = new EmailChecker("alloha@gmail.com");
        emailChecker.checkForSpecialCharacters();
        emailChecker.checkIfAtIsThere();
        emailChecker.checkIfEmailContainsDomain();
        emailChecker.checkIfXUserPutsAreBeforeAtSymbol();
    }

}
