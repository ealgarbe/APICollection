/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author educacionit
 */
public class EjemploSortedSet {
    public static void main(String[] args){
        SortedSet<String> ordenados = new TreeSet <> ();
        
        ordenados.add("b");
        ordenados.add("z");
        ordenados.add("a");
        ordenados.add("b");
        
        for(String l:ordenados){
    System.out.println(l);
    }

}
}
