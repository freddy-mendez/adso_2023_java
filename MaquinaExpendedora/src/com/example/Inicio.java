import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int denominacionesBilletes = 5;
        int denominacionesMonedas = 3;
        
        
        int [] denomB, denomM, cantB, cantM, cantInB, cantInM;
        int costo, ingreso, diferencia, opcion, opcionDinero, opcionDenom;
        
        costo = ingreso = diferencia = opcion = opcionDinero = opcionDenom = 0;
        
        denomB = new int[]{50000,20000,10000,5000,2000};
        cantB = new int[]{10,30,50,50,60};
        cantInB = new int[denominacionesBilletes];
        denomM = new int[]{1000,500,200};
        cantM = new int[]{100,200,300};
        cantInM = new int[denominacionesMonedas];
        
        String msg = "";
        
        do {
            System.out.println("Menu Principal");
            System.out.println("");
            System.out.println("1. Procesar compra");
            System.out.println("2. Reporte de Efectivo");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Digite su opcion=");
            opcion=input.nextInt();
            
            switch (opcion) {
                case 1:
                    msg = "Procesar la compra";
                    msg += "\nDigite el valor de la compra";
                    System.out.println(msg);
                    costo=input.nextInt();
                    cobrar: while(ingreso<costo) {
                        System.out.println("Saldo actual="+(costo-ingreso));
                        System.out.println("");
                        System.out.println("1. Ingresar Billete");
                        System.out.println("2. Ingresar Moneda");
                        System.out.println("0. Cancelar");
                        System.out.println("Digite su opcion=");
                        opcionDinero=input.nextInt();
                        switch (opcionDinero) {
                            case 1:
                                for (int i=0; i<denomB.length; i++) {
                                    System.out.println(i+". $"+denomB[i]);
                                }
                                System.out.println("Digite su opcion=");
                                opcionDenom=input.nextInt();
                                if (opcionDenom>=0 && opcionDenom<denomB.length) {
                                    cantInB[opcionDenom]++;
                                    ingreso+=denomB[opcionDenom];
                                } else {
                                    System.err.println("Opcion no valida.");
                                }
                                break;
                            case 2:
                                for (int i=0; i<denomM.length; i++) {
                                    System.out.println(i+". "+denomM[i]);
                                }
                                System.out.println("Digite su opcion=");
                                opcionDenom=input.nextInt();
                                if (opcionDenom>=0 && opcionDenom<denomM.length) {
                                    cantInM[opcionDenom]++;
                                    ingreso+=denomM[opcionDenom];
                                } else {
                                    System.err.println("Opcion no valida.");
                                }
                                break;
                            case 0:
                                System.out.println("Transaccion Cancelada!!!");
                                break cobrar;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    }
                    if (ingreso>=costo) {
                        for (int i=0; i<denomB.length; i++) {
                            cantB[i]+=cantInB[i];
                            cantInB[i]=0;
                        }
                        for (int i=0; i<denomM.length; i++) {
                            cantM[i]=cantInM[i];
                            cantInM[i]=0;
                        }
                        diferencia=ingreso-costo;
                        for (int i=0; i<denomB.length; i++) {
                            if (diferencia>=denomB[i]) {
                                int cantidad = diferencia/denomB[i];
                                if (cantidad<=cantB[i]) {
                                    System.out.println("Se entregan "+cantidad+
                                            " Billetes de "+denomB[i]);
                                    cantB[i]-=cantidad;
                                    diferencia=diferencia%denomB[i];
                                } else {
                                    int disponible = cantB[i]*denomB[i];
                                    System.out.println("Se entregan "+cantB[i]+
                                            " Billetes de "+denomB[i]);
                                    cantB[i]=0;
                                    diferencia=diferencia-disponible;
                                }
                            }
                        }
                        for (int i=0; i<denomM.length; i++) {
                            if (diferencia>=denomM[i]) {
                                int cantidad = diferencia/denomM[i];
                                if (cantidad<=cantM[i]) {
                                    cantM[i]-=cantidad;
                                    System.out.println("Se entregan "+cantidad+
                                            " Billetes de "+denomM[i]);
                                    diferencia=diferencia%denomM[i];
                                } else {
                                    int disponible = cantM[i]*denomM[i];
                                    System.out.println("Se entregan "+cantM[i]+
                                            " Billetes de "+denomM[i]);
                                    cantM[i]=0;
                                    diferencia=diferencia-disponible;
                                }
                            }
                        }
                        System.out.println("Saldo="+diferencia);
                        ingreso=0;
                    } else {
                        for(int i=0; i<denomB.length; i++) {
                            if (cantInB[i]>0) {
                                System.out.println("Devuelven "+cantInB[i]+
                                        " de billetes de "+denomB[i]);
                                cantInB[i]=0;
                            }
                        }
                        for(int i=0; i<denomM.length; i++) {
                            if (cantInM[i]>0) {
                                System.out.println("Devuelven "+cantInM[i]+
                                        " de monedas de "+denomM[i]);
                                cantInM[i]=0;
                            }
                        }
                        ingreso=0;
                        costo=0;
                    }
                    break;
                case 2:
                    System.out.println("Reporte de Efectivo");
                    System.out.println("");
                    System.out.println("Información de Billetes");
                    for (int i=0; i<denomB.length; i++) {
                        System.out.println("Billetes de $"+denomB[i]
                                +" cantidad="+cantB[i]);
                    }
                    System.out.println("");
                    System.out.println("Información de Monedas");
                    for (int i=0; i<denomM.length; i++) {
                        System.out.println("Monedas de $"+denomM[i]
                                +" cantidad="+cantM[i]);
                    }
                    System.out.println("");
                {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case 0:
                    System.out.println("Fin de la Aplicación");
                    break;
                default:
                    System.out.println("Opcion NO Valida");
                    break;
            }
        } while(opcion!=0);
        
    }
    
}
