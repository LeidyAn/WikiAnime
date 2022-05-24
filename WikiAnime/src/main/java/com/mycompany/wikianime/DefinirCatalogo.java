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
    
    // métodos para información primer ánime 
    
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
    
    // métodos para segundo ánime 
    
    public static void animeSnk () {
        
        System.out.println("El anime se divide en 4 temporadas: ");        
        System.out.println("Primera temporada: ");
        System.out.println("La primera temporada consta de " + DataCatalogo.snkAnime1Temp[0] + " .\n" + 
                "estuvo en emisión desde el " + DataCatalogo.snkAnime1Temp[1] + ". \n" +
                "En este momento esta temporada se encuentra " + DataCatalogo.snkAnime1Temp[2] + ". Fue animada por " +
                DataCatalogo.snkAnime1Temp[4] + " y lo puedes encontrar en " + DataCatalogo.snkAnime1Temp[3] );
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Segunda temporada: ");
        System.out.println("La segunda temporada consta de " + DataCatalogo.snkAnime2Temp[0] + " .\n" + 
                "estuvo en emisión desde el " + DataCatalogo.snkAnime2Temp[1] + ". \n" +
                "En este momento esta temporada se encuentra " + DataCatalogo.snkAnime2Temp[2] + ". Fue animada por " +
                DataCatalogo.snkAnime2Temp[4] + " y lo puedes encontrar en " + DataCatalogo.snkAnime2Temp[3] );
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Tercera temporada: ");
        System.out.println("La tercera temporada consta de " + DataCatalogo.snkAnime3Temp[0] + " .\n" + 
                "estuvo en emisión desde el " + DataCatalogo.snkAnime3Temp[1] + ". \n" +
                "En este momento esta temporada se encuentra " + DataCatalogo.snkAnime3Temp[2] + ". Fue animada por " +
                DataCatalogo.snkAnime3Temp[4] + " y lo puedes encontrar en " + DataCatalogo.snkAnime3Temp[3] );
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Cuarta temporada: ");
        System.out.println("La cuarta temporada consta de " + DataCatalogo.snkAnime4Temp[0] + " .\n" + 
                "estuvo en emisión desde el " + DataCatalogo.snkAnime4Temp[1] + ". \n" +
                "En este momento esta temporada se encuentra " + DataCatalogo.snkAnime4Temp[2] + ". Fue animada por " +
                DataCatalogo.snkAnime4Temp[4] + " y lo puedes encontrar en " + DataCatalogo.snkAnime4Temp[3] );
        System.out.println("--------------------------------------------------------------------------------------------");
        
    }
    
    public static void mangaSnk () {
        System.out.println("El manga de SNK se encuentra " + DataCatalogo.snkManga[3] + ". \n" +
                "Cuenta con un total de " + DataCatalogo.snkManga[0] + " y " + DataCatalogo.snkManga[1] + ". \n" +
                "Fue publicado " + DataCatalogo.snkManga[2] + ".");
        System.out.println("Cuenta con los siguientes tomos: ");
        
        for( int i=0; i < DataCatalogo.snkTomos.length ; i++)
        {
            System.out.println(i+1 + ". " + DataCatalogo.snkTomos[i]);
        }
    }
    
    public static void generalSnk (){
        System.out.println("Dentro los elementos proncipales de la obra encontramos los 9 titanes cambiantes, que son: ");
        
        for( int i=0; i < DataCatalogo.nueveTitanes.length ; i++)
        {
            System.out.println(i+1 + ". " + DataCatalogo.nueveTitanes[i]);
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        System.out.println("Adicionalmente, puedes encontrar los portadores de dichos titanes durante la historia: ");
        for( int i=0; i < DataCatalogo.portadores.length ; i++)
        {
            System.out.println(i+1 + ". " + DataCatalogo.portadores[i]);
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
                int categoria = entrada.nextInt();
                
                switch (categoria) {
                    case 1 -> {
                        animeSnk();
                    }
                    case 2 -> {
                        mangaSnk();
                    }
                    case 3 -> {
                        generalSnk();
                    }
                    default -> {

                        System.out.println("Opcion incorrecta");

                     }
                }

            }
           
            default -> {

                System.out.println("Opcion incorrecta");

            }

      }
        
    }
    
}
