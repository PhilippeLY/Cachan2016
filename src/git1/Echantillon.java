/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author joshua de vega
 */
public class Echantillon {
    private List<Double> valeurs;

    public Echantillon(){
        valeurs = new ArrayList<Double>();
    }
    
    public int getTaille() {
        return valeurs.size();
    }


    public double getMax() {
        return Collections.max(valeurs);
    }

     public double getMin() {
        return Collections.min(valeurs);
    }

    public double getMoy() {
        double sum = 0;
        
        for(Double val : valeurs){
            sum += val;
        }
        
        return sum / valeurs.size();
    }

     public void ajouter(double d) {
       valeurs.add(d);
    }
   
    
     
     
     
}
