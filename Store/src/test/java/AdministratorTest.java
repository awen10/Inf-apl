/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adria
 */
public class AdministratorTest {
    
    public AdministratorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of AddProductsToStock method, of class Administrator.
     */
    @org.junit.jupiter.api.Test
    public void testAddProductsToStock() {
        System.out.println("AddProductsToStock");
        String name = "";
        String description = "";
        float price = 0.0F;
        int quantity = 0;
        Stock stock = null;
        Administrator instance = null;
        instance.AddProductsToStock(name, description, price, quantity, stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckProductStock method, of class Administrator.
     */
    @org.junit.jupiter.api.Test
    public void testCheckProductStock() {
        System.out.println("CheckProductStock");
        String name = "";
        Stock stock = null;
        Administrator instance = null;
        int expResult = 0;
        int result = instance.CheckProductStock(name, stock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveProductsFromStock method, of class Administrator.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveProductsFromStock() {
        System.out.println("RemoveProductsFromStock");
        String name = "";
        Stock stock = null;
        Administrator instance = null;
        instance.RemoveProductsFromStock(name, stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
