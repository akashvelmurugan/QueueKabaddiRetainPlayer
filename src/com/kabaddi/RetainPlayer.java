package com.kabaddi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RetainPlayer{
	Scanner scanner = new Scanner(System.in);

	public void match() {
		Queue<Integer> queueCurentPlayer = new LinkedList<>();
		Queue<Integer> retainPlayer = new LinkedList<>();

		boolean condition=true;
		while (condition) {
			boolean condition1=true;
			while (condition1) {
				System.out.println("Enter Player Number :");
				boolean playerNumberCondition=true;

				int playerNumber =0;
				while(condition1==true) {
				
						playerNumber=scanner.nextInt();
					if (retainPlayer.contains(playerNumber)) {
						System.out.println("This player is already on the bench");
						System.out.println("Enter again player number :");
					}else {
						//retainPlayer.add(playerNumber);
						condition1=false;
					}
				}	
				
				if (playerNumber>=1 && playerNumber<=7) {
					retainPlayer.add(playerNumber);
					condition1=false;
				}else if(playerNumber==0) {
					System.out.println("0 point");
					condition1=false;
				}
				else {
					System.out.println("Enter Valid Player Number !!!!!!!");
				}
				System.out.println(retainPlayer);
			}
			System.out.println("Are Going To Player Retain : \nYes -> 1\nNo  -> 2");
			int yes = scanner.nextInt();
			if (yes==1) {
				retainPlayer.poll();
			}
			if (retainPlayer.size()==7) {
				System.out.println("You Loss The Match .......");
				condition=false;
			}
		}
	}
}
