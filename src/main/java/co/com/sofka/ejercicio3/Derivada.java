package co.com.sofka.ejercicio3;

import java.util.Scanner;

public class Derivada {
    private static Scanner scanner = new Scanner(System.in);

    public void derivada1(int numero) {
        System.out.println("[DERIVADA DE FUNCION f(x) = x --> f'(x) = 0]");
        System.out.println("La DERIVADA de f(x) = " + numero + "x es --> f'(x) = 0" + "\n");
    }

    public void derivada2(int numero) {
        System.out.println("[DERIVADA DE FUNCION f(x) = ax --> f'(x) = a]");
        System.out.println("La DERIVADA de f(x) = " + numero + "x es --> f'(x) = " + numero + "\n");
    }

    public void derivada3(int numero, int potencia) {
        System.out.println("[DERIVADA DE FUNCION f(x) = x^n --> f'(x) = n.x^n-1]");
        if (potencia == 0) {
            System.out.println("La DERIVADA de f(x) = " + numero + "x^" + potencia +
                    " es --> f'(x) = 0\n");
        } else {
            int resultado = numero * potencia;

            System.out.println("La DERIVADA de f(x) = " + numero + "x^" + potencia +
                    " es --> f'(x) = " + resultado + "x^" + (potencia - 1) + "\n");
        }
    }

}
