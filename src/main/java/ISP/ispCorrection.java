/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ISP;

import config.ISP1;
import config.ISP2;

/**
 *
 * @author Calen
 */
public class ispCorrection implements ISP1, ISP2 
{
    public String pkmnTrainerName(String trainerName)
    {
        return "The trainers name is"+trainerName;
    }
    
    public String pkmnTrainerSurname(String trainerSurname)
    {
        return "and his surname is "+trainerSurname;
    }
}
