/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SRP;

import config.SRP2;

/**
 *
 * @author Calen
 */
public class srpCorrection implements SRP2 
{
    public String pkmnTrainerName(String trainerName)
    {
        return trainerName;
    }
    
    public String pkmnTrainerSurname (String trainerSurname)//Now if our trainer gets married, she or he(Since this is the 21st century) can change surnames
    {
        return trainerSurname;
    }
    
    public int maxPkmnLevel(int maxPkmnLevel)// The max level will never change since the highest level a pokemon can go to is 99
    {
        return maxPkmnLevel;
    }
}
