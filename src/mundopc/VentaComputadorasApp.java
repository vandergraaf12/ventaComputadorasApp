package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VentaComputadorasApp {
    public static void main(String[] args) {
        // Crear objetos
        Raton ratonLenovo = new Raton("bluetooth","Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth","Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo",27);
        //System.out.println(monitorLenovo);
        // Creamos un objeto de tipo Computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
        //System.out.println(computadoraLenovo);

        // Pbjeto computadora
        Monitor monitorDell = new Monitor("Monitor Dell", 15);
        Teclado tecladoDell = new Teclado("USB","Dell");
        Raton ratonDell = new Raton("USB","Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell",
                monitorDell, tecladoDell,ratonDell);


        // Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        // Computador Mac
        Monitor monitorMac = new Monitor("Mac",27);
        Teclado tecladoMac = new Teclado("Bluetooth","Mac");
        Raton ratonMac = new Raton("Bluetooth","Mac");
        Computadora computadoraImac = new Computadora("iMac", monitorMac,tecladoMac,ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraImac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();
    }
}