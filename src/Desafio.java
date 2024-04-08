import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //Declarar variables
        String cliente="Tony Stark";
        String tipCuenta="Corriente";
        double saldoDisp=1500;
        int opcionMenu=0;
        double retirar, depositar;

        System.out.println("**************************");
        String datosCliente= """
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f $
                """.formatted(cliente,tipCuenta,saldoDisp);
        System.out.println(datosCliente);
        System.out.println("**************************");

        String menu= """
                **Escriba el numero de la opcion deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while(opcionMenu!=9){

            System.out.println(menu);
            opcionMenu=entrada.nextInt();

            switch (opcionMenu) {
                case 1 ->
                        System.out.println("El saldo actual es: " + saldoDisp);
                case 2 -> {
                        System.out.println("Ingrese el monto a retirar: ");
                        retirar = entrada.nextDouble();
                        if (retirar > saldoDisp) {
                            System.out.println("Saldo insuficiente");
                        } else {
                            saldoDisp -= retirar;
                            System.out.println("Saldo restante: " + saldoDisp);
                        }
                }
                case 3 -> {
                        System.out.println("Ingrese el monto a depositar: ");
                        depositar = entrada.nextDouble();
                        saldoDisp += depositar;
                        System.out.println("El saldo actual es: " + saldoDisp);
                }

                case 9 ->
                        System.out.println("Gracias por usar nuestros servicios");

                default ->
                        System.out.println("Opcion no valida, ingrese de nuevo. ");
            }
        }





    }
}