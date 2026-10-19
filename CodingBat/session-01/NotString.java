public class NotString {
    static void main() {
        System.out.println(notString("not kkk"));

    }
    public static String notString(String str) {
        return str.startsWith("not") ? str : ("not " + str);
    }

}
