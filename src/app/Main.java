package app;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] productos = {"Hamburguesa", "Perro caliente", "Papas fritas"};
        String[] turnos = {"Almuerzo", "Tarde", "Noche", "Madrugada"};

        double[][] ventas = new double[3][4];

        registrarVentas(ventas, productos, turnos);

        identificarMayor(ventas, productos, turnos);

    }

    public static void registrarVentas(double[][] ventas, String[] productos, String[] turnos) {

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < turnos.length; j++) {
                System.out.println("Ingrese el valor de la venta de " + productos[i] + " en el turno de " + turnos[j] + ": ");
                ventas[i][j] = validarDato();
            }
        }
    }
    

    public static double validarDato() {
        double dato = 0;
        while (true) {
            if (!sc.hasNextDouble()) {
                System.out.println("Error: Ingrese un valor válido");
                sc.next();
                continue;
            }
            dato = sc.nextDouble();
            if (dato < 0) {
                System.out.println("Error: Ingrese un número mayor o igual a 0.");
                continue;
            }
            return dato;
        }
    }

    public static void identificarMayor(double[][] ventas,
                                        String[] productos,
                                        String[] turnos) {

        double mayor = ventas[0][0];
        int fila = 0;
        int columna = 0;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {

                if (ventas[i][j] > mayor) {
                    mayor = ventas[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }

        System.out.println("La venta mayor fue de: $" + mayor);
        System.out.println("Producto: " + productos[fila]);
        System.out.println("Turno: " + turnos[columna]);
    }
}