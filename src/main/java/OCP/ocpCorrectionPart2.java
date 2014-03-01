/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OCP;

/**
 *
 * @author Calen
 */
public class ocpCorrectionPart2 extends ocpCorrection 
{
    int abilityNo;
    
    public ocpCorrectionPart2()
    {
    }
    
    public void setAbilities (int abilityNo)
    {
        this.abilityNo=abilityNo;
        
    }

    
    public String pkmnType(String type) //sets type
    {
         return "The type is: "+type;    
    }
    
}
