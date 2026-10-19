public class MissingChar {
    static void main() {
        System.out.println(missingChar("kitten",0));

    }
    public static String missingChar(String str, int n) {
        return (str.substring(0,n) + str.substring(n+1,str.length()));

    }
}
