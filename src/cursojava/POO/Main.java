/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.POO;

import java.util.Scanner;

/**
 *
 * @author daiverandresdoriamass
 */
public class Main {
    
    public static void main(String[] args) {
        Estudiante est = new Estudiante(0);
        Scanner leer = new Scanner(System.in);
        int n = 0;
        int sumedad = 0;

        System.out.println("Digite numero de estudiantes a registrar");
        n = leer.nextByte();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite edad estudiante " + n);
            est.setAge(leer.nextInt());
            sumedad = sumedad + est.getAge();
        }
        
        System.out.println("El Promedio de edades es " + (sumedad/n));
    }
}
