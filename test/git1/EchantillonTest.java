/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author bphou
 */
public class EchantillonTest {
    Echantillon instOne;
    Echantillon instMany;
    
    public EchantillonTest() {
    }
    
    @Before
    public void doBefore(){
        instOne = new Echantillon();
        instMany = new Echantillon();
        
        instOne.ajouter(1.23);
        
        instMany.ajouter(1.23);
        instMany.ajouter(2.34);
        instMany.ajouter(3.45);
        instMany.ajouter(4.56);
        instMany.ajouter(5.67);
    }

    @Test
    public void testConstructor() {        
        int result = instOne.getTaille();
        
        assertEquals(1, result);
    }
    
    @Test
    public void testGetTaille(){
        int result = instOne.getTaille();
        
        assertEquals(1, result);
    }
    
    @Test
    public void testAjouter(){
        int result = instOne.getTaille();
        
        assertEquals(1, result);
    }
    
    @Test
    public void testAjouterMany(){
        int result = instMany.getTaille();
        
        assertEquals(5, result);
    }
    
    @Test
    public void testGetMin(){
        double result = instMany.getMin();
        
        assertEquals(1.23, result, 1e-2);
    }
    
    @Test
    public void testGetMax(){
        double result = instMany.getMax();
        
        assertEquals(5.67, result, 1e-2);
        
    }
    
    @Test
    public void testGetMoy(){
        double result = instMany.getMoy();
        
        assertEquals(3.45, result, 1e-2);
        
    }
}
