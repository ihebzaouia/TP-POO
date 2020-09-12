package com.company;

public class Matrix extends AbstractMatrix {
public Matrix (int i,int j) {		//Matrix Constructor
	super(i,j); //calling the constructor of the parent class
}

public AbstractMatrix add(AbstractMatrix M) {
	Matrix x =  new Matrix(M.getNline(), M.getNcolumn());
		for(int i = 0; i < M.getNline(); i++) 
		{
			for(int j = 0; j < M.getNcolumn(); j++) 
			{
				x.setData(i, j, M.getData(i, j) + this.getData(i, j));
			}
		}
		
		return x;
	}


public AbstractMatrix multiply(AbstractMatrix M) {
	Matrix x = new Matrix(getNline(), M.getNcolumn());
	double y = 0;
	if (this.getNcolumn() == M.getNline()) 
	{
		for(int i = 0; i < getNline(); i++) 
		{
			for(int j = 0; j < M.getNcolumn(); j++) 
			{
				for(int c = 0; c < M.getNcolumn(); c++) 
				{
					y = y + (getData(i, c) * M.getData(c, j));
				}
				x.setData(i, j, y);
				y = 0;
			}
		}
		
	}
	return x;
}
}
