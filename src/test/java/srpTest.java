/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import SRP.srpCorrection;
import SRP.srpViolation;
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
public class srpTest
{
    static srpViolation v1;
    static srpCorrection c1;
    public srpTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testViolation()
    {
        v1.TrainerName("Ash");
        v1.TrainerSurname("Ketchum");
        v1.pkmnCaught(3);
    }
    
    @Test
    public void testCorrection()
    {
        c1.pkmnTrainerName("Misty");
        c1.pkmnTrainerSurname("Star");
        c1.maxPkmnLevel(99);
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        v1= new srpViolation();
        c1 =new srpCorrection();
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
