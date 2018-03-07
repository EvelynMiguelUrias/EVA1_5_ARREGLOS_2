/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos_2;

/**
 *
 * @author Evelyn
 */
public class EVA1_5_ARREGLOS_2 {
    public static final int ARRE_TAMA = 30;//DECLARACION DE UNA CONSTANTE  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiEdad[] = new int [ARRE_TAMA];//DECLARAMOS UN IDENTIFICADOR DE TIPO ARREGLO ENTER 
        //EDADES ALEATORIAS, ARREGLOS SIEMPRE EMPIEZAN EN 0 
        //HAYQ QUE MOVERÑOS A UN VALOR PREVIO AL TAMAÑO DEL ARREGLO PORQUE LA POSICION 0 CUENTA EN EL ARREGLO
       // for (int i = 0; i < aiEdad.length; i++) {//SE TRABAJARA CON ESTE, EQUIVALENTE AL DE ABAJO
        //}
        for(int i = 0; i < ARRE_TAMA; i++ ){//LEEMOS NUESTRO ARREGLO
            System.out.println("aiEdad[" + i + "]=" + aiEdad[i]);//NO LE HEMOS DADO VALOR ASI  QUE REGRESA PUROS CEROS
        }
        //SE LE ASIGNA VALORES 
        aiEdad[0] = 25;//POSICION CERO (PRIMER POSICION DEL ARREGLO) UN VALOR DE 25 
        
        //LLENAR CON VALORES ENTRE 0 Y 36
        for (int i = 0; i < aiEdad.length; i++) {
            aiEdad[i] = (int)(Math.random() * 36);
                //Math.random regresea valores entre 0 y 1 -----> 0.1354685
                //HAY QUE HACER UN CASTING DE DOUBLE A ENTERO (INT)
        }
        for(int i = 0; i < ARRE_TAMA; i++ ){//LEEMOS NUESTRO ARREGLO
            System.out.println("aiEdad[" + i + "]=" + aiEdad[i]);//NO LE HEMOS DADO VALOR ASI QUE REGRESA PUROS CEROS
        }
    }
    
}
