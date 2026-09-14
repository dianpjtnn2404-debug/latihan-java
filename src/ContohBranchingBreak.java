/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dianp
 */
public class ContohBranchingBreak {
    public static void main(String[] args) {
        int[] a = {32, 87, 3, 589, 12};
        int target = 12; 
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) { 
                idx = i; 
                break; 
            }
        }

        search:
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == target) { 
                    found = true; 
                    break search; 
                }
            }
        }
    }
}
