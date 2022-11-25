/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

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
        BufferedReader buferTeclado =  new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String fileName;
        int option;
        
        LinkedList<String> lista = new LinkedList<>();
        
        //agregar elementos
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("xD");
        lista.add(":3");
        
        System.out.println("Lista: " + lista);
        entrada = buferTeclado.readLine();
        lista.addFirst(entrada);
        lista.addLast(entrada);
        System.out.println("Lista: " + lista);
        
        lista.remove(2);
        System.out.println("Lista: " + lista);
        lista.remove(":3");
        System.out.println("Lista: " + lista);
        
        for(String palabras: lista ){
            System.out.println("Elemento de la lista: " + palabras);
        }
    }
}
