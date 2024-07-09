package controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {

        HashMap<Character,Integer>primer=new HashMap<>();
        int tamano=str1.length();
        for (int i=0;i<tamano;i++){
            if(primer.containsKey(str1.charAt(i))){
                primer.put(str1.charAt(i), 2);
            }else if(!primer.containsKey(str1.charAt(i))){
                primer.put(str1.charAt(i), 1);
            }
            if(primer.containsKey(str2.charAt(i))){
                primer.put(str2.charAt(i), 2);
            }else if(!primer.containsKey(str2.charAt(i))){
                primer.put(str2.charAt(i), 1);
            }
        }
        System.out.println(primer);
        for(Integer x:primer.values()){
            if (x==1){
                return false;
            }
        }
        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */ 
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        /*int []result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                int comp=nums[i]+nums[j];
                if(comp==objetivo){
                    result[0]=i; 
                    result[1]=j;
                    return result;
                }
            }
        }
        return null; */
         Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complemento = objetivo - nums[i];
        if (map.containsKey(complemento)) {
            return new int[]{map.get(complemento), i};
        }
        map.put(nums[i], i);
    }
    return null;
    }
}
