/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ISP.ispCorrection;
import ISP.ispViolation;
import ISP.ispViolationPart2;
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
public class ispTest {
    
    public static ispViolation v1;
    public static ispViolationPart2 v2;
    public static ispCorrection c1;
    
    public ispTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ispViolation()
    {
        v1.pkmnTrainerName("Ash");
        v2.pkmnTrainerName("Ketchum");
    }
    
    @Test
    public void ispCorrection()
    {
        c1.pkmnTrainerName("Misty");
        c1.pkmnTrainerSurname("Star");
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        v1= new ispViolation();
        v2=new ispViolationPart2();
        c1=new ispCorrection();
        
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
