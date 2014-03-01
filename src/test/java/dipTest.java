/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DIP.dipCorrection;
import DIP.dipViolation;
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
public class dipTest 
{
    static dipCorrection t1;
    static dipViolation t2;
    public dipTest()
    {
    }

    
    @Test
    public void testCorrection() 
    {
       int pkmnAmount=  t1.pkmnCaught(31);
       t1.setTrainerName("Ash");
    }
    
    @Test
    public void testViolation()
    {
        t2.setPkmnAmount(2);
        t2.setTrainerName("Brock");
        
        System.out.println("Trainer: "+t2.getTrainerName()+"Amount of pokemon caught: "+t2.getPkmnAmount());
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        t1=new dipCorrection();
        t2=new dipViolation();
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
