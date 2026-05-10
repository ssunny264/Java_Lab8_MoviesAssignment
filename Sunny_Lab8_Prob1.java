/*
 * Sara Sunny - Lab 8 - Problem 1 (Main class)
 */
package sunny_lab8_prob1;

/**
 *
 * @author slbru
 */
public class Sunny_Lab8_Prob1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Action killbill2 = new Action(0,
                        "Kill Bill: Volume 2", "R");
        Comedy meangirls = new Comedy(1,
                        "Mean Girls", "PG-13");
        Drama mystic = new Drama(2,
                        "Mystic River", "R");
        Drama mysticCopy2 = new Drama(2,
                        "Mystic River, Second Copy", "R");

        System.out.println("If " + killbill2.getTitle() +
                        " is 2 days late the fee is " +
                        killbill2.calcLateFee(2));
        System.out.println("If " + killbill2.getTitle() +
                        " is 3 days late the fee is " +
                        killbill2.calcLateFee(3));
        System.out.println("If " + meangirls.getTitle() +
                        " is 3 days late the fee is " +
                        meangirls.calcLateFee(3));
        System.out.println("If " + mystic.getTitle() +
                        " is 3 days late the fee is " +
                        mystic.calcLateFee(3));

        // Test our equals method
        System.out.println("Is " + killbill2.getTitle() +
                " equal " + mystic.getTitle() +
                "? " + killbill2.equals(mystic));
        System.out.println("Is " + meangirls.getTitle() +
                " equal " + mystic.getTitle() +
                "? " + meangirls.equals(mystic));
        System.out.println("Is " + mystic.getTitle() +
                " equal " + mysticCopy2.getTitle() +
                "? " + mystic.equals(mysticCopy2));
    }
    
}
