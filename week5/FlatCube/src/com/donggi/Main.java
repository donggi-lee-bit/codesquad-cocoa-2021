package com.donggi;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Board board = new Board();
//        board.currentBoard();
        start();
    }

    private static void start() {
        System.out.print("CUBE> ");
        Command command = new Command();
        command.cubeCommand();
    }
}