public class Ejercicio3 {
    public static void main(String[]args){
        int[] notas = new int[70];
        System.out.println("las notas son:");
        for (int i=0;i<70;i++){
            notas[i] = (int)(Math.random()*99);
            System.out.println((i) + ":  " + notas[i]);
        }
        int aux = 0;
        for(int i = 0;i < 69;i++){
            for(int j = 0;j <69;j++){
                if(notas[j] > notas[j+1]){
                aux = notas[j];
                notas[j] = notas[j+1];
                notas[j+1] = aux;
                }
            }
        }
        System.out.println("las dos notas mas altas son: " + notas[68] + " " + notas[69]);
    }
}
