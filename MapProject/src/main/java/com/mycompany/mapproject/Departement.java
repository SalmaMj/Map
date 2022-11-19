/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapproject;

/**
 *
 * @author User
 */
public class Departement {
    private int id;
    private String nom;
    
    public Departement (){
        
    }
    public Departement (int id,String nom){
     this.id=id;
     this.nom=nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom=" + nom + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Departement) {
            final Departement dep = (Departement) o;
            if (dep.getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
    
}
