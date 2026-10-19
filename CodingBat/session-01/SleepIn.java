public class SleepIn {
    static void main(){
        System.out.println(sleepIn(true,false));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

}