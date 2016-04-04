/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git1;

/**
 *
 * @author bphou
 */
public class Recipient {
    private int quantite;
    private int capacite;
    private boolean remplis;
    
    public Recipient(){
        quantite = 0;
        capacite = 100;
        remplis = false;
    }
    public Recipient(int quantite){
        this.quantite = quantite;
        capacite = 100;
        if (capacite == quantite)
            remplis = true;
        else remplis = false;
    }
    
    public int getQuantite(){
        return quantite;
    }
    public int getCapacite(){
        return capacite;
    }
    public boolean getRemplis(){
        return remplis;
    }
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
    public void setRemplis(boolean remplis){
        this.remplis = remplis;
    }
    
    public void mettreUnDans(Recipient autre){
        if (autre != null && quantite > 0 && autre.getQuantite() < autre.getCapacite()){
            quantite -= 1;
            remplis = false;
            autre.setQuantite(autre.getQuantite() + 1);
            if (autre.getQuantite() == autre.getCapacite())
                autre.setRemplis(true);
            else autre.setRemplis(false);
        }
    }
    public void remplir(Recipient autre){
        if (autre != null && autre.getRemplis() != true && quantite >= (autre.getCapacite() - autre.getQuantite())){
            quantite -= (autre.getCapacite() - autre.getQuantite());
            remplis = false;
            autre.setQuantite(autre.getCapacite());
            autre.setRemplis(true);
        }
    }
    public void viderDans(Recipient autre){
        if (autre != null && quantite > 0 && quantite <= (autre.getCapacite() - autre.getQuantite())){
            autre.setQuantite(autre.getQuantite() + quantite);
            if (autre.getQuantite() == autre.getCapacite())
                autre.setRemplis(true);
            else autre.setRemplis(false);
            quantite = 0;
            remplis = false;
        }
    }
}
