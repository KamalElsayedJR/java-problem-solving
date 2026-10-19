public class SumDouble {
    static void main(){
        System.out.println(sumDouble(2,3));
    }
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return ((a + b) * 2);
        }
        return (a+b);
//        return a == b ? ((a + b) * 2) : (a+b);
    }
}
