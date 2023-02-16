/*
utilizar los siguientes datos:
5. La nómina
Mostrar la nómina simplificada de un empleado a partir de la información introducida. El salario bruto depende de la cantidad de horas trabajadas y su tarifa por hora:
Las horas inferiores a 169 horas se pagan aplicando su tarifa horaria.
Las horas comprendidas entre 169 y 180 horas se pagan aplicando un incremento del 50 % sobre su tarifa horaria.
Las horas superiores a 180 horas se pagan aplicando un incremento del 60 %.
La prima familiar se calcula de la siguiente manera:
1 hijo: 20 €
2 hijos: 50 €
Por encima de 2 hijos : 70 € +20 € por cada hijo adicional
A continuación se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):
¿Apellido de la persona?
Camino
¿Nombre de la persona?
Gerardo
¿Puesto?
1 - Agente de servicio
2 - Empleado de oficina
3 - Directivo
1
Número de horas trabajadas:
190
¿Tarifa horaria?
9,76
¿Número de hijos?
4
Nómina de Gerardo Camino
Estado : Agente de servicio
Salario bruto: 1.966,64 € (169 horas sin incremento, 11 horas con incremento del 50 %, 10 horas con incremento del 60 %)
Cálculo de deducciones:
Contribución para el pago de la deuda social y contingencias comunes imponible
1.966,64 € × 3,49 % = 68,64 €
Contribución de contingencias comunes no imponible
1.966,64 € × 6,15 % = 120,95 €
Seguro médico
1.966,64 € × 0,95 % = 18,68 €
Fondo de pensiones
1.966,64 € × 8,44 % = 165,98 €
Seguro de desempleo
1.966,64 € × 3,05 % = 59,98 €
Pensión complementaria (Entidad privada)
1.966,64 € × 3,81 % = 74,93 €
Contribución de jubilación anticipada
1.966,64 € × 1,02 % = 20,06 €
Deducciones totales de los empleados: 529,22 €
Salario neto: 1.437,42 €
Prima familiar: 110 €
Salario neto a pagar: 1.547,42 €
utilizar los datos de la nómina
*/

import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Apellido de la persona? ");
        String apellido = sc.nextLine();
        System.out.print("¿Nombre de la persona? ");
        String nombre = sc.nextLine();
        System.out.println("¿Puesto?");
        System.out.println("1 - Agente de servicio");
        System.out.println("2 - Empleado de oficina");
        System.out.println("3 - Directivo");
        int puesto = sc.nextInt();
        System.out.print("Número de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("¿Tarifa horaria? ");
        double tarifa = sc.nextDouble();
        System.out.print("¿Número de hijos? ");
        int hijos = sc.nextInt();
        System.out.println("Nómina de " + nombre + " " + apellido);
        String puestoStr = "";
        switch (puesto) {
            case 1:
                puestoStr = "Agente de servicio";
                break;
            case 2:
                puestoStr = "Empleado de oficina";
                break;
            case 3:
                puestoStr = "Directivo";
                break;
            default:
                puestoStr = "Puesto incorrecto";
                break;
        }
        System.out.println("Estado : " + puestoStr);
        double salarioBruto = 0;
        if (horas < 169) {
            salarioBruto = horas * tarifa;
        } else if (horas < 180) {
            salarioBruto = 169 * tarifa + (horas - 169) * tarifa * 1.5;
        } else {
            salarioBruto = 169 * tarifa + 11 * tarifa * 1.5 + (horas - 180) * tarifa * 1.6;
        }
        System.out.println("Salario bruto: " + salarioBruto + " € (" + 169 + " horas sin incremento, " + (horas - 169) + " horas con incremento del 50 %, " + (horas - 180) + " horas con incremento del 60 %)");
        double deducciones = 0;
        deducciones += salarioBruto * 0.0349;
        deducciones += salarioBruto * 0.0615;
        deducciones += salarioBruto * 0.0095;
        deducciones += salarioBruto * 0.0844;
        deducciones += salarioBruto * 0.0305;
        deducciones += salarioBruto * 0.0381;
        deducciones += salarioBruto * 0.0102;
        System.out.println("Cálculo de deducciones:");
        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible");
        System.out.println(salarioBruto + " € × 3,49 % = " + salarioBruto * 0.0349 + " €");
        System.out.println("Contribución de contingencias comunes no imponible");
        System.out.println(salarioBruto + " € × 6,15 % = " + salarioBruto * 0.0615 + " €");
        System.out.println("Seguro médico");
        System.out.println(salarioBruto + " € × 0,95 % = " + salarioBruto * 0.0095 + " €");
        System.out.println("Fondo de pensiones");
        System.out.println(salarioBruto + " € × 8,44 % = " + salarioBruto * 0.0844 + " €");
        System.out.println("Seguro de desempleo");
        System.out.println(salarioBruto + " € × 3,05 % = " + salarioBruto * 0.0305 + " €");
        System.out.println("Pensión complementaria (Entidad privada)");
        System.out.println(salarioBruto + " € × 3,81 % = " + salarioBruto * 0.0381 + " €");
        System.out.println("Contribución de jubilación anticipada");
        System.out.println(salarioBruto + " € × 1,02 % = " + salarioBruto * 0.0102 + " €");
        System.out.println("Deducciones totales de los empleados: " + deducciones + " €");
        double salarioNeto = salarioBruto - deducciones;
        System.out.println("Salario neto: " + salarioNeto + " €");
        double primaFamiliar = hijos * 110;
        System.out.println("Prima familiar: " + primaFamiliar + " €");
        System.out.println("Salario neto a pagar: " + (salarioNeto + primaFamiliar) + " €");


    }
}