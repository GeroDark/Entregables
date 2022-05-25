public class Main {
    public static void main(String[] args) {

        int numerolf = -3;

        if (numerolf > 0){
            System.out.println("El numero es positivo");
        }
        else if (numerolf < 0){
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es 0");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        }while (numeroWhile >10);

        for(int numeroFor = 0 ;numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "verano";

        switch (estacion){
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("Ingreso una estacion invalida");
                break;
        }
    }
}