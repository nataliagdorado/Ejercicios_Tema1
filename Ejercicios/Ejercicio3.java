public class Ejercicio3 {
    public static void main(String[]args){
        int primerNumero=1;
        int ultimoNumero=100;
        int[] multiplos = getMultiplosDe5(primerNumero,ultimoNumero);
        int suma = sumaMultiplos(multiplos);

        System.out.println("Multiplos de 5");
        for (int multiple : multiplos){
            System.out.println(multiple);
        }
            System.out.println("Suma de los multiplos de 5: "+suma);
            System.out.println("Numero de multiplos de 5: " +multiplos.length); 

        }

        public static int[] getMultiplosDe5(int primerNumero, int ultimoNumero){
        // Primero cuento cuantos hay
        int contador=0;
        for(int i=primerNumero;i<=ultimoNumero;i++){
            if(i%5==0){
                contador++;
            }
        }
        // mi array tiene el tamaño de contador
        int[]multiplos=new int[contador];
    int total=0;
    for(int i=primerNumero;i<=ultimoNumero;i++){
        if(i%5==0){
            multiplos[total]=i;
            total++;
        }
    }
     return multiplos;   
    
}
public static int sumaMultiplos(int[]array){
    int suma=0;
    for(int num:array){
        suma+=num;
    }
    return suma;
}
    
}