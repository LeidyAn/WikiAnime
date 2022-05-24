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
    
    public class globalVars {
        public static int continuar = 1;
        public static int menuPrincipal = 1;
        public static int verOtro = 1;
        public static List<AnimeDeseado> animeDeseado = new ArrayList<>();
        public static List<AnimeIniciado> animeIniciado = new ArrayList<>();        
        public static List<AnimeFinalizado> animeFinalizado = new ArrayList<>();
        public static List<AnimeListaNegra> ListaNegra = new ArrayList<>();

    }
   
    
    public static void catalogo_lista (int opcionInicial) {
        Scanner entrada = new Scanner(System.in);
        switch (opcionInicial){

            case 1 -> {
                while(globalVars.verOtro == 1)
                {
                System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. One Piece. 
                            2. Shingeki no Kyojin.""");
        
                int opcionAnime  = entrada.nextInt();
                
                DefinirCatalogo.opcion_catalogo(opcionAnime);
                System.out.println("""
                           Desea visitar otro anime:
                            1. Sí. 
                            2. No.""");
                    
                    globalVars.verOtro = entrada.nextInt();
                }
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
                CrearListas.crear_lista(opcionLista);
                System.out.println("""
                           Desea agregar otro anime:
                            1. Sí. 
                            2. No.""");
                    
                    globalVars.continuar = entrada.nextInt();
                }
                
                // Mostrar resultado al terminar 
                
                TotalListas.EscribirAnime();
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
   
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(WikiAnime.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         Scanner entrada = new Scanner(System.in);
        //Dar bienvenida
        bienvenida.Bienvenida();
        // Solicitar opción inicial mediante while para que pueda regresar al menú principal
        
         while(globalVars.menuPrincipal == 1)
          { 
                System.out.println("""
                           Por favor seleccione una de las siguientes opciones:
                            1. Ver catálogo de ánimes. 
                            2. Crear lista de ánimes""");
        
                int opcionInicial  = entrada.nextInt();
                // Llamado a segundo menu 
                catalogo_lista(opcionInicial);

                System.out.println("""
                                   ¿Desea ir al menú principal?:
                                    1. Sí. 
                                    2. No.""");
                    
                    globalVars.menuPrincipal = entrada.nextInt();
         }
        
        
        
    }
    
       
}
