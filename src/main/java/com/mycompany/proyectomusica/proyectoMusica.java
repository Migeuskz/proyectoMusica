/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

import static com.mycompany.proyectomusica.Artist.leerArchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Mikey
 */
public class proyectoMusica {
    
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
    public static void main(String[] args) throws IOException {
        BufferedReader buferTeclado = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String fileName;
        
        ArrayList<Artist> artistas = new ArrayList<>();
        //Artist a = new Artist("Stra Kids","K-Pop");
        //artistas.add(a);
        
        int dato, opcion;
        char respuesta;
        
        System.out.println("Programa que ejecuta una Lista de Reproducción:");
        System.out.println("¿Qué quieres hacer?");
        System.out.println();
        
        do{
            System.out.println("😎😋 Elige la opción que quieras 😋😎: ");
            System.out.println("1: Es Mostrar tus artistas favoritos: ");
            System.out.println("2: Agregar un artista: ");
            System.out.println("3: Insertar mas artistas");
            System.out.println("4: Eliminar el inicio!");
            System.out.println("6: Terminar programa: ");
            entrada = buferTeclado.readLine();
            opcion = Integer.parseInt(entrada);
            System.out.println();
            
            switch(opcion){
                case 1:
                    System.out.println("Tus artistas favoritos son: ");
                    System.out.println("============================");
                    System.out.println("Contenido del archivo: ");
                    leerArchivo(entrada);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Lo siento pero esa opción no existe :(");
                    break;
            }
        }while(opcion!=5);
        
        
    }
}
