package com.kabaddi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Interview {

	public void method() {
		Scanner scanner= new Scanner(System.in);
		Queue<Integer> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();

		System.out.println("Enter The Total Size :");
		int n=scanner.nextInt();

		for (int i = 0; i < n; i++) {
			queue2.add(i);
		}

		System.out.println("Enter The Size Of Reception :");
		int m=scanner.nextInt();

		for (int i = 0; i < m; i++) {
			if (queue2.peek()==null) {
				break;
			}
			queue1.add(queue2.poll());
		}

		while (queue1.peek()!=null) {
			System.out.println("Enter The Any Key Allow Next Perss");
			scanner.next();
			System.out.println("Current Candidate"+queue1.poll());
			if (queue2.peek()!=null) {
				queue1.add(queue2.poll());
			}
		}

		scanner.next();
		System.out.println("All Participants are interviewd");
		scanner.close();
	}
}
