public class ParrotTrouble {
    static void main() {
        System.out.println(parrotTrouble(false,6));
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        return ((hour < 7 && talking) || (hour > 20 && talking));
    }
}
