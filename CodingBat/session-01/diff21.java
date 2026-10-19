public class diff21 {
    static void main() {
        System.out.println(diff21(22));
    }
    public static int diff21(int n){
        if (n > 21) return ((n-21)*2);
        return (21-n);
    }
}
