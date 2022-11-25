/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

import java.awt.Menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;



/**
 *
 * @author Mikey
 */
public class proyectoMusica {
    
    //al exportar la funcion de archivos de la clase pasada, noté que no funciona :((( 
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bufer =  new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String nombre,album,cancion;
        int opcion;
        char respuesta;
        
        LinkedList<Artist> lista = new LinkedList<>();
        Acciones acciones = new Acciones();
        
        System.out.println("Programa que crea tu propia Playlist 🎧");
        System.out.println("Por favor ingresa la opcion deseada");
        
        do {
            System.out.println("1.- Agregar a un nuevo artista");
            System.out.println("2.-Eliminar a un artista");
            System.out.println("3.-Agregar un nuevo albúm");
            System.out.println("4.-Eliminar un albúm");
            System.out.println("5.-Agregar una nueva canción");
            System.out.println("6.-Eliminar una canción");
            System.out.println("7.-Ver tu lista de artistas");
            System.out.println("8.- Ver la lista de albúmes por artista");
            System.out.println("9.-Ver la lista de canciones por albúmes");
            System.out.println("10.-Ver todos los artistas existentes");
            System.out.println("11.-Cerrar programa");
            entrada = bufer.readLine();
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1: //Agregar un artista
                    System.out.println("Escribe el Nombre artista: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    Artist newArtista = new Artist(nombre);
                    lista.add(newArtista);
                    acciones.escribirArchivo(newArtista.getName().toString());
                   
                    break;
                case 2: //Eliminar un artista
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pf = Integer.parseInt(entrada);
                    String artista = lista.get(pf).getName().toString();
                    System.out.println(artista);
                    acciones.borrarLinea(artista);
                    lista.remove(pf);
                    break;
                case 3://Agregar un album
                    System.out.println("Tus artistas:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pi = Integer.parseInt(entrada);
                    Artist al = lista.get(pi); //Recupere el artista
                    System.out.println("Escribe el albúm: ");
                    entrada = bufer.readLine();
                    album = entrada;
                    Album unAlbum = new Album(album);
                    //acciones.add(unAlbum, nombre);
                    al.add(unAlbum);
                    String artistaA = lista.get(pi).getName().toString();
                    String albumA = album;
                    acciones.escribirArchivo(albumA, artistaA);
                    break;
                case 4://Eliminar un album
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pv = Integer.parseInt(entrada);
                    Artist av = lista.get(pv); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pw = Integer.parseInt(entrada);
                    av.albunes.remove(pw);
                    break;
                case 5://Agregar una cancion
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int p = Integer.parseInt(entrada);
                    Artist a = lista.get(p); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    p = Integer.parseInt(entrada);
                    Album b = a.getAlbuM(p);//Recupero un album especifico de un artista
                    System.out.println("Escribe el nombre de la canción");
                    entrada = bufer.readLine();
                    cancion = entrada;
                    Song unaCancion = new Song(cancion);
                    b.add(unaCancion);
                    String albumC = b.getNombre().toString();
                    String cancionA = cancion;
                    acciones.escribirArchivo(cancionA, albumC);
                    break;
                case 6://Eliminar cancion
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pq = Integer.parseInt(entrada);
                    Artist aq = lista.get(pq); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    pq = Integer.parseInt(entrada);
                    Album c = aq.getAlbuM(pq);//Recupero un album especifico de un artista
                    System.out.println("Sus canciones:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pñ = Integer.parseInt(entrada);
                    c.songs.remove(pñ);
                    break;
                case 7:
                    System.out.println("Tus artistas:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    break;
                case 8:
                    System.out.println("Tus artistas:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pu = Integer.parseInt(entrada);
                    Artist ab = lista.get(pu); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (int i = 0; i < ab.albunes.size(); i++) {
                        System.out.println("" + ab.albunes.get(i).getNombre().toString());
                    }
                    break;
                case 9:
                    System.out.println("Tus artistas:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pl = Integer.parseInt(entrada);
                    Artist ax = lista.get(pl); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    pq = Integer.parseInt(entrada);
                    Album d = ax.getAlbuM(pl);//Recupero un album especifico de un artista
                    System.out.println("Sus canciones:");
                    for (Artist listita : lista) {
                        System.out.println("El nombre del artista es: " + listita);
                    }
                    break;
                case 10:
                    acciones.leerArchivos("artistas");
                    break;
                
                case 11:
                    System.out.println("Programa finalizado");
                    break;
            }
            
        } while (opcion!=11);
        
        
    }
}
