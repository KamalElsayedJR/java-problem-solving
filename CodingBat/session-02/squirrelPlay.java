public class squirrelPlay {
    public void main(String[] args){
        System.out.println(squirrelPlay(95, true));
    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer && (temp <= 100 && temp >= 90)){
            return true;
        }else if(temp <= 90 && temp >= 60){
            return true;
        }else {
            return false;
        }
    }

}
