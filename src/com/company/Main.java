package com.company;
import java.io.*;



public class Main {



    public static void main(String[] args) throws InterruptedException {

        //System.out.println(map[0].length);
        //30 vertical 200 horizontal
        // 6000 index positions per map
        //24000 characters or so unfilled
        //49 regions

        /*
        for (int i = 0; i < 30; i++) {
            System.out.println("");
            for (int j = 0; j < 200; j++) {
                System.out.print(map[i][j]);
            }
        }
        */

        //13 vertical 38 horizontal
        //494 index positions

        /*
        for (int i = 0; i < 13; i++) {
            System.out.println("");
            for (int j = 0; j < 38; j++) {
                System.out.print(tutorialMap1[i][j]);
            }
        }
        */

        //BLACK	\u001B[30m	BLACK_BACKGROUND	\u001B[40m
        //RED	\u001B[31m	RED_BACKGROUND	\u001B[41m
        //GREEN	\u001B[32m	GREEN_BACKGROUND	\u001B[42m
        //YELLOW	\u001B[33m	YELLOW_BACKGROUND	\u001B[43m
        //BLUE	\u001B[34m	BLUE_BACKGROUND	\u001B[44m
        //PURPLE	\u001B[35m	PURPLE_BACKGROUND	\u001B[45m
        //CYAN	\u001B[36m	CYAN_BACKGROUND	\u001B[46m
        //WHITE	\u001B[37m	WHITE_BACKGROUND	\u001B[47m

        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";

    String map[][] =     {{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
                          {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".","04","",".",".",".",".",".",".",".","/",".",".",".","06","",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","25","",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","29","",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","38","",".",".",".",".","#"},
                          {"#",".",".",".",".","01","",".",".",".",".",".",".",".",".",".","/",".",".",".","ID","",".",".",".",".",".",".",".","/",".",".",".","ID","",".",".",".",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".","/",".",".",".",".","26","",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","/",".",".",".",".",".",".",".","28","",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","ID","",".",".",".",".",".",".","/",".",".",".",".","33","",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".","ID","",".",".",".",".","#"},
                          {"#",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".","/",".",".","00","",".",".",".",".","/","/","/","/",".",".",".","00","",".",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#",".",".",".",".",".",".","00","",".",".",".","/",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".","27","",".",".",".","/",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","00","",".",".",".",".",".",".","/",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","37","",".",".",".",".",".","/",".",".",".","00","",".",".","#","#","#"},
                          {"#",".",".",".",".","00","",".",".",".",".",".",".",".",".",".",".",".","/",".","/","/","/","/","/","/",".",".",".","/",".",".",".",".","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#",".",".",".",".",".","/",".",".",".",".",".","00","",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".","ID","",".",".",".","/",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".",".","/",".","/","/","/","/","/","/","/","/",".",".",".",".",".",".","/",".",".",".",".","00","",".","/","/","/","/","/","/","/","/","/","/",".",".",".",".",".","ID","",".",".",".",".",".",".","/",".",".",".",".",".",".","#","~","~"},
                          {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/","/","/",".","/",".",".",".",".","07","",".",".",".",".","/",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#",".",".",".",".",".","/",".",".",".",".",".","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","00","",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","31","",".",".","/","/","/","/","/","/","/","/","/","/","/","/","/","/",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","00","",".",".",".",".",".",".",".","/",".",".","#","#","#","~","~","~"},
                          {"#","/","/","/","/",".",".",".",".",".",".","/","/","/","/",".",".",".",".",".","/",".",".",".","ID","",".",".",".",".","/",".",".","#","+","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".","18","",".",".",".",".",".",".",".",".","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","#","#","#","#",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".","/",".","/","/","/","/","/","/","/","/",".",".",".",".",".",".",".","/",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".","/",".",".",".",".",".","34","",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#","#","~","~","~","~","~","~"},
                          {"#",".",".","/",".","/","/","/","/","/","/",".",".",".",".","05","",".",".",".",".","/",".",".","00","",".",".",".",".","#","#","#","~","~","+","~","~","~","~","~","~","~","~","~","#",".",".",".",".",".","15","",".",".",".",".",".",".",".","/",".",".",".",".","ID","",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".","#","#","#","#","#","#","#","#","~","+","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".","/","/","/","/","/","/","/",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".","/",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".","#","#","#","~","~","~","~","~","~","~","~"},
                          {"#",".",".","/",".",".",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".",".","/",".",".",".",".","#","#","#","~","~","~","~","~","+","~","~","~","~","~","~","#","#","#",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".","/",".",".",".",".","00","",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","21","",".",".",".",".",".",".",".","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#",".",".",".",".","/",".",".",".",".",".",".","30","",".",".",".",".",".",".",".","/","/","/","/","/",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","00","",".",".",".",".",".",".",".",".","/","/","/","/","/","/",".",".",".",".",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".","/",".",".",".",".",".",".",".",".",".",".","00","",".",".",".",".","/","/","/","#","#","#","~","~","~","~","~","~","~","~","~","+","~","~","#","#","#",".",".",".",".",".",".",".",".",".","00","",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".","#","#","#","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".",".",".","/","/","/","/","/","/",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","/","/","/","/","/","/",".",".",".",".",".",".","/",".",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".","/","/","/","/",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","+","#","#",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/","/",".",".",".",".",".","/","/","/","/","/","/","/","/",".",".",".",".","/",".",".",".","00","",".",".",".",".",".",".",".",".","/","/",".",".",".","#","~","~","~","~","~","~","~","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#",".","00","",".",".",".",".",".",".",".",".",".","/","/","/",".",".",".",".",".",".","/","/","/","/","/","/",".",".",".",".",".","/","/","/","/",".",".",".",".",".",".",".","36","",".",".",".",".","/","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".",".",".","/","/","/",".",".",".",".","/","/","/","/",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","#",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","/","/","/","/","/","/",".",".","/","/","/","/","/",".",".",".",".",".",".",".",".","/","/","/","/","/","/",".",".",".",".",".",".",".",".",".","/","/","/",".",".",".",".",".","#","~","~","~","~","~","~","#",".",".",".",".",".","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#",".",".",".","/","/","/","/",".",".",".",".",".","32","",".",".",".",".",".",".",".",".","/","/","/","/","/",".",".",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".",".",".",".",".",".","/","/",".","/",".",".",".",".","08","",".",".",".","#","+","+","+","~","~","~","~","~","~","~","~","~","#",".",".","13","",".",".",".",".","/",".",".",".","/","/","/","/","/",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","19","",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".","/","/","/",".",".",".",".",".",".",".",".","#","+","+","+","~","~","~","#",".",".",".","23","",".",".",".",".",".","/","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","#","#","#",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".",".",".",".","/","/","/","/","/","/","/",".",".",".",".","00","",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".","02","",".",".",".",".",".","/",".",".",".",".",".","ID","",".",".","#","~","~","~","~","+","+","+","~","~","~","~","~","#",".",".",".","ID","",".",".",".",".","/",".","/","/",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".",".","/",".",".","/","/",".",".",".",".",".","22","",".",".",".",".","#","~","~","~","+","+","#",".",".",".",".","ID","",".",".",".",".","/",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","#","#","#",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".",".","/","/","/","/",".",".",".",".",".",".",".","/","/","/","/",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".","ID","",".",".",".",".",".",".","/","/","/",".",".","00","",".",".","#","~","~","~","~","~","~","~","+","+","+","~","~","#",".",".",".","00","",".",".",".","/","/","/",".",".",".",".",".","16","",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".",".",".",".",".","/","/",".",".",".",".",".",".",".","ID","",".",".",".","#","~","~","~","~","~","~","#",".",".",".",".","00","",".",".",".","/",".",".","24","",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","#","#","#","#",".",".",".",".",".",".",".",".","/","/","/","/","/",".",".",".",".",".","35","",".",".",".",".",".",".",".",".","/","/","/",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".","00","",".",".",".",".",".",".",".",".",".","/","/",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","+","+","#",".",".",".",".",".","/","/","/",".",".","/",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","00","",".",".",".","#","~","~","~","~","~","~","~","#",".",".",".",".",".",".",".","/",".",".",".","ID","",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","#","#","#",".",".","/","/","/",".",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/","/","/","/","#","~","~","~","~","~","~","~","~","~","~","~","~","#",".",".","/","/","/",".","."," ",".",".","/",".",".",".",".",".","00","",".",".",".",".",".",".",".",".",".","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","#",".",".",".",".",".","/",".",".",".",".","00","",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#",".",".",".",".",".",".",".",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".","#","#","#","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".",".",".",".",".",".",".",".",".","/","/","/","/","/",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","~","~","~","#","/",".",".",".",".","14","",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","#","#","#","#","/",".",".",".",".",".",".",".","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#","#","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#",".",".",".",".",".",".",".","/","/","/","/",".",".",".","09","",".",".",".",".","/","#","~","~","~","~","~","~","~","~","~","~","~","~","#",".",".",".",".",".","ID","",".",".",".","/",".",".",".",".",".",".",".","/","/","/","/","/","/","/","/","/",".",".",".",".",".","20","",".",".",".",".",".",".",".",".",".",".","/",".",".",".","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#",".",".",".",".",".",".","#","#","#","#","#","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"},
                          {"#",".",".",".","/","/","/","/",".",".",".",".",".",".",".","ID","",".",".",".","/",".","#","~","~","~","~","~","~","~","~","~","~","~","~","#",".",".",".",".",".","00","",".",".",".","/","/","/","/","/","/","/","/",".",".",".",".",".",".",".",".","/",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","#","#","#",".","#"},
                          {"#","/","/","/",".",".",".",".","/",".",".",".",".",".",".","00","",".",".","/",".",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~","#","#",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".","17","",".",".",".",".",".",".",".","/",".",".",".",".",".","00","",".","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","#","#","#","#","#","#","#",".",".",".",".","42","",".",".","#","#","#","#","~","~","~","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#",".",".",".",".","#"},
                          {"#",".",".",".",".",".",".",".",".","/","/","/","/",".",".",".",".",".","/",".",".",".",".",".",".","#","#","#","~","~","~","~","~","~","~","~","~","~","#","#","#","#",".",".",".",".","/",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".","/",".",".",".","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".",".",".","#","#","#","~","~","~","~","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
                          {"#",".",".",".",".",".",".",".",".",".",".",".",".","/","/",".",".","/",".",".",".",".","11","",".",".",".",".","#","#","~","~","~","~","~","~","~","~","+","~","~","~","#","#","#","#","/",".",".",".",".",".",".","00","",".",".",".",".",".",".",".","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#",".",".","40","",".",".",".",".",".",".","/","/","/","/",".",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".",".","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#",".",".",".","48","",".",".",".",".",".",".",".",".",".",".",".",".","#"},
                          {"#",".",".","03","",".",".",".",".",".",".",".",".",".",".","/","/",".",".",".",".",".","ID","",".",".",".",".",".",".","#","#","~","~","~","~","~","~","+","~","~","~","~","~","~","~","#","#","#","#",".",".",".",".",".",".",".","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".","/","/","/","/","/","/",".",".",".",".",".",".",".",".","/","/","/","/",".",".",".",".",".",".",".","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".",".",".",".","#"},
                          {"#",".",".","ID","",".",".",".",".",".",".",".",".","/","/",".",".","/","/",".",".",".","00","",".",".",".",".",".",".","/",".","#","#","#","#","~","~","+","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","~","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".","00","",".",".",".",".",".",".","/","/","/","/",".",".",".",".",".",".","/","/","/","/","/","/","/","/",".",".",".","/",".",".",".","44","",".",".","/",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#",".",".",".",".",".",".","/",".",".",".",".",".",".",".","00","",".",".",".",".",".","/","/","/","/","/","/","/","#"},
                          {"#",".",".","00","",".",".",".",".",".",".","/","/",".",".","10","",".",".","/","/",".",".",".",".",".",".",".",".","/",".",".","12","",".",".","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","+","+","+","+","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#",".",".",".",".",".","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".","ID","",".",".","/",".",".",".",".","#","#","#","#","#","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#",".",".","/",".",".",".","47","",".",".",".","/",".",".",".",".",".",".",".",".","/","/","/","/","/",".",".",".",".",".",".",".","#"},
                          {"#",".",".",".",".",".",".",".","/","/","/",".",".",".",".","ID","",".",".",".",".","/","/","/",".",".",".",".",".","/",".",".","ID","",".",".",".",".",".",".","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","+","+","+","+","+","+","~","~","~","~","~","~","#","#","#","#",".",".",".",".",".","39","",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","41","",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".","43","",".",".",".",".",".",".",".",".",".","/",".",".",".","00","",".",".","/",".",".",".","45","",".",".",".",".","#","#","#","#","#","#",".",".",".","46","",".",".",".",".",".",".",".","/",".",".",".","ID","",".",".",".",".","/",".",".",".",".","/","/","/",".",".",".",".","49","",".",".",".",".",".",".","#"},
                          {"#",".",".",".",".",".","/","/",".",".",".",".",".",".",".","00","",".",".",".",".",".",".",".","/","/","/",".","/",".",".",".","00","",".",".",".",".",".",".",".",".",".",".",".","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","+","+","+","#","#","#",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".","/",".",".",".",".","ID","",".",".",".",".",".",".","/",".",".",".",".",".",".","ID","",".",".",".",".",".",".",".","/",".",".",".","00","",".",".",".",".",".","/","/",".","/",".",".",".",".",".",".",".","ID","",".",".",".",".",".",".","#"},
                          {"#",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","/","/",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#",".",".",".",".",".",".",".",".",".",".",".",".","00","",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".","00","",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".","/",".",".",".",".","00","",".",".",".",".",".",".","/",".",".",".",".",".",".","00","",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".","00","",".",".",".",".",".",".","#"},
                          {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}};

        String tutorialMap1 [][] =     {{"#","#","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
                                        {"#",".",".",".",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","#",".",".",".",".",".","/",".",".",".",".",".",".","|","|","|","#"},
                                        {"#",".",".","01","",".","I",".",".",".",".","#","~","~","~","~","~","~","~","~","#","^","^","03","",".",".","/",".",".",".","05","",".",".",".",".","#"},
                                        {"#",".",".","NC","",".","=","=","=",".","#","~","~","~","~","~","~","~","~","~","#","^","^","NC","",".",".","/","|",".",".","NC","","|","|","|",".","#"},
                                        {"#",".",".","00","",".",".",".",".","#","~","~","~","~","~","~","~","~","~","#",".",".",".","00","",".",".","/","|","|",".","00","","|","|","|",".","#"},
                                        {"#",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","#",".",".",".",".","^","^","^","/",".",".",".",".",".",".",".",".",".","#"},
                                        {"#","/","/","/","/","/","/","/","#","~","~","~","~","~","~","~","~","~","#","/","/","/","/",".","^","^","^","/","/","/","/","/","/","/","/","/","/","#"},
                                        {"#",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","[",".",".",".",".","/","/","/","/","/",".",".",".",".",".",".",".","*",".","#"},
                                        {"#",".",".","02","",".",".","#","~","~","~","~","~","~","~","~","~","[","[",".","04","",".",".",".",".",".","/",".","*",".",".","06","",".","*",".","#"},
                                        {"#",".",".","NC","",".",".","#","~","~","~","~","~","~","~","~","~","[","[",".","NC","",".",".",".",".",".","/","*","*",".",".","NC","","*",".",".","#"},
                                        {"#",".",".","00","",".","#","+","+","+","+","+","+","+","+","+","#",".",".",".","00","",".",".",".",".",".","/",".","*","*",".","00","","*",".",".","#"},
                                        {"#",".",".",".",".",".","#","~","~","~","~","~","~","~","~","#",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","#"},
                                        {"#","#","#","#","#","#","#","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}};

        String tutorialMap2 [][] =     {{"#","#","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
                                        {"#",".",".",".",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","#",".",".",".",".",".","/",".",".",".",".",".",".","|","|","|","#"},
                                        {"#",".",".","01","",".","I",".",".",".",".","#","~","~","~","~","~","~","~","~","#","^","^","03","",".",".","/",".",".",".","05","",".",".",".",".","#"},
                                        {"#",".",".","PL","",".","=","=","=",".","#","~","~","~","~","~","~","~","~","~","#","^","^","NC","",".",".","/","|",".",".","NC","","|","|","|",".","#"},
                                        {"#",".",".","00","",".",".",".",".","#","~","~","~","~","~","~","~","~","~","#",".",".",".","00","",".",".","/","|","|",".","00","","|","|","|",".","#"},
                                        {"#",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","~","#",".",".",".",".","^","^","^","/",".",".",".",".",".",".",".",".",".","#"},
                                        {"#","/","/","/","/","/","/","/","#","~","~","~","~","~","~","~","~","~","#","/","/","/","/",".","^","^","^","/","/","/","/","/","/","/","/","/","/","#"},
                                        {"#",".",".",".",".",".",".",".","#","~","~","~","~","~","~","~","~","~","[",".",".",".",".","/","/","/","/","/",".",".",".",".",".",".",".","*",".","#"},
                                        {"#",".",".","02","",".",".","#","~","~","~","~","~","~","~","~","~","[","[",".","04","",".",".",".",".",".","/",".","*",".",".","06","",".","*",".","#"},
                                        {"#",".",".","NC","",".",".","#","~","~","~","~","~","~","~","~","~","[","[",".","NC","",".",".",".",".",".","/","*","*",".",".","FA","","*",".",".","#"},
                                        {"#",".",".","00","",".","#","+","+","+","+","+","+","+","+","+","#",".",".",".","00","",".",".",".",".",".","/",".","*","*",".","00","","*",".",".","#"},
                                        {"#",".",".",".",".",".","#","~","~","~","~","~","~","~","~","#",".",".",".",".",".",".",".",".",".",".",".","/",".",".",".",".",".",".",".",".",".","#"},
                                        {"#","#","#","#","#","#","#","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}};

    printMap(map, 30, 200);
    System.out.println();
    System.out.println();
    //Thread.sleep(3000);
    printMap(tutorialMap1, 13, 38);
    System.out.println();
    System.out.println();
    //Thread.sleep(3000);
    printMap(tutorialMap2, 13, 38);

    }



    public static void printMap(String mapName[][], int row, int column) throws InterruptedException {

        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_BK_YELLOW = "\u001B[43m";
        String ANSI_BK_BLACK = "\u001B[40m";
        String ANSI_BK_RED = "\u001B[41m";
        String ANSI_BK_GREEN = "\u001B[42m";
        String ANSI_BK_BLUE = "\u001B[44m";
        String ANSI_BK_PURPLE = "\u001B[45m";
        String ANSI_BK_CYAN = "\u001B[46m";
        String ANSI_BK_WHITE = "\u001B[47m";

        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < column; j++) {
                if (mapName[i][j] == "~") {
                    System.out.print(ANSI_BLUE + mapName[i][j] + ANSI_RESET);
                }
                if (mapName[i][j] == ".") {
                    System.out.print(ANSI_GREEN + mapName[i][j] + ANSI_RESET);
                }
                if (mapName[i][j] == "#") {
                    System.out.print(ANSI_YELLOW + mapName[i][j] + ANSI_RESET);
                }
                if (mapName[i][j] == "/") {
                    System.out.print(ANSI_BLACK + mapName[i][j] + ANSI_RESET);
                }
                if (mapName[i][j] == "+") {
                    System.out.print(ANSI_PURPLE + mapName[i][j] + ANSI_RESET);
                }
                if (mapName[i][j].length() == 2) {
                    System.out.print(ANSI_RED + mapName[i][j] + ANSI_RESET);
                }
                if (mapName[i][j] == "^" || mapName[i][j] == "|" || mapName[i][j] == "*" || mapName[i][j] == "[" || mapName[i][j] == "]" || mapName[i][j] == "I" || mapName[i][j] == "=") {
                    System.out.print(ANSI_CYAN + mapName[i][j] + ANSI_RESET);
                }
            }
        }
    }
}
