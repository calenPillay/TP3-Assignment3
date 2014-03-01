/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DIP;

import config.DIP;

/**
 *
 * @author Calen
 */
public class dipCorrection implements DIP //class only depends on DIP class
{
    String pkmnTrainerName;
    
    public int pkmnCaught (int pkmnAmount)
    {
        return pkmnAmount;
        
    }
    
    public dipCorrection()
    {
    }
    
    public void setTrainerName(String pkmnTrainerName)
    {
        this.pkmnTrainerName=pkmnTrainerName;
    }
    
    public String getTrainerName(String pkmnTrainerName)
    {
        return pkmnTrainerName;
    }
}
