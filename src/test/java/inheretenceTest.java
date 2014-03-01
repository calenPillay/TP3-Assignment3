/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inheretance.experiencedTrainer;
import inheretance.inheretanceImpl;
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
public class inheretenceTest 
{
    public static inheretanceImpl trainer;
    public static inheretanceImpl trainer2;
    
    public inheretenceTest() 
    {
    }

   
        @Test
     public void levelTest() 
     {
        System.out.println("The new trainers level is "+trainer.pkmnLevel());
        System.out.println("The experienced trainers level is"+trainer2.pkmnLevel());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        trainer=new newTrainer();
        trainer2 = new experiencedTrainer();
        
        
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
