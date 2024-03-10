package co.edu.sena;

import java.util.Scanner;

public class main 
{
    
    public static void main( String[] args )
    {
        int menu;
        int operadores;
        int condicionales;
        int ciclos;
        double dato1;
        double dato2;
        double dato3;
        double resultado;
        double resultado2;

        ejercicios ejercicios = new ejercicios();

        //Menu y submenus
        System.out.println( "Bienvenido, seleccione el número de la acción que desea realizar: ");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");


        Scanner src = new Scanner(System.in);
        menu= src.nextInt();

        switch (menu) {
            case 1:

                System.out.println("Elija el número del ejercicio a calcular: ");
                System.out.println("1. Calcular el área de un triangulo");
                System.out.println("2. Ingresar dos números por teclado y sumarlos");
                System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado");
                System.out.println("4. Convertir de Euros  Dólares");
                System.out.println("5. Área y perimetro de un cuadrado a partir de un lado");
                System.out.println("6. Calcular el área y el volúmen de un cilindro");
                System.out.println("7. Calcular la longitud y el área de una circunferencia");
                System.out.println("8. Calcular el promedio de tres números ingresados por el usuario");
                operadores = src.nextInt();

                switch (operadores) {
                    case 1:
                        //area triangulo
                        System.out.println( "Calcular el área de un triangulo");
                        

                        System.out.println("Ingrese la base del triángulo: ");
                        dato1 = src.nextDouble();
                        System.out.println("Ingrese la altura del triángulo: ");
                        dato2 = src.nextDouble();
                        resultado = ejercicios.area_triangulo(dato1, dato2);
                        System.out.println("El área del triángulo es: " + resultado);

                        break;
                    
                    case 2:
                        //sumar dos numeros
                        System.out.println( "Ingresar dos números por teclado y sumarlos" );
                        System.out.println( "Ingrese el primer número: ");

                        dato1 = src.nextDouble();

                        System.out.println("Ingrese  el segundo número: ");
                        dato2 = src.nextDouble();

                        resultado = ejercicios.sumar2numeros(dato1, dato2);
                        System.out.println("El resultado de la suma es: " + resultado);

                        break;
                    case 3: 
                        //elevar al cuadrado
                        System.out.println( "Ingresar un número y visualizar el número elevado al cuadrado" );
                        System.out.println( "Ingrese el número a elevar: ");

                        dato1 = src.nextDouble();

                        resultado = ejercicios.elevar_al_cuadrado(dato1);
                        System.out.println("El número eleveado al cuadrado es: " + resultado);

                        break;
                    
                    case 4:
                        //Convertir de euros a dolares
                        System.out.println( "Convertir de Euros  Dólares" );
                        System.out.println( "Ingrese la cantidad de Euros a convertir: ");

                        dato1 = src.nextDouble();

                        resultado = ejercicios.conversion(dato1);
                        System.out.println("Usted tiene " + resultado + " Dólares" );

                        break;
                    
                    case 5:
                        //area y perimetro de cuadrado
                        System.out.println( "Área y perimetro de un cuadrado a partir de un lado" );
                        System.out.println( "Ingrese el lado del cuadrado: ");

                        dato1 = src.nextDouble();

                        resultado = ejercicios.a_cuadrado(dato1);
                        resultado2 = ejercicios.p_cuadrado(dato1);

                        System.out.println("El área del cuadrado es: " + resultado + " y su perimetro es: " + resultado2);

                        break;

                    case 6:
                        //area y volumen de cilindro
                        System.out.println( "Calcular el área y el volúmen de un cilindro" );
                        System.out.println( "Ingrese el radio de la base del cilindro: ");

                        dato1 = src.nextDouble();

                        System.out.println("Ingrese la altura del cilindro");
                        dato2 = src.nextDouble();

                        resultado = ejercicios.a_cilindro(dato1, dato2);
                        resultado2 = ejercicios.v_cilindro(dato1, dato2);

                        System.out.println("El área del cilindro es: " + resultado + " y su volúmen es: " + resultado2);

                        break;

                    case 7:
                        //longitud y area de circunferencia
                        System.out.println( "Calcular la longitud y el área de una circunferencia" );
                        System.out.println( "Ingrese el radio de la circunferencia ");

                        dato1 = src.nextDouble();

                        resultado = ejercicios.l_circulo(dato1);
                        resultado2 = ejercicios.a_circulo(dato1);

                        System.out.println("La longitud de la circunferencia es: " + resultado + " y su área es: " + resultado2);

                        break;

                    case 8:
                        //promediar tres numeros
                        System.out.println( "Calcular el promedio de tres números ingresados por el usuario" );
                        System.out.println( "Ingrese el primer número a promediar: ");

                        
                        dato1 = src.nextDouble();

                        System.out.println("Ingrese el segundo número a promediar: ");
                        dato2 = src.nextDouble();

                        System.out.println("Ingrese el tercer número a promediar: ");
                        dato3 = src.nextDouble();

                        resultado = ejercicios.promedio(dato1, dato2, dato3);

                        System.out.println("El promedio de los tres números es: " + resultado);

                        break;

                }
                
                break;

            case 2:
                System.out.println("Elija el número del ejercicio a resolver: ");
                System.out.println("1. El número ingresado por teclado es positivo o negativo.\r");
                System.out.println("2. Cuál es el mayor y cuál el menor entre dos números.");
                System.out.println("3. Calcular cual es el mayor y el menos entre tres números.");
                System.out.println("4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.");
                System.out.println("5. Cociente entre A y B");
                System.out.println("6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario\r\n" + //
                                        "multiplicarlos.\r");
                System.out.println("7. Determinar si un año es bisiesto o no.");
                condicionales = src.nextInt();

                switch (condicionales) {
                    case 1:
                        System.out.println("Ingrese un número ");
                        dato1 = src.nextDouble();

                        if (dato1 >= 0) {
                            System.out.println("El número ingresado es positivo");
                        }
                        else{
                            System.out.println("El número ingresado es negativo");
                        }
                        break;
                        
                    case 2: 
                        System.out.println("Digite el primer número ");
                        dato1 = src.nextDouble();

                        System.out.println("Digite el segundo número ");
                        dato2 = src.nextDouble();

                        if (dato1 > dato2){
                            System.out.println("El número mayor es " + dato1 + " y el número menor es " + dato2);
                        }
                        else{
                            System.out.println("El número mayor es " + dato2 + " y el número menor es " + dato1);
                        }

                        break;
                    
                    case 3:
                        System.out.println("Digite el primer número positivo ");
                        dato1 = src.nextDouble();
                        System.out.println("Digite el segundo número positivo ");
                        dato2 = src.nextDouble();
                        System.out.println("Digite el tercer número positivo ");
                        dato3 = src.nextDouble();

                        if (dato1 < 0 && dato2 < 0 && dato3 < 0) {
                            System.out.println("Los números deben ser positivos ");
                        }
                        else if (dato1 > dato2 && dato1 > dato3 && dato2 > dato3){
                            System.out.println("El número mayor es " + dato1 + " y el número menor es " + dato3);
                        }
                        else if (dato1 > dato2 && dato1 > dato3 && dato2 < dato3){
                            System.out.println("El número mayor es " + dato1 + " y el número menor es " + dato2);
                        }
                        else if (dato2 > dato1 && dato2 > dato3 && dato1 > dato3){
                            System.out.println("El número mayor es " + dato2 + " y el número menor es " + dato3);
                        }
                        else if (dato2 > dato1 && dato2 > dato3 && dato1 < dato3){
                            System.out.println("El número mayor es " + dato2 + " y el número menor es " + dato1);
                        }
                        else if (dato3 > dato1 && dato3 > dato2 && dato1 > dato2){
                            System.out.println("El número mayor es " + dato3 + " y el número menor es " + dato2);
                        }
                        else if (dato3 > dato1 && dato3 > dato2 && dato1 < dato2){
                            System.out.println("El número mayor es " + dato3 + " y el número menor es " + dato1);
                        }
                        else {
                            System.out.println("Hay algun error");
                        }

                        break;
                    
                    case 4:
                        System.out.println("Digite el primer número ");
                        dato1 = src.nextDouble();
                        System.out.println("Digite el segundo número ");
                        dato2 = src.nextDouble();

                        if (dato1 < dato2) {
                            resultado = dato1 + dato2;
                            System.out.println("La suma entre los dos números es " + resultado);
                        }
                        else {
                            resultado2 = dato1 - dato2;
                            System.out.println("La resta de los dos números es " + resultado2);
                        }

                        break;

                    case 5:
                        System.out.println("Digite el primer número a dividir ");
                        dato1 = src.nextDouble();
                        System.out.println("Digite el segundo número a dividir ");
                        dato2 = src.nextDouble();

                        if (dato1 == 0 || dato2 == 0) {
                            System.out.println("No se puede dividir entre 0 ");
                        }
                        else{
                            resultado = dato1 / dato2;
                            System.out.println("El resultado de la división es " + resultado);
                        }

                        break;

                    case 6:
                        System.out.println("Digite el primer número ");
                        dato1 = src.nextDouble();
                        System.out.println("Digite el segundo número ");
                        dato2 = src.nextDouble();

                        if (dato1 < 0 || dato2 < 0){
                            resultado = dato1 + dato2;
                            System.out.println("La suma de los números es " + resultado);
                        }
                        else {
                            resultado2 = dato1 * dato2;
                            System.out.println("La multiplicacion de los números es " + resultado2);
                        }

                        break;

                    case 7:
                        System.out.println("Digite el año ");
                        dato1 = src.nextDouble();

                        if (dato1 %4 == 0 && dato1 % 100 != 0 || dato1 % 400 == 0){
                            System.out.println("El año es bisiesto");
                        }
                        else {
                            System.out.println("El año no es bisiesto");
                        }

                        break;
                }
                break;

            case 3:
                System.out.println("Elija el número del ejercicio a realizar ");
                System.out.println("1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.");
                System.out.println("2. Imprimir los números impares entre 0 y 100.");
                System.out.println("3. Imprimir los números pares del 1 al 100.");
                System.out.println("4. Imprimir los cuadrados de los números del 1 al 30");
                System.out.println("5. Imprimir el resultado de sumar los cuadrados de los 100 primeros números naturales");
                System.out.println("6. Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los\r\n" + //
                                        "números comprendidos entre ellos en secuencia ascendente.");
                System.out.println("7.Sumar todos los números que se digitan por teclado mientras no sea cero.");
                ciclos = src.nextInt();

                switch (ciclos) {
                    case 1:
                        for (int i = 3; i < 100; i+=3){
                            System.out.println(i);
                        }
                        
                        break;

                    case 2:
                        for (int i = 1; i < 100; i+=2){
                            System.out.println(i);   
                        }

                        break;

                    case 3:
                        for (int i = 2; i <= 100; i+=2){
                            System.out.println(i);
                        }

                        break;

                    case 4:
                        int i = 1;
                        while (i < 30) {
                            resultado = i * i;
                            System.out.println(resultado);
                            i++;
                        }

                        break;

                    case 5:
                        int a = 1;
                        while (a < 100) {
                            resultado = a * a;
                            resultado2 = resultado + resultado;
                        }

                }

        }
    }
}