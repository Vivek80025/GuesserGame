package MyProjectPackage;

import java.util.*;

class Guesser{
	int guesserNum;
	public int takeNumGuesser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Guesser guess a number: ");
		guesserNum = sc.nextInt();
		return guesserNum;
	}
}

class Player{
	int playerNum;
	public int takeNumPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Player guess a number: ");
		playerNum = sc.nextInt();
		return playerNum;
	}
}

class Umpire{
	int guesserNum;
	int player1Num;
	int player2Num;
	int player3Num;
	public void collectNumFromrGuesse() {
		Guesser g = new Guesser();
		guesserNum = g.takeNumGuesser();
	}
	
	public void collectNumFromPlayers() {
		Player p1 = new Player();
		player1Num = p1.takeNumPlayer();
		
		Player p2 = new Player();
		player2Num = p2.takeNumPlayer();
		
		Player p3 = new Player();
		player3Num = p3.takeNumPlayer();
	}
	
	public void compair() {
		if(guesserNum == player1Num) {
			if(guesserNum == player2Num && guesserNum == player3Num) {
				System.out.println("all the players won the game");
			}
			else if(guesserNum == player2Num) {
				System.out.println("only player-1 and player-2 won the game");
			}
			else if(guesserNum == player3Num) {
				System.out.println("only player-1 and player-3 won the game");
			}
			else {
				System.out.println("only player-1 won the game");
			}
		}
		else if(guesserNum == player2Num) {
			if(guesserNum == player3Num) {
				System.out.println("only player-2 and player-3 won the game");
			}
			else {
				System.out.println("only player-2 won the game");
			}
		}
		else if(guesserNum == player3Num) {
			System.out.println("only player-3 won the game");
		}
		else {
			System.out.println("no any player won the game");
		}
	}
	
}

public class GuesserGameProject {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromrGuesse();
		u.collectNumFromPlayers();
		u.compair();
	}

}