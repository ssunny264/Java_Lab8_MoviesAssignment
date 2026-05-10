/*
 * Sara Sunny - Lab 8 - Problem 1 (Comedy class)
 */
package sunny_lab8_prob1;

/**
 *
 * @author slbru
 */
public class Comedy extends Movie{
    
    public Comedy(int ID, String Title, String Rating){
        super(ID, Title, Rating);
    }
    
    @Override
    public double calcLateFee(int days){
        return (double) days * 2.5;
    }
}
