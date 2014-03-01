/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OCP;

import config.OCP;


public class ocpViolation implements OCP // This class checks for the amount of abilties the pokemon has according to type and modifies method accordign to type
                                                   
{
    
   String gender;
   int abilities;
   
   public ocpViolation()
   {
   }
       
    
       
       public String pkmnType (String type)
       {
           if ("rock".equals(type))
           {              
               abilities = 2;
           }
           else if("ice".equals(type))
           {
              abilities =1;
           }
           
          return "The type is" +type +"And the number of abilities is: "+abilities;
       }
       
       
}
