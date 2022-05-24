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
public class DefinirCatalogo {
    
    public static void animeOnePiece (){
        System.out.println("El ánime en este momento cuenta con " + DataCatalogo.onePieceAnime[0] + ". Se encuentra en " 
                + DataCatalogo.onePieceAnime[1] + ". \n" + "La primera emisión de One Piece fue el " + DataCatalogo.onePieceAnime[2] 
                + " y lo puedes encontar en las plataformas de " + DataCatalogo.onePieceAnime[3]);
        System.out.println("El anime se conforma por las siguientes sagas: ");
        
        for(int i=0; i < DataCatalogo.onePieceSagas.length; i++)
        {
            System.out.println(i+1 + ". " + DataCatalogo.onePieceSagas[i]);
        }
    }
    
    public static void mangaOnePiece (){
        System.out.println("El manga en este momento cuenta con " + DataCatalogo.onePieceManga[0] + ". Se encuentra en " 
                + DataCatalogo.onePieceManga[1] + ". \n" + "La primera publicación de One Piece fue el " + DataCatalogo.onePieceManga[2] 
                + " y hasta el momento cuenta con  " + DataCatalogo.onePieceManga[3]);
        System.out.println("El manga se conforma por los siguientes volúmenes: ");
        
        for( int i=0; i < DataCatalogo.onePieceVolumenes.length ; i++)
        {
            System.out.println(i+1 + ". " + DataCatalogo.onePieceVolumenes[i]);
        }
    }
    
    public static void generalOnePiece (){
        System.out.println("El nombre en Japonés es " + DataCatalogo.onePieceGeneral[2] + "\n" +"La obra fue escrita por " + DataCatalogo.onePieceGeneral[0] + ", poducida por " + DataCatalogo.onePieceGeneral[1]);
        System.out.println("La tripulación principal está conformada por: ");
        
        for( int i=0; i < DataCatalogo.onePieceTripulacion.length ; i++)
        {
            System.out.println(i+1 + ". " + DataCatalogo.onePieceTripulacion[i]);
        }
    }

    public static void opcion_catalogo (int opcion) {
        
        Scanner entrada = new Scanner(System.in);
        
        switch (opcion){

            case 1 -> {
                System.out.println("""
                           De qué categoría quieres ampliar la información de One Piece:
                            1. Anime. 
                            2. Manga.
                            3. Información general.""");
                
                int categoria = entrada.nextInt();
                
                switch (categoria) {
                    case 1 -> {
                        animeOnePiece();
                    }
                    case 2 -> {
                        mangaOnePiece();
                    }
                    case 3 -> {
                        generalOnePiece();
                    }
                    default -> {

                        System.out.println("Opcion incorrecta");

                     }
                }
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
