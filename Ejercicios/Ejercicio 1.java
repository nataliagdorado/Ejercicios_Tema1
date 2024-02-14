public class Ejercicio1 {
    public static void main(String[] args) {
        int diasEnUnAnio = 365;
        byte horasEnUnDia = 24;
        byte minutosEnUnaHora = 60;
        byte segundosEnUnMinuto = 60;

        int segundosEnUnAnio = calcularSegundosEnUnAnio(diasEnUnAnio, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);

        System.out.println("El número de segundos en un año es: " + segundosEnUnAnio);
    }

    public static int calcularSegundosEnUnAnio(int dias, int horas, int minutos, int segundos) {
        return dias * horas * minutos * segundos;
    }
}

