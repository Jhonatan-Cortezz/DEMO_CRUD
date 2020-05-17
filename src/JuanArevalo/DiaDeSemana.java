
package JuanArevalo;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Arevalo
 */
public class DiaDeSemana {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Introduce un dia de la semana");
        String dia = sc.next();
         
        switch(dia){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
}
