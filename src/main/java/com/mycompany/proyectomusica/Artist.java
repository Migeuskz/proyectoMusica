/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

import java.util.LinkedList;

/**
 *
 * @author Mikey
 */
public class Artist {
    private String Name;
    LinkedList<album> albunes;
    
    public Artist(String name){
        this.Name = name;
        albunes = new LinkedList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    
   public void add(album newAlbum){
       this.albunes.add(newAlbum);
   }
   
   public void remove(album newAlbum){
       this.albunes.remove(newAlbum);
   }

    public LinkedList<album> getAlbunes() {
        return albunes;
    }
    
       /* public album getAlbuM(int po) {
        return albunes.get(po);
    }*/
}