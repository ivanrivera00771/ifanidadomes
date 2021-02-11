package pedirmes;

import java.util.Scanner;

public class Pedirmes {

    public static void main(String[] args) {
        //PEDIR EL DIA, MES Y AÑO DE UNA FECHA E INDICAR 
        //SI LA FECHA ES CORRECTA.SUPONINEDO QUE TODOS
        //LOS MESES SON DE 30 DIAS 

        int dia;
        int mes;
        int año;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE DIA");
        dia = entrada.nextInt();

        System.out.println("INGRESE MES");
        mes = entrada.nextInt();

        System.out.println("INGRESE AÑO");
        año = entrada.nextInt();

        if (dia >= 1 && dia <= 30) { //SI EL DIA ES CORRECTO
            //una vez que el dia sera correcto 
            //ahora comprobamos que el mes es incorrecto 

            if (mes >= 1 && dia <= 12) { //SI EL AÑO ES CORRECTO

                if (año != 0) { // SI EL AÑO ES CORRECTO
                    System.out.println("LA FECHA ES CORRECTA");
                    System.out.println("LA FECHA ES :" + dia + mes + año);

                } else {
                    System.out.println("LA FECHA ES INCORRECTA, AÑO INCORRECTO");
                }

            } else {
                System.out.println("LA FECHA INCORRECTA, MES INCORRECTO");
            }

        } else {
            System.out.println("LA FECHA ES INCORRECTA, DIA INCORRECTO");

        }

    }

}
