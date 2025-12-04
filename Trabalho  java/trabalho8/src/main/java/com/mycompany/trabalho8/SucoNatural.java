
package com.mycompany.trabalho8;

public class SucoNatural extends Bebida {
    private String sabor;
    
    public SucoNatural(String sabor){
        super("Suco Natural de " + sabor, 250);
        this.sabor = sabor;
    }
    
    public String getSabor(){
        return sabor;
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
        setNome("Suco Natural de " + sabor);
    }
    
    @Override
    public boolean ehRefrescante(){
        if(sabor == null){
            return true;
        }
        String s = sabor.trim(); // remove espaços
        return !s.equalsIgnoreCase("beterraba");
    }
    
    @Override
    public String descricaoCompleta(){
        return "Suco: " + getNome() + ", Sabor: " + sabor + ", Volume: " + getVolumeMl() + " mL";
    }
}
