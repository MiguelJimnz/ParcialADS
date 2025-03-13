package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<LineaTelefonica> lineasTelefonicas =new ArrayList<>();

        boolean continuar = true;

        while (continuar) {

//Menu
            System.out.println("""
                    Menu Llamadas
                    1->Crear llamada telefonica
                    2->Realizar llamada
                    3->Informacion detallada
                    4->Total
                    5->Reiniciar
                    6->Salir
                    
                    
                    
                    
                    
                    """);


            int opcion =scanner.nextInt();

            scanner.nextLine();


            switch (opcion){
                case 1->{
                    System.out.println("Crear nueva linea De telefono");
                    System.out.println("");


                    int minLlamadaLocal=50;
                    int minLlamadaLarDis=350;
                    int minLlamadaCelular=150;
                    int minutosLlamadaLocal=0;
                    int minutosLlamadaLargaDIs=0;
                    int minutosLlamadaCelular=0;
                    int costoLlamadas=0;
                    LineaTelefonica linea=new LineaTelefonica(minLlamadaLocal,minLlamadaLarDis,minLlamadaCelular,minutosLlamadaLocal,minutosLlamadaLargaDIs,minutosLlamadaCelular,costoLlamadas);
                    lineasTelefonicas.add(linea);
                    System.out.println(lineasTelefonicas);
                    System.out.println("Linea Creada");


                }
                case 2->{//Escoger tipo llamada
                    int opcionllamada= scanner.nextInt();
                    if(opcionllamada==1){
                        System.out.println("Cuanto ha demorado la llamada?");
                        int minutosCall=scanner.nextInt();


                    }
                }
                case 3->{//Informacion de cabinas
                    for(int i =0;i<lineasTelefonicas.size();i++){
                        System.out.println("[" + (i + 1) + "] "+ lineasTelefonicas.get(i).getCostoLlamadas()+ " "+lineasTelefonicas.get(i).getMinLlamadaCelular()+" "+lineasTelefonicas.get(i).getMinLlamadaLarDis()+" "+lineasTelefonicas.get(i).getMinLlamadaLocal()  );
                    }
                }
                case 4->{//Total Llamadas

                }
                case 5->{//reiniciar

                }
                case 6->{//salir
                    continuar=false;
                    System.out.println("Salir De Sistema");
                }
                default -> System.out.println("Opcion no disponible");
            }
        }
    }
}