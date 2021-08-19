package lesson16.loginPassword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static boolean checkLoginPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String patternGeneral = "[a-zA-Z0-9_]{1,20}";
        Pattern patternLogin = Pattern.compile(patternGeneral);
        Pattern patternPassword = Pattern.compile(patternGeneral);
        Matcher matcher1 = patternLogin.matcher(login);
        Matcher matcher2 = patternPassword.matcher(password);
        if (!matcher1.matches()) {
            throw new WrongLoginException("Login invalid");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Passwords not match");
        }
        if (!matcher2.matches()) {
            throw new WrongPasswordException("Password invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            checkLoginPassword("djfhdhjdfakdj", "GfccDjhl", "GfccDjhl");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}





