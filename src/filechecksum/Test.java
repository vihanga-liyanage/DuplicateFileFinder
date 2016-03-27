/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filechecksum;

/**
 *
 * @author Vihanga Liyanage
 */
public class Test {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        for(int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                System.out.println(array[i] + array[j]);
            }
        }
    }
}
