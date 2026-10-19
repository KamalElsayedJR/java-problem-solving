public class cigarParty {
    public void main(String[] args){
        System.out.println(cigarParty(70,true));
    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60){
            return true;
        } else if (isWeekend && cigars >= 60) {
            return true;
        }else {
            return false;
        }
    }

}
