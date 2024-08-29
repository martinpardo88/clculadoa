
package calculator;
import calculadora.operaciones.Operaciones;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Scanner entrada = new Scanner(System.in);
        String opcion="";
        System.out.println("1.Suma, 2.Resta. 3.Multiplicar, 4.Division, 5.Limpiar Acomulado 6.Salir");
        opcion = entrada.nextLine();
        double acomulado = 0;
        while(!opcion.equals("6"))
        if(opcion.equals("1")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado =acomulado+operaciones.sumar(numero1,numero2);
            acomulado = resultado;
            System.out.println("El resultado es:"+resultado);
            
        }
        if(opcion.equals("2")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado = acomulado - operaciones.restar(numero1,numero2);
            acomulado = resultado;
            System.out.println("El resultado es:"+resultado);        
    }
        if(opcion.equals("3")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado =operaciones.multiplicar(numero1,numero2);
            System.out.println("El resultado es:"+resultado);        
    
    }
        if(opcion.equals("4")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado =operaciones.dividir(numero1,numero2);
            System.out.println("El resultado es:"+resultado);        
        }
        if(opcion.equals("5")){
            acomulado = 0;
        }
    }
}


