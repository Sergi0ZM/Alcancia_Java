package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner opcion = new Scanner(System.in);
        System.out.println("Bienvenido, seleccione una opción: ");
        System.out.println("1. Agregar una nueva moneda");
        int desicion = opcion.nextInt();
        boolean salir = true;
        int nueva_moneda = 0;
        int cantidad_monedas = 0;
        int cantidad_monedas_veinte = 0;
        int cantidad_monedas_cincuenta = 0;
        int cantidad_monedas_cien = 0;
        int cantidad_monedas_doscientos = 0;
        int cantidad_monedas_quinientos = 0;
        do {
            switch (desicion) {
                case 1:
                    System.out.println("Seleccione una de las siguientes cantidades a ingresar: ");
                    System.out.println("1. $20 || 2. $50 || 3. $100 || 4. $200 || 5. $500 ");
                    System.out.println("6. Menu de opciones ");
                    System.out.println("7. Salir ");
                    int desicion2 = opcion.nextInt();
                    switch (desicion2){
                        case 1:
                            if (desicion2 == 1){
                                System.out.println("Usted ingreso una moneda de $20");
                                nueva_moneda += 20;
                                cantidad_monedas++;
                                cantidad_monedas_veinte++;
                            }
                            break;
                        case 2:
                            if (desicion2 == 2){
                                System.out.println("Usted ingreso una moneda de $50");
                                nueva_moneda += 50;
                                cantidad_monedas++;
                                cantidad_monedas_cincuenta++;
                            }
                            break;
                        case 3:
                            if (desicion2 == 3){
                                System.out.println("Usted ingreso una moneda de $100");
                                nueva_moneda += 100;
                                cantidad_monedas++;
                                cantidad_monedas_cien++;
                            }
                            break;
                        case 4:
                            if (desicion2 == 4){
                                System.out.println("Usted ingreso una moneda de $200");
                                nueva_moneda += 200;
                                cantidad_monedas++;
                                cantidad_monedas_doscientos++;
                            }
                            break;
                        case 5:
                            if (desicion2 == 5){
                                System.out.println("Usted ingreso una moneda de $500");
                                nueva_moneda += 500;
                                cantidad_monedas++;
                                cantidad_monedas_quinientos++;
                            }
                            break;

                        case 6:
                                System.out.println("1. ¿Cuantas monedas tengo?");
                                System.out.println("2. Total de mi dinero ahorrado");
                                System.out.println("3. Romper alcancia");
                                System.out.println("4. Salir del menu");
                            int desicion3 = opcion.nextInt();
                            switch (desicion3){
                                case 1:
                                    if (desicion3 == 1){
                                        System.out.println("El total de sus monedas es: " + cantidad_monedas);
                                        System.out.println("Usted tiene " + cantidad_monedas_veinte + " monedas de $20");
                                        System.out.println("Usted tiene " + cantidad_monedas_cincuenta + " monedas de $50");
                                        System.out.println("Usted tiene " + cantidad_monedas_cien + " monedas de $100");
                                        System.out.println("Usted tiene " + cantidad_monedas_doscientos + " monedas de $200");
                                        System.out.println("Usted tiene " + cantidad_monedas_quinientos + " monedas de $500");
                                    }

                                    break;
                                case 2:
                                    if (desicion3 == 2){
                                        System.out.println("El total de su dinero es $ " + nueva_moneda);
                                    }
                                    break;
                                case 3:
                                    if (desicion3 == 3){
                                        System.out.println("Ha roto su alcancia con $ " + nueva_moneda);
                                        nueva_moneda = 0;
                                        cantidad_monedas = 0;
                                        cantidad_monedas_veinte = 0;
                                        cantidad_monedas_cincuenta = 0;
                                        cantidad_monedas_cien = 0;
                                        cantidad_monedas_doscientos = 0;
                                        cantidad_monedas_quinientos = 0;
                                        System.out.println("Su alcancia cuenta con $ " + nueva_moneda + " Y con "+ cantidad_monedas + " Cantidad de monedas");
                                    }
                                    break;
                                case 4:
                                    if (desicion2 == 4){
                                        salir = false;
                                    }
                                    break;
                            }
                            break;
                        case 7:
                            if (desicion2 == 7){
                                salir = false;
                            }
                            break;
                    }
                    break;
            }
        } while (salir);




    }
}