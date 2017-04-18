/*Maythe Portales Barrios
Solucion de Problemas con programacion

 */
package spp2.mportalesb.a13;
import javax.swing.JOptionPane;
/**
 *
 * @author may37
 */
public class SPP2MPortalesBA13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double e, p, imc;
        System.out.println("Calculadora IMC");
        e= metodo("Introduce la estatura");
        p = metodo ("Introduce el peso");
        imc= p/(e*e);
        JOptionPane.showMessageDialog(null,"El IMC es " + imc );
    }
    public static double metodo (String dato){
        boolean flag;
        double infor=0;
        do{
         try{   
        String info= JOptionPane.showInputDialog(null, dato);
        infor= Double.parseDouble(info);
        flag= false;
         } catch (Exception ex){
             System.out.println("Introduce el dato pedido");
             flag= true;
             System.out.println("");
         } 
        }while (flag);       
        return infor;
    }
}
