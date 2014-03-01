/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

/**
 *
 * @author Calen
 */
public class partyDetails extends partyPkmn implements TrainerDetails 
{
    int highestLevel;
    
  
    
    public partyDetails(String name, int highestLevel)
    {
        super(name);
        this.highestLevel = highestLevel;
    }
    
    public String trainerName()
    {
        return"Ash";
    }
    
    public void setHighestLevel(int highestLevel)
    {
        this.highestLevel= highestLevel;
        
    }
    
    public int getHighestLevel()
    {
        return highestLevel;
    }
    
    
    
}
