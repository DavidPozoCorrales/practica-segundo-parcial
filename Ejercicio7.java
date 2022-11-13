import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("ingresa el numero casillas que desea tener(no mayor a 180)");
        int auxi = entrada.nextInt();
        if (auxi>180){
          System.out.println("error casillas no validas");
        }
        else{
    
        int[] codigo = new int[auxi];
        int[] pp = new int[auxi];
        int[] sp = new int[auxi];
        int[] tp = new int[auxi];
        String[] nombre = new String[auxi];
        int contador = 0;
        int aux = 0;
        double aux2 = 0;
        String aux3;
        int opcion = 0;
        for (int i = 0;i<1000;i++){
        System.out.println("que desea hacer a continuacion?");
        System.out.println("para ingresar estudiante marque 1");
        System.out.println("para retirar estudiante marque 2");
        System.out.println("para ingresar nota marque 3");
        System.out.println("para mostrar estudiantes aprobados, reprobados y lista completa marque 4");
        System.out.println("para mostrar notas de estudiante especifico marque 5");
        opcion = entrada.nextInt();
          if (opcion==1){
            System.out.println("ingresar el nombre del estudiante: ");
            nombre[i] = entrada2.nextLine();
            codigo[i] = (int) (Math.random()*((10000-1000)+1))+1000;
            pp[i] = 00;
            sp[i] = 00;
            tp[i] = 00;
            System.out.println("ingresado correctamente!");
            System.out.println();
            contador = contador+1;
          }
          else if(opcion == 2){
            System.out.println("numero de estudiante - nombre - codigo");
            for(int j=0;j<auxi;j++){
            System.out.println((j+1) + " " + nombre[j] + " " + codigo[j]);
          }
            System.out.println("elige el numero de estudiante a eliminar");
            aux = entrada.nextInt();
            nombre[aux-1] = "retirado";
            codigo[aux-1] = 0;
            pp[aux-1] = 00;
            sp[aux-1] = 00;
            tp[aux-1] = 00;
            
          }
          else if(opcion == 3){
            System.out.println("numero de estudiante - nombre - codigo");
            for(int j=0;j<auxi;j++){
            System.out.println((j+1) + " " + nombre[j] + " " + codigo[j]);
          }
            System.out.println("elige el numero de estudiante a ingresar/cambiar notas");
            aux = entrada.nextInt();
            System.out.println("primer parcial");
            pp[aux-1] = entrada.nextInt();
            System.out.println("segundo parcial");
            sp[aux-1] = entrada.nextInt();
            System.out.println("examen final");
            tp[aux-1] = entrada.nextInt();
            System.out.println("notas cambiadas con exito!");
            for(int j=0;j<auxi;j++){
                System.out.println("numero de estudiante - nombre - codigo - primer parcial - segundo parcial - examen final");
            System.out.println((j+1) + " " + nombre[j] + " " + codigo[j] + "------" + pp[j] + " " + sp[j] + " " + tp[j]);
          }
          }
          else if(opcion == 4){
            System.out.println("numero de estudiante - nombre - codigo - primer parcial - segundo parcial - examen final - estado");
            for(int j=0;j<auxi;j++){
                aux2 = (pp[j] + sp[j] + tp[j])/3;
                if(aux2<51){
                    aux3 = "REPROBADO";
                }
                else{
                    aux3 = "APROBADO";
                }
            
            System.out.println((j+1) + " " + nombre[j] + " " + codigo[j] + "-----" + pp[j] + " " + sp[j] + " " + tp[j] + "  " + aux3);
          }
          }
          else if(opcion == 5){
            System.out.println("numero de estudiante - nombre - codigo");
            for(int j=0;j<auxi;j++){
            System.out.println((j+1) + " " + nombre[j] + " " + codigo[j]);
          }
          System.out.println("elige el numero de estudiante a mostrar nota");
            aux = entrada.nextInt();
            System.out.println();
            System.out.println("las notas del estudiante son:");
            System.out.println("primer parcial: " + pp[aux-1]);
            System.out.println("segundo parcial: " + sp[aux-1]);
            System.out.println("examen final: " + tp[aux-1]);
          }
          else{
            System.out.println("opcion inexistente intente de nuevo");
          }
          }
        }
    }
}
