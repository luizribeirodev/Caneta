/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caneta;

/**
 *
 * @author flavi
 */
public class Caneta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        canetaAzul Azul = new canetaAzul();
        Azul.estado = "destampada";
        
        Azul.escrever(Azul.estado);
        
    }
    
}