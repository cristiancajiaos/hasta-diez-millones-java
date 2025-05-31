package hasta.diez.millones;

public class HastaDiezMillones {

    public static void main(String[] args) {
        long cuenta = 1;
        long numeroBase = 2;

        while (cuenta < 10000000) {
            cuenta *= numeroBase;
            System.out.println("cuenta: " + cuenta);
        }
    }

}
