package com.algorithmeProjects.sigma;

import java.util.HashMap;
import java.util.Map;

public class Processing {

	private static final int FIXED_MAX_OMEGA = 10000;
	private static final int FIXED_MAX_N = 150;
	private static final int FIXED_MAX_TETA = 50;
	private static final double FIXED_MAX_R1 = 1;
	private static final double FIXED_MAX_R2 = 1;
	private static final double FIXED_INCREMENT_R1 = 0.1;
	private static final double FIXED_INCREMENT_R2 = 0.1;

	private Equation equation;
	public Map<String, Double> result = new HashMap<String, Double>();

	public Processing() {
		super();
	}

	public Processing(Equation equation) {
		this.equation = equation;
	}

	public Equation getEquation() {
		return this.equation;
	}

	public void setEquation(Equation equation) {
		this.equation = equation;
	}

	public void process(int initValueOmega, int endValueOmega,
			double initValueR1, double endValueR1, double initValueR2,
			double endValueR2) {
		double sigmaResult = 0;
		int omega = equation.getOmega();
		int teta = equation.getTeta();
		int N = equation.getN();
		double r1 = equation.getR1();
		double r2 = equation.getR2();

		double currentDiff = 100000000;

		for (omega = endValueOmega; omega > initValueOmega; omega -= 20) {
			for (teta = 36; teta < FIXED_MAX_TETA; teta++) {
				for (N = 51; N < FIXED_MAX_N; N++) {
					for (r1 = initValueR1; r1 <= endValueR1; r1 += FIXED_INCREMENT_R1) {
						for (r2 = initValueR2; r2 <= endValueR2; r2 += FIXED_INCREMENT_R2) {
							if (r2 <= r1) {
								continue;
							}
							String key = "OMEGA = " + omega + " | TETA = "
									+ teta + " | N = " + N + " | r1 = " + r1
									+ " | r2 = " + r2;

							equation.setOmega(omega);
							equation.setTeta(teta);
							equation.setN(N);
							equation.setR1(r1);
							equation.setR2(r2);
							sigmaResult = equation.calculate();

							if ((sigmaResult - equation.getSigma()) > 0
									&& (sigmaResult - equation.getSigma()) <= currentDiff) {
								currentDiff = sigmaResult - equation.getSigma();
								result.clear();
								result.put(key,
										sigmaResult - equation.getSigma());
							}

						}
					}
				}
			}
		}
	}
}
