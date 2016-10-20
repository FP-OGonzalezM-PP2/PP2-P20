/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p20;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        a = pedirNumero();
        b = pedirNumero();
        calcularHermanos(a,b);
    }
    //Este metodo lo uso siempre, asique lo copio y lo pego de otros proyectos
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una cantidad");
        return n = entrada.nextInt();
    }
    public static void calcularHermanos(int a, int b){
        int i=1, j=1,c=0,d=0;
        for(i=1;i<a;i++){
            if(a%i==0){
                c = i + c;
                //En c, se iran guardando la suma de todos los divisores del número
            }
        }
        for(j=1;j<b;j++){
            //Analizara todos los divisores posibles hasta llegar al valor mismo del numero
            if(b%j==0){
                d = j + d;
            }
        }
        if(d==a && c==b){
            //Solo si la suma c es igual a "b" y la suma de d es igual a "a", seran hermanos
            System.out.println("Los números " +a +" y "+b +" son números hermanos");
        }else{
            System.out.println("Los números " +a +" y "+b +" no son números hermanos");
        }
    }
}
