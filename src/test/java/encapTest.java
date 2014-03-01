/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import encapsulation.encapImpl;
import inheretance.experiencedTrainer;
import inheretance.newTrainer;
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
public class encapTest {
    private static encapImpl encap;
    
    
    public encapTest() 
    {
    }

   
    @Test
    public void encapTest() 
    {
        //String name ="Pikachu";
        encap.setPkmName("Pikachu");
        System.out.println("Your pokemon: "+encap.getPkmName());
    }
    @Test
    public void inheretenceTest()
    {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        encap = new encapImpl();
        
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
