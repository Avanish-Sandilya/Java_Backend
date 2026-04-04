public class Main {

    public static boolean binaryCheck(String value){
        return value.matches("[01]*");
    }

    public static boolean dateFormatCheck(String value){
        return value.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean mailCheck(String value){
        return value.matches("\\w+@gmail.com");
    }

    public static void main(String[] args) {
        System.out.println(binaryCheck("1001011"));
        System.out.println(dateFormatCheck("11/05/2002"));
        System.out.println(mailCheck("bhanusandilya74@gmail.com"));
    }

}
