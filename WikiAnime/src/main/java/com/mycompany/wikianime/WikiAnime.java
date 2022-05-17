/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.wikianime;
import java.util.Scanner;
/**
 *
 * @author Leidy Andrea Muñoz Hios
 */
public class WikiAnime {
    //Método para dar la bienvenida y definición del proyecto
    
    public static void Bienvenida(){
        System.out.println("""
                           Estimado humano, bienvenido.
                           Este programa está diseñado para que pueda consultar 
                           un ánime de nuestro catálogo para ampliar la información 
                           y pueda decidir si verlo o no. 
                           Además puede crear y descargar una lista de animes que quiera ver, 
                           está viendo o terminó de ver, de esta forma va a estar siempre pendiente 
                           de los ánimes que ha visto o desea ver. """);
    }
    
    //método para opción catálogo
    
    public static void opcion_catalogo (int opcion) {
        
        switch (opcion){

            case 1 -> {
                System.out.println("""
                           De qué categoría quieres ampliar la información de One Piece:
                            1. Anime. 
                            2. Manga.
                            3. Información general.""");
            }

            case 2 -> {

                System.out.println("""
                           De qué categoría quieres ampliar la información de Singeki no Kyojin:
                            1. Anime. 
                            2. Manga.
                            3. Información general.""");


            }
            case 3 -> {

                System.out.println("""
                           De qué categoría quieres ampliar la información de Jujutsu Kaisen:
                            1. Anime. 
                            2. Manga.
                            3. Información general.""");


            }
            case 4 -> {

                System.out.println("""
                           De qué categoría quieres ampliar la información de Naruto:
                            1. Anime. 
                            2. Manga.
                            3. Información general.""");


            }

            default -> {

                System.out.println("Opcion incorrecta");

            }

      }
        
    }
    
    
    //Método para opción crear lista 
    
    public static void crear_lista (int opcion) {
        switch (opcion){

            case 1 -> {
                System.out.println("""
                           Esta lista corresponde a los ánimes que quieres ver, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de cápitulos.
                            3. Estado del ánime (terminado, en emisión, en pausa).""");
            }

            case 2 -> {

                System.out.println("""
                           Esta lista corresponde a los ánimes que ya iniciaste, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de capítulos.
                            3. Capitulo en el que te encuentras.
                            4. Estado del ánime (terminado, en emisión, en pausa).""");


            }
            case 3 -> {

                System.out.println("""
                           Esta lista corresponde a los ánimes que ya finalizaste, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de capitulos.
                            3. Estado del ánime (terminado, en emisión, en pausa).
                            4. Qué calificación de 1 a 5 merece el ánime.""");


            }
            case 4 -> {

                System.out.println("""
                           Esta lista corresponde a los ánimes que nunca recomendarías, ni a tu peor enemigo, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de capitulos.
                            3. Estado del ánime (terminado, en emisión, en pausa).
                            4. Qué calificación de 1 a 5 merece el ánime.
                            5. Explicación del porqué no te gustó""");


            }

            default -> {

                System.out.println("Opcion incorrecta");

            }

      }
    }
    
    

    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        
        Bienvenida();
        
        // Solicitar opción inicial 
        System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. Ver catálogo de ánimes. 
                            2. Crear lista de ánimes""");
        
        int opcionInicial  = entrada.nextInt();
        
        // Condicional para menú secundario
        
         switch (opcionInicial){

            case 1 -> {
                System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. One Piece. 
                            2. Shingeki no Kyojin.
                            3. Jujutsu Kaisen.
                            4. Naruto.""");
        
                int opcionAnime  = entrada.nextInt();
                
                opcion_catalogo(opcionAnime);

            }

            case 2 -> {

                System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. Lista de deseos. 
                            2. Lista de animes iniciados.
                            3. Lista de finalizados.
                            4. Lista negra.""");
        
                int opcionLista  = entrada.nextInt();
                
                crear_lista(opcionLista);


            }

            default -> {

                System.out.println("Opcion incorrecta");

            }

      }
    }
}
