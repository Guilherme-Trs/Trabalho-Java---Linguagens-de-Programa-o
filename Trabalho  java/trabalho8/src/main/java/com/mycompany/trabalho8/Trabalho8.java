package com.mycompany.trabalho8;

public class Trabalho8 {

    public static void main(String[] args) {

        System.out.println("============================="); 
        System.out.println("Teste classe de Bebidas"); 

        
        Bebida bebida1 = new Bebida("Coca-Cola", 350);
        System.out.println(bebida1.descricaoCompleta());
        System.out.println("Eh leve? " + bebida1.ehLeve());
        System.out.println("Eh refrescante? " + bebida1.ehRefrescante());
        
        System.out.println("============================="); 

        
        Bebida bebida2 = new Bebida("Guarana", 350);
        System.out.println(bebida2.descricaoCompleta());
        System.out.println("Eh leve? " + bebida2.ehLeve());
        System.out.println("Eh refrescante? " + bebida2.ehRefrescante());

        System.out.println("============================="); 

       
        SucoNatural suco1 = new SucoNatural("Laranja");
        System.out.println(suco1.descricaoCompleta());
        System.out.println("Eh leve? " + suco1.ehLeve());
        System.out.println("Eh refrescante? " + suco1.ehRefrescante());
        
                
        System.out.println("============================="); 

        
        suco1.setSabor("Uva"); 
        suco1.getSabor();   
        System.out.println(suco1.descricaoCompleta());
        
        System.out.println("============================="); 

        
        SucoNatural s1 = new SucoNatural("Limao");
        System.out.println("Sabor: " + s1.getSabor());
        System.out.println("Eh refrescante ?" + s1.ehRefrescante());
        
        System.out.println("");

        SucoNatural s2 = new SucoNatural("Beterraba");
        System.out.println("Sabor: " + s2.getSabor());
        System.out.println("Eh refrescante ?" + s2.ehRefrescante());
        
        System.out.println("=============================");
        
        SucoNatural s3 = new SucoNatural("Caldo de Cana");
        System.out.println(s3.descricaoCompleta());

        
        
    }
}
