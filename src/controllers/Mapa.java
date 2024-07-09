package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String,Integer>mapita=new HashMap<>();
        mapita.put("manzana", 20);
        mapita.put("pera", 25);
        mapita.put("mandarina", 20);
        mapita.put("pera", 23);
        System.out.println(mapita);
        mapita.remove("pera");
        System.out.println(mapita);
        System.out.println("Existe Mandarina   "+mapita.containsKey("mandarina"));
        System.out.println("Existe Pera   "+mapita.containsKey("pera"));
        int valorManzana=mapita.get("manzana");
        System.out.println(valorManzana);
        System.out.println(mapita.size());
        System.out.println("Esta vacio  "+mapita.isEmpty());
        System.out.println("\nClaves del mapa");
        for(String x:mapita.keySet()){
            System.out.println("- "+x);
        }
        System.out.println("\nValores del mapa");
        for(Integer x:mapita.values()){
            System.out.println("- "+x);
        }
        System.out.println();
        System.out.println(mapita);
        mapita.replaceAll((k,v)->v*2);
        System.out.println(mapita);
        
        mapita.clear();
        System.out.println(mapita);
    }
}
