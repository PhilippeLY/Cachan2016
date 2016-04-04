/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git1;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author bphou
 */
public class RecipientTest {
    Recipient verseur;
    Recipient reservoir;
    
    @Before
    public void doBefore(){
        verseur = new Recipient();
        reservoir = new Recipient();
        verseur.setQuantite(10);
        reservoir.setQuantite(50);
    }
    
    @Test
    public void mettreUnDans(Recipient autre){
        verseur.mettreUnDans(reservoir);
        
        int resV = verseur.getQuantite();
        int resR = reservoir.getQuantite();
        
        assertEquals(9, resV);
        assertEquals(51, resR);
    }
    
    @Test
    public void remplir(Recipient autre){
        verseur.setQuantite(53);
        verseur.remplir(reservoir);
        
        int resV = verseur.getQuantite();
        int resR = reservoir.getQuantite();
        
        assertEquals(3, resV);
        assertEquals(100, resR);
    }
    
    @Test
    public void viderDans(Recipient autre){
        verseur.viderDans(reservoir);
        
        int resV = verseur.getQuantite();
        int resR = reservoir.getQuantite();
        
        assertEquals(3, resV);
        assertEquals(100, resR);
    }
    
    @Test
    public void getQuantite(){
        int resR = reservoir.getQuantite();
        
        assertEquals(50, resR);
    }
    
    @Test
    public void getCapacite(){
        int capR = reservoir.getCapacite();
        
        assertEquals(100, capR);
    }
    
    @Test
    public void getEspaceLibre(){
        reservoir.setQuantite(42);
        int freeR = reservoir.getEspaceLibre();
        
        assertEquals(58, freeR);
    }
    
    @Test
    public void estVide(){
        boolean b = reservoir.estVide();
        
        assertFalse(b);
        
        reservoir.setQuantite(0);
        
        b = reservoir.estVide();
        
        assertTrue(b);
    }
    
    @Test
    public void estPlein(){
        boolean b = reservoir.estPlein();
        
        assertFalse(b);
        
        reservoir.setQuantite(100);
        
        b = reservoir.estVide();
        
        assertTrue(b);
    }
}
