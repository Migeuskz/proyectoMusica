/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Mikey
 */
public class Artist {
    private String name;
    private String nacionalidad;
    LinkedList<Song> songs;
    
    public static void leerArchivo(String name) throws FileNotFoundException, IOException{
        File archivo = null;
        FileReader fr = null;
        BufferedReader bufer = null;
        
        try{
            archivo = new File("D:\\proyectoMusica" + name + ".txt");
            fr = new FileReader(archivo);
            bufer = new BufferedReader(fr);
            String linea;
            while((linea = bufer.readLine())!=null)
                System.out.println("Linea del archivo: " + linea);
        }catch(Exception e){
            System.out.println("Error: el archivo no se encuentra...");
            e.printStackTrace();
        }finally{
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el archivo...");
                e2.printStackTrace();
            }
        }
    }
}
