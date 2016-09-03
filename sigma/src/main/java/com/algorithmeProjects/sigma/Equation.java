package com.algorithmeProjects.sigma;

public final class Equation {

	private static final int FIXED_MIN_OMEGA = 1;
	private static final int FIXED_MIN_TETA = 36;
	private static final double FIXED_MIN_R1 = 0.01;
	private static final double FIXED_MIN_R2 = 0.02;
	private static final int FIXED_MIN_N = 51;
	private final static double PI = Math.PI;
	private final static double G = 9.81;
	private double sigma;
	private int N = FIXED_MIN_N;
	private int teta = FIXED_MIN_TETA;
	private int omega = FIXED_MIN_OMEGA;
	private double r1 = FIXED_MIN_R1;
	private double r2 = FIXED_MIN_R2;

	public Equation(double sigma) {
		this.sigma = sigma;
	}

	public static double PI() {
		return PI;
	}

	public static double G() {
		return G;
	}

	public double getSigma() {
		return sigma;
	}

	public void setSigma(double sigma) {
		this.sigma = sigma;
	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public int getTeta() {
		return teta;
	}

	public void setTeta(int teta) {
		this.teta = teta;
	}

	public int getOmega() {
		return omega;
	}

	public void setOmega(int omega) {
		this.omega = omega;
	}

	public double getR1() {
		return r1;
	}

	public void setR1(double r1) {
		this.r1 = r1;
	}

	public double getR2() {
		return r2;
	}

	public void setR2(double r2) {
		this.r2 = r2;
	}

	public double calculate() {
		return (double) ((double) ((2 * PI) * this.N
				* Math.pow(this.omega * 2 * PI / 60, 2) * (Math.pow(this.r2, 3) - Math
				.pow(this.r1, 3))) / (double) (3 * G * Math.tan(this.teta*Math.PI/180)));
	}
}
