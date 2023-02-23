public class PasswordUtil {

    public static enum SecurityLevel{
        WEAK, MEDIUM, STRONG;
    }
    public static SecurityLevel assessPassword(String psw){
        if(psw.length() < 8 || psw.matches("[a-zA-Z]+") || psw.matches("[0-9]+"))
            return SecurityLevel.WEAK;

        if(psw.matches("[A-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
