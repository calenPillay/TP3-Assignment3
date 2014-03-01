/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DIP;



public class dipViolation //class is independent, doesn't depend on other classes.
{
    int pkmnAmount; 
    String trainerName;
    
    public dipViolation ()
    {
        
    }
   
    public dipViolation (int pkmnAmount, String trainerName)
    {
        this.pkmnAmount=pkmnAmount;
        this.trainerName=trainerName;
    }
    
    public void setTrainerName (String trainerName)
    {
        this.trainerName=trainerName;
    }
    
    public String getTrainerName()
    {
        return trainerName;
    }
    
    public void setPkmnAmount(int pkmnAmount)
    {
        this.pkmnAmount = pkmnAmount;
    }
    
    public int getPkmnAmount()
    {
        return pkmnAmount;
    }

   
}
