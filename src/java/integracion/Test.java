/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {
        // TODO code application logic here   
        Double decimal = 0.99996;
        decimal = Math.floor(decimal * 100) / 100;
        System.out.print(decimal);
    }
}
