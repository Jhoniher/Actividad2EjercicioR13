//Ejercicio calcular descuento
import java.util.Scanner;
public class EjercicioResuelto13 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        double valor_compra=entrada.nextDouble();
        entrada.nextLine(); //Buffer
        String colorB;
        while(true){ //Ciclo para recibir color de bola
            System.out.println("Escriba el color de la bola: \n(blanca/verde/azul/amarilla/roja)");
            colorB=entrada.nextLine().toLowerCase();
            if(colorB.equals("blanca") || colorB.equals("verde") || colorB.equals("azul") || colorB.equals("amarilla") || colorB.equals("roja")){
                break;
            }
            else{
                System.out.println("El color ingresado es incorrecto. Intentelo de nuevo.");
            }
        }
        double descuento=0;
        if(colorB.equals("blanca")){ //Condicionales para calcular descuento
            descuento=0;
        } else if(colorB.equals("verde")) {
            descuento=valor_compra*0.10;
        } else if(colorB.equals("amarilla")){
            descuento=valor_compra*0.25;
        } else if(colorB.equals("azul")){
            descuento=valor_compra*0.50;
        } else if(colorB.equals("roja")){
            descuento=valor_compra;
        }
        double valor_pagar=valor_compra-descuento;
        //Impresiones
        System.out.println("Su descuento fue del: "+descuento);
        System.out.println("El valor a pagar es de: "+valor_pagar);
    }
}
