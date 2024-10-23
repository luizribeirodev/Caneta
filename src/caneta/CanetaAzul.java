/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caneta;

/**
 *
 * @author flavi
 */
class canetaAzul {

    String estado;

   public void  escrever(String estado) {
        if("tampada".equals(estado)){
            System.out.println("Voce nao pode escrever com a caneta tampada.");
        }else{
                System.out.println("Voce pode escrever.");
        }
      
    }
    
}