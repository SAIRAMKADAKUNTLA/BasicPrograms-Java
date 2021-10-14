package com.bridgelabz.day_18;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	public static void printBoard(char[][] board) {
		System.out.println(board[0][0] + "|" +board[0][1] + "|" +board[0][2]);
		System.out.println();
		System.out.println(board[1][0] + "|" +board[1][1] + "|" +board[1][2]);
		System.out.println();
		System.out.println(board[2][0] + "|" +board[2][1] + "|" +board[2][2]);
		System.out.println();
	}
	public static void move(char[][] board,int choice,char symbol) {
		switch(choice) {
		case 1:
			board[0][0]=symbol;
			break;
		case 2:
			board[0][1]=symbol;
			break;
		case 3:
			board[0][2]=symbol;
			break;
		case 4:
			board[1][0]=symbol;
			break;
		case 5:
			board[1][1]=symbol;
			break;
		case 6:
			board[1][2]=symbol;
			break;
		case 7:
			board[2][0]=symbol;
			break;
		case 8:
			board[2][1]=symbol;
			break;
		case 9:
			board[2][2]=symbol;
			break;
			default:
				System.out.println("enter valid!!");
				break;
		}
		
	}
	public static boolean checkValid(char[][] board,int position) {
		switch(position) {
		case 1:
			return (board[0][0] == ' ');
		case 2:
			return (board[0][1] == ' ');
		case 3:
			return (board[0][2] == ' ');
		case 4:
			return (board[1][0] == ' ');
		case 5:
			return (board[1][1] == ' ');
		case 6:
			return (board[1][2] == ' ');
		case 7:
			return (board[2][0] == ' ');
		case 8:
			return (board[2][1] == ' ');
		case 9:
			return (board[2][2] == ' ');
			default:
				return false;
		}
		
	}
	public static void playerTurn(char[][] board,Scanner input) {
		int playerChoice;
		while(true) {
			System.out.println("Enter your move (0-9)");
			playerChoice=input.nextInt();
			if(checkValid(board, playerChoice)) {
				System.out.println("your move is "+playerChoice);
				break;
			}
			else {
				System.out.println(playerChoice+" is not a valid move!!!");
			}
		}
		move(board,playerChoice,'X');
	}
	public static void computerTurn(char[][] board) {
		Random r=new Random();
		int computerChoice;
		while(true) {
			computerChoice=r.nextInt(9) + 1;
			if(checkValid(board, computerChoice)) {
				break;
			}
		}
		System.out.println("the computer move is "+computerChoice);
		move(board, computerChoice, 'O');
	}
	public static boolean hasWon(char[][] board,char symbol) {
		if((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
		   (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
		   (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||
		   
		   (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
		   (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
		   (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
		   
		   (board[0][0] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
		   (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
				) {
			return true;
		}
		return false;
	}
	public static boolean gameFinish(char board[][]) {
		if(hasWon(board, 'X')) {
			System.out.println("Player won !!");
			return true;
		}
		if(hasWon(board, 'O')) {
			System.out.println("Computer won !!");
			return true;
		}
		for(int i=0;i<board.length;i++) {
			for(int j=0;j < board[i].length;j++) {
				if(board[i][j] == ' ') {
					return false;
				}
			}
		}
		printBoard(board);
		System.out.println("the game is tie!!");
		return true;
	}
	
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char[][] board= {{' ',' ',' '},
				{' ',' ',' '},
				{' ',' ',' '}
		};
		printBoard(board);
		while(true) {
			playerTurn(board,input);
			printBoard(board);
			computerTurn(board);
			printBoard(board);
			gameFinish(board);
		}
	}

}
