/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Random;

/**
 *
 * @author Raquel Rojas
 */
public class Password {
    public static char[] generatePswd() {
        Random r = new Random();
        int len = r.nextInt((12 - 8) + 1) + 8;//para la logitud random entre 8-12
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));

        }
        for (int a = 0; a < password.length; a++) {
            if (a != 0) {
                if (Character.isUpperCase(password[a]) && Character.isUpperCase(password[a - 1])) {
                    password[a] = Character.toLowerCase(password[a]);
                }
                if (Character.isLowerCase(password[a]) && Character.isLowerCase(password[a - 1])) {
                    password[a] = Character.toUpperCase(password[a]);
                }
            }

        }
        return password;
    }
    public static double getRandom(Double valorMinimo, Double valorMaximo) {
        Random rand = new Random();
        return  valorMinimo + ( valorMaximo - valorMinimo ) * rand.nextDouble();
    }
}
