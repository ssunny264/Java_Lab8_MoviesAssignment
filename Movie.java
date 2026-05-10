/*
 * Sara Sunny - Lab 8 - Problem 1 (Movie class)
 */
package sunny_lab8_prob1;

/**
 *
 * @author slbru
 */
public class Movie {
    String Rating, Title;
    int ID;
    
    public Movie(){   
    }
    public Movie (int ID, String Title,  String Rating){
        this.ID = ID;
        this.Title = Title;
        
        this.Rating = Rating;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setRating(String Rating){
        this.Rating = Rating;
    }
    public int getID(){
        return ID;
    }
    public String getTitle(){
        return Title;
    }
    public String getRating(){
        return Rating;
    }
    public double calcLateFee(int days){
        return (double)days * 2;
    }
    public boolean equals (Movie compare){
        if (compare == null){
            return false;
        }
        else if (compare.getClass() == this.getClass()){
            return ID == compare.getID();
        }
        else{
            return false;
        }
    }
}
