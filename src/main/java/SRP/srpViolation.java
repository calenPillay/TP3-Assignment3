/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SRP;

import config.SRP1;

/**
 *
 * @author Calen
 */
public class srpViolation implements SRP1 
{
    public String TrainerName (String trainerName)
    {
        return trainerName;
    }
    
    public String TrainerSurname(String trainerSurname) //Our trainers surname may also change if she gets married so thats one change already!
    {
        return trainerSurname;
    }
    
    public int pkmnCaught(int pkmnAmount) //This will have to change everytime the trainer catches a pokemon which will violate SRP since it will not only change once
    {
        return pkmnAmount;
    }
    
}
