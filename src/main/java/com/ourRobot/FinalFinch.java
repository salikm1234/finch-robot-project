package com.ourRobot;

import com.birdbrain.Finch;
import java.util.Scanner;

public class FinalFinch {
    public static void main(String[] args) {
        Finch myFinch = new Finch();
        Scanner scanner = new Scanner(System.in);
        String user = "";

        myFinch.playNote(60,0.5);


        while (!user.equals("k")){
            user = scanner.next();
            if (user.equals("w")){
             myFinch.setMove("F", 8, 100);
            }
            if (user.equals("a")){
        myFinch.setTurn("L", 30, 100);
            }
            if (user.equals("s")){
             myFinch.setMove("B", 8, 100);
            }
            if (user.equals("d")){
        myFinch.setTurn("R", 30, 100);
            }
        }

        myFinch.playNote(80,0.5);


        myFinch.stopAll();
        myFinch.disconnect();
    }
}











        // for (int i = 0; i < 10; i++) {
        //     myFinch.setBeak(100, 100, 100);
        //     myFinch.pause(1);
        //     myFinch.setBeak(0, 0, 0);
        //     myFinch.pause(1);
        // }