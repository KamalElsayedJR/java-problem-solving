public class NearHundred {
    static void main() {
        System.out.println(nearHundred(-101));
    }
    public static boolean nearHundred(int n) {
//        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10 );
        return ((n >= 90 && n <= 110) || (n >= 190 && n <= 210));
    }
}
