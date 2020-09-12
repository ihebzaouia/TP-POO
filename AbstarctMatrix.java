package com.company;	

public abstract class AbstractMatrix {
private double data [][];   	//field encapsulated
private int nline,ncolumn;	//fields encapsulated
public AbstractMatrix() {	//Default Constructor
	this.nline = 1;
	this.ncolumn = 1;
	this.data[0][0] = 0;
}
public AbstractMatrix(int i, int j) {		
	this.nline = i;
	this.ncolumn = j;
	this.data = new double[i][j];			
	for(int c = 0; c < i; c++) {
		for(int k = 0; k < j; j++) {
			this.data[c][k] = 0;
		}
	}
}

//Getters and Setters

public int getNline() {
	return nline;
}

public int getNcolumn() {
	return ncolumn;
}

public double getData(int i, int j) {
	return data[i][j];
}
public void setData(int i, int j, double value) {
	this.data[i][j] = value;
}
public void print() {
	for (int i = 0; i < this.nline; i++) {
		for(int j = 0; j < this.ncolumn; j++) {
			System.out.print(data[i][j]);
		}
		System.out.println();
	}
}
public abstract AbstractMatrix add(AbstractMatrix M);
public abstract AbstractMatrix multiply(AbstractMatrix M);
}
