import java.util.Scanner;
public class EjercicioResuelto13 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        double valor_compra=entrada.nextDouble();
        entrada.nextLine(); //Buffer
        String colorB;
        while(true){
            System.out.println("Escriba el color de la bola: \n(blanca/verde/azul/amarilla)");
            colorB=entrada.nextLine().toLowerCase();
            if(colorB.equals("blanca") || colorB.equals("verde") || colorB.equals("azul") || colorB.equals("amarilla")){
                break;
            }
            else{
                System.out.println("El color ingresado es incorrecto. Intentelo de nuevo.");
            }
        }
        System.out.println(valor_compra);
        System.out.println(colorB);


    }
}
