/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

//import static com.mycompany.proyectomusica.Artist.leerArchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Mikey
 */
public class proyectoMusica {
    
    //al exportar la funcion de archivos de la clase pasada, noté que no funciona :((( 
    
    public static void leerArchivo(String name){
        File archivo = null;//apunta a un archivo físico del dd
        FileReader fr = null;//para leer el archivo
        BufferedReader bufer = null;
        
        try{
            //creamos un apuntador a un archivo en físico
            archivo = new File("E:\\" + name + ".txt" );
            //abremos el archivo para lectura
            fr = new FileReader(archivo);
            //configurar bufer para hacer la lectura
            bufer = new BufferedReader(fr);
            
            //Lectura del contenido del archivo 
            String linea;
             //mientras haya información en el archivo 
            while((linea = bufer.readLine()) != null)
                System.out.println("Linea del archivo: " + linea);
            
        }catch(Exception e){
            System.out.println("Error: No se encuentra el archivo");
            e.printStackTrace();
        }finally{
            //Esta cláusula se ejecuta siempre
            //Se cierra el archivo
            try{
                if(null != fr){
                    //Si se logró abrir el archivo, debemos cerrarlo.
                    fr.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader buferTeclado =  new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String fileName;
        int option;
        
        System.out.println("Programa que crea tu playlist fav 🎧:");
        System.out.println("=========================================");
        System.out.println("1 - Leer un archivo de texto existente");
        System.out.println("2 - Agregar un artista nuevo");
        System.out.println("¿Qué quieres hacer?");
        entrada = buferTeclado.readLine();
        option = Integer.parseInt(entrada);
        System.out.println("Escribe el nombre del archivo a abrir: ");
        entrada = buferTeclado.readLine();
        fileName = entrada;
        switch(option){
            case 1:{
                //Lectura de un archivo de texto
                System.out.println("Programa que lee un archivo de texto:");
                System.out.println("=====================================");
                System.out.println("Contenido del archivo: ");
                leerArchivo(entrada);
            }
            break;
            case 2:{
                System.out.println("Tus artistas favoritos son: ");
               // escribirArchivo(fileName
            }
            break;
            default:System.out.println("La opción no existe");
            
        }
        
    }
}
