/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapproject;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class SocieteHashMap implements InterfaceSociete{
    Map maMap = new HashMap();
    
    public SocieteHashMap(){
        this.maMap = new HashMap();
    }

    @Override
    public void ajouterEmployeDepartement(Employee e, Departement d) {
        
        maMap.entrySet();
      }

    @Override
    public void supprimerEmploye(Employee e) {
       maMap.remove(e);
        
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        maMap.containsValue(maMap);
    }

    @Override
    public void afficherLesEmployes() {
        maMap.get(this);
       
    }

    @Override
    public void afficherLesDepartements() {
         System.out.println("departements");
    }

    

    @Override
    public boolean rechercherEmploye(Employee e) {
        for (Employee e : maMap){
     if( e.getNom().equals(nom))
             return true;
}
return false ;
    }
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        for (Departement e : maMap){
     if( e.getNom().equals(nom))
             return true;
}
return false ;
    }
}
    
    
}
