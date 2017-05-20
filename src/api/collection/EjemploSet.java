/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.collection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author educacionit
 */
public class EjemploSet {
   public static void main(String[] args){
       
       Set<Persona> personas= new HashSet<>();
       
       personas.add(new Persona ("Juan","10"));
       personas.add(new Persona ("Juan","11"));
       personas.add(new Persona ("Pedro","12"));
       System.out.println(personas.size());
   }
          
}
