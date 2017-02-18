/* //Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a06.p2;
import java.util.Scanner;
/**
 *
 * @author ivan
 */
public class SPP2IConstantinoHA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num,i,fact=1;
        boolean flag=true;
        System.out.println("Calculadora de factoriales");
        while(flag==true)
        {
        num =solicitardatos();
        if ((num<=10)&(num>0))
        {
        for (i=1;i<=num;i++){
        fact=fact*i;}
        System.out.println("El número factorial es: "+fact);
        flag=false;
        }
        else{
                System.out.println("Fuera de rango");
                flag=true;
                }
        }
                
    }
    static int solicitardatos(){
        Scanner key = new Scanner (System.in);
        int numero=0;
        boolean flag=true;
        while (flag==true){
        try{
        System.out.println("Ingresa un número entero entre 0 y 10: ");
        numero=key.nextInt();
        flag=false;}
        catch(Exception e){
            System.out.println("Fuera de rango");
            key.next();
            flag=true;
        }
                          }
        return numero;
    }
    
}
