/**
 * @(#) Main.java;
 * <p/>
 * Created on Jul 4, 2008
 * AUTHOR    ** Danil Glinenko
 * EMAIL     ** dglinenko@gmail.com
 * <p/>
 * /**
 *
 * Copyright (C) 2008 Danil Glinenko
 */

package org.testfw;


public class Main {
    private static final String VERSION = "0.9.1";

    private Main() {
    }

    public static void main(final String[] args) {
        for (final String arg : args) {
            if (arg.equals("-v")){
                System.out.println("DbAssert " + VERSION);
            }
        }
   }
}