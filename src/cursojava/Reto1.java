package cursojava;

import java.util.Scanner;

public class Reto1 {
    public static String assignaturas[] = {"Matematicas", "Ciencias", "Informaticas", "Deportes"};
    public static int notas[][] = new int [4][4];
    public static String estudiante;
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        menu(leer);
    }
    public static Boolean checkInput(int input){
        if(input < 0) {
            System.out.println("Valor No puede ser menor a 0");
            return false;
        }else if (input > 100){
            System.out.println("Valor No puede ser mayor a 100");
            return false;
        } else {
            return true;
        }
    }
    
    public static void cargarDato(int op){
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR NOTAS DE ASSIGNATURA");
        for(int i = 0; i < notas.length; i++ ){
            System.out.println("\nPERIODO: " + (i+1));
            int index = 0;
            while(index <= 3){
            System.out.println("ingresar nota para " + assignaturas[index]);
            nota = leer.nextInt();
                if(checkInput(nota)) {
                    notas[i][index] = nota;
                    index++;
                }
            }
        }
        
    }
    
    public static void boletin() {
        System.out.println("\n*******************************************");
        System.out.println("*************BOLETIN DE NOTAS***************");
        System.out.println("*******************************************\n");
        for(int i=0; notas.length > i; i++) {
            System.out.println("PERIODO: " + (i+1));
            for(int j=0; assignaturas.length > j; j ++) {
                System.out.println("assignatura: " + assignaturas[j]);
                System.out.println("Nota: " + notas[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    public static void assignatura() {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        System.out.println("\n*******************************************");
        System.out.println("ESTADO DE NOTA");
        System.out.println("*******************************************\n");
        System.out.println("Selecione una de las siguientes assignaturas");
        for(int i=0; assignaturas.length > i; i ++) {
            System.out.println(i + " " + assignaturas[i]);
        }
        op = leer.nextInt();
        if (op < 0 || op >= 4) {
            System.out.println("VALOR SELECIONA INVALIDO \n");
            assignatura();
        } else {
            for(int i=0; notas.length > i; i++) {
                System.out.println("PERIODO: " + (i+1));
                System.out.println("assignatura: " + assignaturas[op]);
                System.out.println("Nota: " + notas[i][op]);
                System.out.println("\n");
            }
        }
    }
    
    public static void menu(Scanner leer) {
        int op = 0;
        String continuar;
        System.out.println("\n*******************************************");
        System.out.println("SELECIONE UNA DE LAS SIGUIENTES OPCIONES");
        System.out.println("*******************************************");
        System.out.println("(1). Cargar caificaciones del estudiante ");
        System.out.println("(2). Imprimir boletin ");
        System.out.println("(3). Imprimir estado de asignatura ");
        System.out.println("(4). salir ");
        op = leer.nextByte();
        switch(op) {
            case 1: 
                cargarDato(op);
                menu(leer);
                break;
            case 2: 
                boletin();
                menu(leer);
                break;
            case 3: 
                assignatura();
                menu(leer);
                break;
            case 4:
                break;
            default: 
                System.out.println("opcion no valida");
                menu(leer);
                break;
        }
    }
}
