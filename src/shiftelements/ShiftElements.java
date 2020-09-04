/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftelements;

import java.util.Arrays;

/**
 *
 * @author Edgaras
 */
public class ShiftElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] m = {5, 12, -3, 8, -1};
        int[][] r = new int[m.length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                r[i][(i+j) % m.length] = m[j];
//                r[i][j] = m[(i + j) % m.length]; Shiftint is kitos pusės
            }
        }
        System.out.println(Arrays.deepToString(r));
    }
    
}
