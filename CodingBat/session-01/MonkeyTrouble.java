public class MonkeyTrouble {
    static void main(String[] args){
        System.out.println(monkeyTrouble(false,false));
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile || !aSmile && !bSmile);
    }
}