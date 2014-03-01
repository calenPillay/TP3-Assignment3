/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ISP;

import config.ISP1;

/**
 *
 * @author Calen
 */
public class ispViolation implements ISP1 
{
    public ispViolation()
    {
        
    }
    
    public String pkmnTrainerName(String trainerName)
    {
        return "Trainer Name is: "+ trainerName;
    }
    
}
