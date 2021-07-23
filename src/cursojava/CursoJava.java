package cursojava;

import java.util.Scanner;

public class CursoJava {
    public static String assignaturas[] = {"Matematicas", "Ciencias", "Informaticas", "Deportes"};
    public static int notas[] = new int [4];
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
        int index = 0;
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR NOTAS DE ASSIGNATURA");
        while(index <= 3){
            System.out.println("\ningresar nota para " + assignaturas[index]);
            nota = leer.nextInt();
            if(checkInput(nota)) {
                notas[index] = nota;
                index++;
            }
        }
    }
    
    public static void boletin() {
        System.out.println("\n*******************************************");
        System.out.println("BOLETIN DE NOTAS");
        System.out.println("*******************************************\n");
        for(int i=0; assignaturas.length > i; i ++) {
            System.out.println("assignatura: " + assignaturas[i]);
            System.out.println("Nota: " + notas[i]);
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
            System.out.println("Assignatura: " + assignaturas[op]);
            System.out.println("Nota: " + notas[op]);
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
