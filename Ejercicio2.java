import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner imput = new Scanner(System.in);
        double peso, altura, ims;
        System.out.println("ingrese su peso");
        peso = imput.nextDouble();
        System.out.println("ingrese su altura");
        altura = imput.nextDouble();
        ims = peso/(altura*altura);
        if (ims>=18 && ims<=25){
            System.out.println("su indice de masa corporal es: " + ims + " ¡¡¡usted es saludable!!!");
        }
        System.out.println("su indice de masa corporal es: " + ims + " ¡¡¡usted no es saludable!!!");
    }
}
