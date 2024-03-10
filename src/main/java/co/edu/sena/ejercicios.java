package co.edu.sena;
import java.util.Scanner;


public class ejercicios {

    public static double area_triangulo (double d1, double d2){
        
        return (d1 * d2)/2;
    }

    public static double sumar2numeros (double d1, double d2){
        return (d1 + d2);
    }

    public static double elevar_al_cuadrado (double d1){
        return (d1 * d1);
    }

    public static double conversion (double d1){
        return (d1 * 1.08);
    }

    public static double a_cuadrado (double d1){
        return (d1 * d1);
    }

    public static double p_cuadrado (double d1){
        return (d1 * 4);
    }

    public static double a_cilindro(double d1, double d2){
        return (2 * 3.1416 * (d1 * d1)) + (2* 3.1416 * d1) * d2;
    }

    public static double v_cilindro(double d1, double d2){
        return (3.1416 * d2 * (d1 * d1));
    }

    public static double l_circulo(double d1){
        return ((d1 * 2) * 3.1416);
    }

    public static double a_circulo(double d1){
        return  (3.1416 * (d1 * d1));
    }

    public static double promedio(double d1, double d2, double d3){
        return (d1 + d2 + d3) / 3;
    }
}