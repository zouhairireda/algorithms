package com.algorithmeProjects.sigma;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter value of Sigma : ");
			double sigma = sc.nextDouble();
			
			System.out.print("Enter initial value of Omega : ");
			int omegaInit = sc.nextInt();
			
			System.out.print("Enter end value of Omega : ");
			int omegaFinal = sc.nextInt();
			
			System.out.print("Enter initial value of R1 : ");
			double initR1 = sc.nextDouble();
			
			System.out.print("Enter end value of R1 : ");
			double endR1 = sc.nextDouble();
			
			System.out.print("Enter initial value of R2 : ");
			double initR2 = sc.nextDouble();
			
			System.out.print("Enter end value of R2 : ");
			double endR2 = sc.nextDouble();

			Processing processing = new Processing(new Equation(sigma));
			processing.process(omegaInit, omegaFinal, initR1, endR1, initR2, endR2);
			System.out.println("Waiting for result /!\\");
			System.out.println(processing.result);

			char decision = 0;

			while (decision != 'N' && decision != 'Y') {
				System.out.print("Retry ? (Y/N) : ");
				sc = new Scanner(System.in);
				String dec = sc.nextLine();
				decision = dec.charAt(0);
				System.out.println();
			}
			if (decision == 'Y') {
				continue;
			} else if (decision == 'N') {
				break;
			}
		}

	}
}
