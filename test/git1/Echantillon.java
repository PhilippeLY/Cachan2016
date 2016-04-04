/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git1;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author joshua de vega
 */
public class Echantillon {
     private int max;
    private int min;
    private int moy;
    private List<Double> Enchantillon;
    private int taille;

    public void Enchantillon(){
        this.Enchantillon = new ArrayList<Double>();
    }
    
    public List<Double> getEnchantillon() {
        return Enchantillon;
    }

    public void setEnchantillon(List<Double> Enchantillon) {
        this.Enchantillon = Enchantillon;
    }

    
    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMoy() {
        return moy;
    }

    public void setMoy(int moy) {
        this.moy = moy;
    }

    public void ajouter(double d) {
       Enchantillon.add(d);
    }
   
    
     
     
     
}
