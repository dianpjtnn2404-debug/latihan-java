/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dianp
 */
public class ContohBranchingContinueReturn {
    public static void main(String[] args) {
        int count = 0; 
        String s = "peter piper picked...";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'p') continue;
            count++;
        }

        int x = 5;
        if (x < 0) return;
        return ++count;
    }
}
