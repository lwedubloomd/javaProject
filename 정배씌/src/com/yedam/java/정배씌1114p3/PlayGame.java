package com.home.java.hw221114.question3;

import java.util.Scanner;

public class PlayGame {
	int menuNo;
	int randGame = (int) (Math.random() * 9) + 1;
	Keypad kp = null;

	public PlayGame() {
		boolean run = true;

		while (run) {
			startGame();

			showMenu();

			switch (menuNo) {
			case 1:
				kp.leftUpButton();
				break;
			case 2:
				kp.leftDownButton();
				break;
			case 3:
				kp.rightUpButton();
				break;
			case 4:
				kp.rightDownButton();
				break;
			case 5:
				kp.changeMode();
				break;
			case 0:
				if (randGame % 2 == 0) { // 여기가 잘 안됨
					kp = new ArcadeGame();
				} else if (randGame % 2 == 1) {
					kp = new RPGgame();
				}
				break;
			case 9:
				System.out.println("EXIT");
				run = false;
				break;
			default:
				System.out.println("메뉴 중 선택");
				showMenu();
			}
		}

	}

	private void startGame() { // 여기가 잘 안됨
		if (randGame % 2 == 0) {
			kp = new RPGgame(); 
		} else {
			kp = new ArcadeGame();
		}
	}

	private void showMenu() {
		System.out.println(
				"============================================================================================");
		System.out.println(
				"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
		System.out.println(
				"============================================================================================");
		System.out.print("choice>> ");
		Scanner sc = new Scanner(System.in);
		menuNo = Integer.parseInt(sc.nextLine());
	}

}
