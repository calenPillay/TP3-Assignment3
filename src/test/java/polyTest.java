/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import polymorphism.partyDetails;

/**
 *
 * @author Calen
 */
public class polyTest 
{
    private static partyDetails details;
    public polyTest() 
    {
    }

    
     @Test
     public void completeDetails()
     {
         System.out.println("Trainer name: "+details.trainerName()+"\n Pokemon Name: "+details.getPkmnName()+" \n Pokemon Level: "+details.getHighestLevel());
     }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        details = new partyDetails("Pikachu",4);
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
