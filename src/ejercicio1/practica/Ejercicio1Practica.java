
package ejercicio1.practica;

import java.util.Scanner;

public class Ejercicio1Practica extends Empleado {
    
    public static void main(String[] args) {
    String nombre, cargo, info, realizohoras;
    double  pagoH, renta, salarioBr, salarioLiq, salarioSimple;
    int horasT, horasEx, horasExx;
    
    
    Empleado objeto = new Empleado();
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el nombre del empleado");
        objeto.setNombre(leer.nextLine());
        
        System.out.println("Ingrese el cargo del empleado");
        objeto.setCargo(leer.nextLine());
    
        System.out.println("Ingrese las horas trabajadas por el empleado en la semana");
        objeto.setHorasT(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Ingrese el pago por hora");
        objeto.setPagoH(Double.parseDouble(leer.nextLine()));
        
        info = objeto.Informacion(objeto);
        salarioSimple = objeto.salarioSimple(objeto);
        realizohoras = objeto.calHorasEx(objeto);
        salarioBr = objeto.salarioBruto(objeto);
        salarioLiq = objeto.salarioLiquido(objeto);
        renta = objeto.renta(objeto);
        
        
        System.out.println("\n" + "Información del empleado: " + info);
        System.out.println("El salario sin horas extras es: " + salarioSimple);
        System.out.println("\n" + realizohoras);
        System.out.println("Salario Bruto: " + salarioBr);
        System.out.println("Salario Liquido: " + (salarioLiq - renta));
        System.out.println("Descuento de renta: " + renta);
        
        
    }
    
}
