import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]args){
      Scanner imput = new Scanner(System.in);
      Scanner imput2 = new Scanner(System.in);
      String[] nombres = new String[20];
      int[] sueldos = new  int[20];
      int aux;
      String aux2;
      for (int i = 0;i<20;i++){
          System.out.print("ingrese el nombre del empleado " + (i+1) + " :");
          nombres[i] = imput2.nextLine();
          System.out.print("ingrese el sueldo del empleado " + (i+1) + " :");
          sueldos[i] = imput.nextInt();
      }
      System.out.println();
      System.out.println("la lista de empleados es:");
      System.out.println();
    
      for (int i = 0;i<20;i++){
          System.out.println((i+1) + "  " + nombres[i] + "     " + sueldos[i]);
      }
      for(int i = 0;i < 19;i++){
        for(int j = 0;j < 19;j++){
            if(sueldos[j] > sueldos[j+1]){
            aux = sueldos[j];
            sueldos[j] = sueldos[j+1];
            sueldos[j+1] = aux;
            aux2 = nombres[j];
            nombres[j] = nombres[j+1];
            nombres[j+1] = aux2;
            }
        }
      }
      System.out.println();
      System.out.println("los dos sueldos mas altos son:");
      System.out.println();
      System.out.println(nombres[18] + "  " + sueldos[18]);
      System.out.println(nombres[19] + "  " + sueldos[19]);

  }
}
