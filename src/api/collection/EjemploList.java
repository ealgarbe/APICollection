/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.collection;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {


    
    public static void main(String[] args) {
        List <String> nombres = new ArrayList<>();
            nombres.add ("Juan");
            nombres.add ("Pedro");
            nombres.add("Juan");
            System.out.println(nombres.size());
            nombres.remove(0);
            for (String e:nombres){
                System.out.println(e);
            }
    }
    
}
