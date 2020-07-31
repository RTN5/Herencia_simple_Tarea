/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_simple_tarea_1;

/**
 *
 * @author User
 */

class Sistema_Diagnostico{
    String SD1;
    String SD2;
    String SD3;
    
    
    void MostrarCaracteristicaDanio(){
        System.out.println("El automovil esta conformado por los siguientes sistemas. Sistema de "+SD1+",\nSistema de "+SD2+", "
                + "Sistema de "+SD3+".\n");
    }  
}
class Sistema_Encendido{
    String CSE1;
    String CSE2;
    String CSE3;
    
    
    
    void MostrarFSE(){
        System.out.println("*El sistema de encendido esta compuesto por los sigueintes "
                + "componentes:\n 1.- "+CSE1+"\n 2.- "+CSE2+"\n 3.- "+CSE3+"");
    }
   
}
class Sistema_Transmicion{
    String ST1;
    String ST2;
    String ST3;
    
    void MostrarFST(){
        System.out.println("\n*El sistema de Transmision esta compuesto por los sigueintes "
                + "componentes:\n 1.-"+ST1+"\n 2.-"+ST2+"\n 3.-"+ST3+".\n");
    }
}

class Sistema_Freno{
    String SF1;
    String SF2;
    String SF3;
    String SF4;
    
    void MostrarFSF(){
        System.out.println("\n*El sistema de Transmision esta compuesto por los siguientes "
                + "componentes:\n 1.-"+SF1+"\n 2.-"+SF2+"\n 3.-"+SF3+"\n 4.-"+SF4);
    }

}
public class Herencia_simple_Tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Sistema_Diagnostico SD = new Sistema_Diagnostico();
        Sistema_Encendido SE = new Sistema_Encendido();
        Sistema_Transmicion ST = new Sistema_Transmicion();
        Sistema_Freno SF = new Sistema_Freno();
        
        
        SD.SD1 = "Encendido";
        SD.SD2 = "Trasmision";
        SD.SD3 = "Frenos";
        
        SE.CSE1 = "Bateria";
        SE.CSE2 = "Motor de Arranque";
        SE.CSE3 = "Swistch";
        
        ST.ST1 = "Caja de cambio";
        ST.ST2 = "Diferencial";
        ST.ST3 = "Arbol de trasmision";
        
        SF.SF1 = "Disco de freno";
        SF.SF2 = "Asafatas";
        SF.SF3 = "Bomba de aceite";
        SF.SF4 = "Pedal de freno";
        
        
        System.out.println("                     Universidad de las Fuerzas Armadas ESPE\n");
        System.out.println("NRC:7450");
        System.out.println("Tema:Herencia Simple\n\n");
        
        
        System.out.println("               Informacion de los diferenste sistemas del Automovil\n");
        SD.MostrarCaracteristicaDanio();
        SE.MostrarFSE();
        System.out.println("Nota: siendo la "+SE.CSE1+" el componente que mas falla en el sistema.");
        ST.MostrarFST();
        System.out.println("Nota: siendo el "+ST.ST3+" el componente que se somete a un esfuerzo mayor.");
        SF.MostrarFSF();
        System.out.println("Nota: siendo las "+SF.SF2+" los componentes con mayor trabajo de friccion.");
        
        
        
    }
    
}
