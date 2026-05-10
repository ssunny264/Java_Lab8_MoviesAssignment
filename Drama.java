/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunny_lab8_prob1;

/**
 *
 * @author slbru
 */
public class Drama extends Movie{
    
    public Drama (int ID, String Title, String Rating){
        super(ID, Title, Rating);
    }
    
    @Override
    public double calcLateFee(int days){
        return (double) days * 2;
    }
}
