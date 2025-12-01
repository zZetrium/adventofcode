/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zetrium.adventofcode;

/**
 *
 * @author xzidek
 */
public class SecretEntrance {

    public static final int MAX_NUMBER = 99;
    public static final int START_NUMBER = 50;

    public int findPassword(String data) {
        String[] instructions = data.split("\n");
        int cur = START_NUMBER;
        int counter = 0;
        for (String inst : instructions) {
            switch (inst.charAt(0)) {
                case 'L' -> {
                    
                }
                case 'R' -> {
                    
                }
                default -> {
                    throw new IllegalArgumentException();
                }
            }
        }
        return 0;
    }

    public int wrap(int num) {
        while (num < 0) {
            num += MAX_NUMBER + 1;
        }
        num %= MAX_NUMBER + 1;
        return num;
    }
}
