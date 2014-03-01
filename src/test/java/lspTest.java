/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LSP.lspCorrection;
import LSP.lspViolationPart2;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Calen
 */
public class lspTest {
    static lspViolationPart2 healthAmount;
    static lspCorrection healthAmount2;
    public lspTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void lspViolationTest() 
    {
        
        int total=0;
        healthAmount.setHealthLost(300);
        healthAmount.setTotalHealth(500);
        total= healthAmount.healingReq(total);
        
        System.out.println("The pokemon was healed for "+total);
    }
    
    @Test
    public void lspCorrectionTest()
    {
        int total=0;
        healthAmount2.setHealthLost(500);
        healthAmount2.setTotalHealth(1000);
        total=healthAmount2.healingReq(total);
        
        System.out.println("The pokemon was healed for "+total);
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        healthAmount=new lspViolationPart2();
        healthAmount2=new lspCorrection();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
