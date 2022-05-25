public class Main {


    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 20;
        int valor3 = 30;

       suma(valor1,valor2,valor3);

       Carro miCarrito = new Carro ();
       miCarrito.Qpuerta();
       System.out.println(miCarrito.puertas);


    }
    public static void suma(int a, int b, int c) {

        System.out.println(a+b+c);

    }
    static class Carro {
        public int puertas = 4;

        public void Qpuerta(){
            this.puertas++;
        }
    }
}