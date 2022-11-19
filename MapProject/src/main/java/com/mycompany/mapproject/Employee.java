/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapproject;

/**
 *
 * @author User
 */
public class Employee implements Comparable<Employee>{
    
    private int cin,matricule;
    private String nom,prenom;
    
    public Employee(){
        
    }
    public Employee(int cin ,int matricule,String nom, String prenom){
         this.cin=cin;
         this.matricule=matricule;
         this.nom=nom;
         this.prenom=prenom;
        
    }

    public int getCin() {
        return cin;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employee{" + "cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + '}';
    }



     @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Employee) {
            final Employee e = (Employee) o;
            if (e.getCin() == this.getCin()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Employee o) {
       return this.cin - o.cin;
    }
    
    
    
    }

  
    
  
    

