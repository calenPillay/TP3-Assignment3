/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LSP;

import config.LSP;


public class lspCorrection implements LSP 
{
    int totalHealth;
    int healthLost;
    
    public lspCorrection()
    {
        
    }
    
    public void setTotalHealth(int totalHealth)
    {
        this.totalHealth=totalHealth;
    }
    
    public int getTotalHealth()
    {
        return totalHealth;
    }
    
    public void setHealthLost(int healthLost)
    {
        this.healthLost=healthLost;
        
    }
    
    public int getHealthLost()
    {
        return healthLost;
    }
    
    
    public int healingReq (int healAmount)
    {
      return  healAmount=totalHealth-healthLost;
    }
}
