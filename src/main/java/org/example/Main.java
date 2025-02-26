package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner voto = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de votación");
        boolean salir = true;
        int conteo_votos = 0;
        int votos_candidato_uno = 0;
        int costo_camp_cand_uno = 0;
        int votos_candidato_dos = 0;
        int costo_camp_cand_dos = 0;
        int votos_candidato_tres = 0;
        int costo_camp_cand_tres = 0;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Votar");
            System.out.println("2. Costo de campaña");
            System.out.println("3. Vaciar urnas");
            System.out.println("4. Número de votos totales");
            System.out.println("5. Porcentaje de votos obtenidos por cada candidato ");
            System.out.println("6. Costo promedio de campañas en elecciones");
            int decision = voto.nextInt();
            switch (decision){
                case 1:
                        System.out.println("Elija el candidato por cual votar");
                        System.out.println("1. Candidato 1");
                        System.out.println("2. Candidato 2");
                        System.out.println("3. Candidato 3");
                        System.out.println("4. Salir del programa");
                        int decision2 = voto.nextInt();
                        switch (decision2){
                            case 1:
                                System.out.println("¿Su voto fue influenciado por que medio? :");
                                System.out.println("1. Internet");
                                System.out.println("2. Radio");
                                System.out.println("3. Televisión");
                                int decision3 = voto.nextInt();
                                switch (decision3){
                                    case 1:
                                        if (decision3 == 1){
                                            costo_camp_cand_uno += 700000;
                                        }
                                        break;
                                    case 2:
                                        if (decision3 == 2){
                                            costo_camp_cand_uno += 200000;
                                        }
                                        break;
                                    case 3:
                                        if (decision3 == 3){
                                            costo_camp_cand_uno += 600000;
                                        }
                                        break;
                                }
                                System.out.println("Soy el candidato " + decision2 + " Y tengo " + votos_candidato_uno + " votos");
                                conteo_votos++;
                                votos_candidato_uno++;
                                System.out.println(costo_camp_cand_uno);
                                break;
                            case 2:
                                System.out.println("¿Su voto fue influenciado por que medio? :");
                                System.out.println("1. Internet");
                                System.out.println("2. Radio");
                                System.out.println("3. Televisión");
                                int decision4 = voto.nextInt();
                                switch (decision4){
                                    case 1:
                                        if (decision4 == 1){
                                            costo_camp_cand_dos += 700000;
                                        }
                                        break;
                                    case 2:
                                        if (decision4 == 2){
                                            costo_camp_cand_dos += 200000;
                                        }
                                        break;
                                    case 3:
                                        if (decision4 == 3){
                                            costo_camp_cand_dos += 600000;
                                        }
                                        break;
                                }
                                System.out.println("Soy el candidato " + decision2 + " Y tengo " + votos_candidato_dos + " votos");
                                conteo_votos++;
                                votos_candidato_dos++;
                                System.out.println(costo_camp_cand_dos);
                                break;
                            case 3:
                                System.out.println("¿Su voto fue influenciado por que medio? :");
                                System.out.println("1. Internet");
                                System.out.println("2. Radio");
                                System.out.println("3. Televisión");
                                int decision5 = voto.nextInt();
                                switch (decision5){
                                    case 1:
                                        if (decision5 == 1){
                                            costo_camp_cand_tres += 700000;
                                        }
                                        break;
                                    case 2:
                                        if (decision5 == 2){
                                            costo_camp_cand_tres += 200000;
                                        }
                                        break;
                                    case 3:
                                        if (decision5 == 3){
                                            costo_camp_cand_tres += 600000;
                                        }
                                        break;
                                }
                                System.out.println("Soy el candidato " + decision2 + " Y tengo " + votos_candidato_tres + " votos");
                                conteo_votos++;
                                votos_candidato_tres++;
                                System.out.println(costo_camp_cand_tres);
                                break;
                            case 4:
                                salir = false;
                                break;
                        }
                    break;
                case 2:
                    System.out.println("Conozca los costo de campaña de los candidatos: ");
                    System.out.println("1. Candidato 1");
                    System.out.println("2. Candidato 2");
                    System.out.println("3. Candidato 3");
                    System.out.println("4. Salir del programa");
                    int decision6 = voto.nextInt();
                    switch (decision6){
                        case 1:
                            System.out.println("Los costos de campaña del candidato "+ decision6 + " Fueron $" + costo_camp_cand_uno);
                            break;
                        case 2:
                            System.out.println("Los costos de campaña del candidato "+ decision6 + " Fueron $" + costo_camp_cand_dos);
                            break;
                        case 3:
                            System.out.println("Los costos de campaña del candidato "+ decision6 + " Fueron $" + costo_camp_cand_tres);
                            break;
                    }
                    break;
                case 3:
                    conteo_votos = 0;
                    votos_candidato_uno = 0;
                    votos_candidato_dos = 0;
                    votos_candidato_tres = 0;
                    costo_camp_cand_uno = 0;
                    costo_camp_cand_dos = 0;
                    costo_camp_cand_tres = 0;
                    System.out.println("Las urnas fueron vaciadas con éxito");
                    System.out.println("Candidato 1 votos: " + votos_candidato_uno + " Costo campaña: " + costo_camp_cand_uno);
                    System.out.println("Candidato 2 votos: " + votos_candidato_dos + " Costo campaña: " + costo_camp_cand_dos);
                    System.out.println("Candidato 3 votos: " + votos_candidato_tres + " Costo campaña: " + costo_camp_cand_tres);
                    break;
                case 4:
                    System.out.println("El número de votos totales del candidato 1 son: " + votos_candidato_uno);
                    System.out.println("El número de votos totales del candidato 2 son: " + votos_candidato_dos);
                    System.out.println("El número de votos totales del candidato 3 son: " + votos_candidato_tres);
                    System.out.println("El número de votos totales entre todos los candidatos es: " + conteo_votos);
                    break;
                case 5:
                    try {
                        System.out.println("PORCENTAJE DE VOTOS POR CADA CANDIDATO: ");
                        System.out.println("Candidato 1: " + (100*votos_candidato_uno/conteo_votos) + "%");
                        System.out.println("Candidato 2: " + (100*votos_candidato_dos/conteo_votos) + "%");
                        System.out.println("Candidato 3: " + (100*votos_candidato_tres/conteo_votos) + "%");
                    }catch (ArithmeticException e){
                        System.out.println("No existen votos. Vote!|");
                    }

                    break;
                case 6:
                    try {
                        System.out.println("COSTO PROMEDIO DE CAMPAÑA POR CANDIDATO: ");
                        System.out.println("Candidato 1: $" + (costo_camp_cand_uno/votos_candidato_uno));
                        System.out.println("Candidato 2: $" + (costo_camp_cand_dos/votos_candidato_dos));
                        System.out.println("Candidato 3: $" + (costo_camp_cand_tres/votos_candidato_tres));
                    }catch (ArithmeticException e){
                        System.out.println("No existen votos. Vote!");
                    }

                    break;
            }
        }while (salir);

    }
}