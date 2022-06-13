package com.company;

public class Main {

    public static void main(String[] args) {

    String map[][] =     {{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," ","#"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," ","#"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","#","#","#"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," ","/","/","/","/","/","/"," "," "," ","/"," "," "," "," ","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#"," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," ","/","/","/","/","/","/","/","/"," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","/","/","/","/","/","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," ","#","~","~"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/"," ","/"," "," "," "," "," "," "," "," "," "," ","/"," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#"," "," "," "," "," ","/"," "," "," "," "," ","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/","/"," /","/","/","/","/","/","/"," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," ","#","#","#","~","~","~"},
                          {"#","/","/","/","/"," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","/"," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," ","/"," ","/","/","/","/","/","/","/","/"," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~"},
                          {"#"," "," ","/"," ","/","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," ","/","/","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~"},
                          {"#"," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#"," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/"," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/"," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/"," "," "," "," "," "," ","/"," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/"," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#"," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," "," "," ","/","/","/","/","/","/","/","/"," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," ","#","~","~","~","~","~","~","~","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/"," "," "," "," "," "," ","/","/","/","/","/","/"," "," "," "," "," ","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," ","/","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," ","/","/","/"," "," "," "," ","/","/","/","/"," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/"," "," ","/","/","/","/","/"," "," "," "," "," "," "," "," ","/","/","/","/"," ","/"," "," "," "," "," "," "," "," "," ","/","/","/"," "," "," "," "," ","#","~","~","~","~","~","~","#"," "," "," "," "," ","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#"," "," "," ","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," "," "," "," ","/","/"," ","/"," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," ","/"," "," "," ","/","/","/","/","/"," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," ","/","/","/"," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," "," ","/","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," ","/"," ","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," ","/","/"," "," "," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," ","/","/","/"," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," ","/"," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," "," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," "," "," ","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/"," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," ","/","/","/"," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," "," ","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," ","/","/","/"," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","#"," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/"," "," "," "," ","#","~","~","~","~","~","~","~","~","~","~","~","~","~","#","/"," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","#","#","#","#","/"," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~"},
                          {"#"," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," "," "," "," "," ","/","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","/","/","/","/","/","/","/"," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," ","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," ","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"},
                          {"#"," "," "," ","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," ","/"," ","#","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/","/","/"," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," ","#"},
                          {"#","/","/","/"," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," ","/"," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","#","#"," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," ","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#"," "," "," "," "," "," "," "," ","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#"," "," "," "," ","#"},
                          {"#"," "," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," ","/"," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," ","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," ","/"," "," "," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," "," ","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/"," "," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," "," "," ","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"},
                          {"#"," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," ","/","/"," "," "," "," "," "," "," "," "," "," "," ","/"," ","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/"," "," "," "," "," "," ","/","/","/","/","/","/","/","/"," "," "," ","/"," "," "," "," "," "," "," ","/"," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/","/","/","/","/","#"},
                          {"#"," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," "," "," "," ","/","/"," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," ","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#"," "," "," "," "," ","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/"," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","/"," "," "," "," ","#","#","#","#","#","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#"," "," ","/"," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," ","/","/","/","/","/"," "," "," "," "," "," "," ","#"},
                          {"#"," "," "," "," "," "," "," ","/","/","/"," "," "," "," "," "," "," "," "," "," ","/","/","/"," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," ","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","#","#","#","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," ","/"," "," "," "," ","/","/","/"," "," "," "," "," "," "," "," "," "," "," "," ","#"},
                          {"#"," "," "," "," "," ","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/","/"," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," ","/","/"," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"},
                          {"#"," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," ","/"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"},
                          {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","~","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}};

        System.out.println(map[0].length);
        //30 vertical 200 horizontal
        // 6000 index positions per map
        //24000 characters or so unfilled
        //49 regions

        for (int i = 0; i < 30; i++) {
            System.out.println("");
            for (int j = 0; j < 200; j++) {
                System.out.print(map[i][j]);
            }
        }




    }
}
