
public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        int nuevaPuerta = coche1.sumaPuertas(3);
        System.out.println(nuevaPuerta);

        int resultado;
        resultado = suma(2,3,4);

        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
    }
};
