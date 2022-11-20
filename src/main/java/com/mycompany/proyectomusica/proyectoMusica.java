/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Mikey
 */
public class proyectoMusica {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
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
            entrada = bufer.readLine();
            opcion = Integer.parseInt(entrada);
            System.out.println();
            
            switch(opcion){
                case 1:
                    
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
