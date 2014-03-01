/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import OCP.ocpCorrection;
import OCP.ocpCorrectionPart2;
import OCP.ocpViolation;
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
public class ocpTest {
    
    public ocpTest() {
    }
    
    private static ocpViolation vio;
    private static ocpCorrectionPart2 correct;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void violationTest()
    {
     vio.pkmnType("Rock");   
    }
    
    @Test
    public void correctionTest()
    {
       String type = correct.pkmnType("Rock");
       correct.setAbilities(3);
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        vio= new ocpViolation();
        correct = new ocpCorrectionPart2();
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
