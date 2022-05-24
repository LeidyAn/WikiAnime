/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wikianime;

import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class CrearListas {
    public static void crear_lista (int opcion) {
        Scanner entrada = new Scanner(System.in);
        switch (opcion){

            case 1 -> {
                
                System.out.println("""
                           Esta lista corresponde a los ánimes que quieres ver, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de cápitulos.
                            3. Estado del ánime (terminado, en emisión, en pausa).""");
                
                    WikiAnime.AnimeDeseado newAnime = new WikiAnime.AnimeDeseado();
                    newAnime.nombre= entrada.next();
                    newAnime.total = entrada.nextInt();
                    newAnime.estado = entrada.next();
                    
                    WikiAnime.globalVars.animeDeseado.add(newAnime); 
            //anime.stream().forEach(s -> System.out.println(s.nombre + ": " + s.total));

            }

            case 2 -> {

                System.out.println("""
                           Esta lista corresponde a los ánimes que ya iniciaste, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de capítulos.
                            3. Capitulo en el que te encuentras.
                            4. Estado del ánime (terminado, en emisión, en pausa).""");

                WikiAnime.AnimeIniciado newAnime = new WikiAnime.AnimeIniciado();
                    newAnime.nombre= entrada.next();
                    newAnime.total = entrada.nextInt();
                    newAnime.capitulo = entrada.nextInt();
                    newAnime.estado = entrada.next();
                    
                    WikiAnime.globalVars.animeIniciado.add(newAnime); 
                    
            }
            case 3 -> {

                System.out.println("""
                           Esta lista corresponde a los ánimes que ya finalizaste, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de capitulos.
                            3. Estado del ánime (terminado, en emisión, en pausa).
                            4. Qué calificación de 1 a 5 merece el ánime.""");
                WikiAnime.AnimeFinalizado newAnime = new WikiAnime.AnimeFinalizado();
                    newAnime.nombre= entrada.next();
                    newAnime.total = entrada.nextInt();
                    newAnime.estado = entrada.next();
                    newAnime.calificacion = entrada.nextInt();
                    
                    WikiAnime.globalVars.animeFinalizado.add(newAnime);            

            }
            case 4 -> {

                System.out.println("""
                           Esta lista corresponde a los ánimes que nunca recomendarías, ni a tu peor enemigo, para crearla necesito los siguientes datos:
                            1. Nombre. 
                            2. Total de capitulos.
                            3. Estado del ánime (terminado, en emisión, en pausa).
                            4. Qué calificación de 1 a 5 merece el ánime.""");

               WikiAnime.AnimeListaNegra newAnime = new WikiAnime.AnimeListaNegra();
                    newAnime.nombre= entrada.next();
                    newAnime.total = entrada.nextInt();
                    newAnime.estado = entrada.next();
                    newAnime.calificacion = entrada.nextInt();
                    
                    WikiAnime.globalVars.ListaNegra.add(newAnime);              
            }

            default -> {

                System.out.println("Opcion incorrecta");

            }

      }
    }
}
