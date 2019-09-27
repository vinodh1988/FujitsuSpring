package com.system.xml;

public interface Manufacture {
   default public void procure(){
      System.out.println("Raw materials and spare parts procured");
   }
   public void assemble();
   public void paint();
    
}
