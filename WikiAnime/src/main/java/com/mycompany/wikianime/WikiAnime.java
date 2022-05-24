/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.wikianime;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Leidy Andrea Muñoz Hios
 */
public class WikiAnime {
    
    public static bienvenida welcome = new bienvenida();    
    public static CrearListas create = new CrearListas();    
    public static DefinirCatalogo reviewCatalog = new DefinirCatalogo();


    
    public class globalVars {
        public static int continuar = 1;
        public static int counter = 0; 
        public static List<AnimeDeseado> animeDeseado = new ArrayList<>();
        public static List<AnimeIniciado> animeIniciado = new ArrayList<>();        
        public static List<AnimeFinalizado> animeFinalizado = new ArrayList<>();
        public static List<AnimeListaNegra> ListaNegra = new ArrayList<>();

    }
    //Método para dar la bienvenida y definición del proyecto
    
   
    
    //Método para menú secundario 
    
    public static void catalogo_lista (int opcionInicial) {
        Scanner entrada = new Scanner(System.in);
        switch (opcionInicial){

            case 1 -> {
                System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. One Piece. 
                            2. Shingeki no Kyojin.
                            3. Jujutsu Kaisen.
                            4. Naruto.""");
        
                int opcionAnime  = entrada.nextInt();
                
                reviewCatalog.opcion_catalogo(opcionAnime);

            }

            case 2 -> {
                
                while(globalVars.continuar == 1)
                {
                System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. Lista de deseos. 
                            2. Lista de animes iniciados.
                            3. Lista de finalizados.
                            4. Lista negra.""");
        
                int opcionLista  = entrada.nextInt();
                // llamado del método para crear listas 
                create.crear_lista(opcionLista);
                globalVars.counter = globalVars.counter + 1;
                System.out.println("""
                           Desea agregar otro anime:
                            1. Sí. 
                            2. No.""");
                    
                    globalVars.continuar = entrada.nextInt();
                }
                
                // Mostrar resultado al terminar 
                
                EscribirAnime();
            }

            default -> {

                System.out.println("Opcion incorrecta");

            }

      }
    }
    
    // clases para las listas de ánime que se van a crear
    
    public static class AnimeDeseado {

        public String nombre;
        public int total;
        public String estado; 
    }
    
    public static class AnimeIniciado {

        public String nombre;
        public int total;
        public int capitulo;
        public String estado;
    }
    
    public static class AnimeFinalizado {

        public String nombre;
        public int total;
        public String estado;
        public int calificacion; 
    }
    
    public static class AnimeListaNegra {

        public String nombre;
        public int total;
        public String estado;
        public int calificacion; 
    }
    
    public static void EscribirAnime (){
        if(globalVars.animeDeseado.size() >= 1 ){
            System.out.println("Los ánimes que deseas ver son: ");
        globalVars.animeDeseado.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Estado del ánime: " + anime.estado ));
            System.out.println( "-------------------------------------------------------------");
        }
        
        if(globalVars.animeIniciado.size() >= 1 ){
            System.out.println("Los ánimes que has iniciado a ver son: ");
        globalVars.animeIniciado.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Te encuentras en el capítulo número: " + anime.capitulo + "\n" +  
                                                                             "Estado del ánime: " + anime.estado));
            System.out.println( "-------------------------------------------------------------");

        }
        
        if(globalVars.animeFinalizado.size() >= 1 ){
            System.out.println("Los ánimes que has finalizado son: ");
        globalVars.animeFinalizado.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Estado del ánime: " + anime.estado + "\n" +  
                                                                             "Calificación que merece: " + anime.calificacion ));
            System.out.println( "-------------------------------------------------------------");
        }
        
        if(globalVars.ListaNegra.size() >= 1 ){
            System.out.println("Los ánimes que no recomendarías ni a tu peor enemigo son: ");
        globalVars.ListaNegra.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Estado del ánime: " + anime.estado + "\n" +  
                                                                             "Calificación que merece: " + anime.calificacion ));
        System.out.println( "-------------------------------------------------------------");
        }
        
    }

    
    
    //Método para opción crear lista 
    
    
    
    

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(WikiAnime.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         Scanner entrada = new Scanner(System.in);
        //Dar bienvenida
        welcome.Bienvenida();
        // Solicitar opción inicial 
        System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. Ver catálogo de ánimes. 
                            2. Crear lista de ánimes""");
        
        int opcionInicial  = entrada.nextInt();
        // Llamado a segundo menu 
        catalogo_lista(opcionInicial);
        
    }
       
}
