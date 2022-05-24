/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wikianime;

/**
 *
 * @author USUARIO PC
 */
public class TotalListas {
    public static void EscribirAnime (){
        if(WikiAnime.globalVars.animeDeseado.size() >= 1 ){
            System.out.println("Los ánimes que deseas ver son: ");
        WikiAnime.globalVars.animeDeseado.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Estado del ánime: " + anime.estado ));
            System.out.println( "-------------------------------------------------------------");
        }
        
        if(WikiAnime.globalVars.animeIniciado.size() >= 1 ){
            System.out.println("Los ánimes que has iniciado a ver son: ");
        WikiAnime.globalVars.animeIniciado.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Te encuentras en el capítulo número: " + anime.capitulo + "\n" +  
                                                                             "Estado del ánime: " + anime.estado));
            System.out.println( "-------------------------------------------------------------");

        }
        
        if(WikiAnime.globalVars.animeFinalizado.size() >= 1 ){
            System.out.println("Los ánimes que has finalizado son: ");
        WikiAnime.globalVars.animeFinalizado.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Estado del ánime: " + anime.estado + "\n" +  
                                                                             "Calificación que merece: " + anime.calificacion ));
            System.out.println( "-------------------------------------------------------------");
        }
        
        if(WikiAnime.globalVars.ListaNegra.size() >= 1 ){
            System.out.println("Los ánimes que no recomendarías ni a tu peor enemigo son: ");
        WikiAnime.globalVars.ListaNegra.stream().forEach(anime -> System.out.println("Nombre del anime: " + anime.nombre + "\n" + 
                                                                             "Total de capítulos: " + anime.total + "\n" + 
                                                                             "Estado del ánime: " + anime.estado + "\n" +  
                                                                             "Calificación que merece: " + anime.calificacion ));
        System.out.println( "-------------------------------------------------------------");
        }
        
    }
}
