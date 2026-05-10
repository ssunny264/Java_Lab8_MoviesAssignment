/*
 * Sara Sunny - Lab 8 - Problem 1 (Action class)
 */
package sunny_lab8_prob1;

/**
 *
 * @author slbru
 */
public class Action extends Movie{
    
    public Action(int ID, String Title, String Rating){
        super(ID, Title, Rating);
    }
    
    @Override
    public double calcLateFee(int days){
        return (double) days * 3;
    }
}
