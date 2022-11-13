import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner imput = new Scanner(System.in);
        int numero, aux, aux2,aux3;
        System.out.println("ingrese el numero de casillas");
        numero = imput.nextInt();
        int[] casillas = new int[numero];
        for(int i = 0;i<numero;i++){
            casillas[i] = (int)(Math.random()*500);
        }
        System.out.println("el lista inicial es: ");
        for(int i = 0;i<numero;i++){
            System.out.println((i+1) + "  " + casillas[i]);
        }
        System.out.print("ingresa la primera posicion a intercambiar: ");
        aux = imput.nextInt();
        aux = aux-1;
        System.out.print("ingresa la segunda posicion a intercambiar: ");
        aux2 = imput.nextInt();
        aux2 = aux2-1;
        aux3 = casillas[aux];
        casillas[aux] = casillas[aux2];
        casillas[aux2] = aux3;
        System.out.println("la lista modificada es:");
        for(int i = 0;i<numero;i++){
            System.out.println((i+1) + "  " + casillas[i]);
        }
    }
}
