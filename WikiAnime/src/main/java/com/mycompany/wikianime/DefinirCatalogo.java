/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wikianime;

/**
 *
 * @author USUARIO PC
 */
public class DefinirCatalogo {
    
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
    
}
