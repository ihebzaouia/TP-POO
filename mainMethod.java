import java.util.*;
public class test {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter les demonsions de la premier matrice");
	int x,y;
	double v;
	x=sc.nextInt();
	y=sc.nextInt();
	Matrix m=new Matrix(x,y);
	System.out.println("enter les demonsions de la deuxieme matrice");
	x=sc.nextInt();
	y=sc.nextInt();
	Matrix l=new Matrix(x,y);
	System.out.println("enter les valeur de la premier matrice");
	for(int i=0;i<m.getNline();i++) {
	for(int j=0;j<m.getNcolumn();j++) {
		v=sc.nextDouble();
		m.setData(i, j, v);
	}}
	System.out.println("enter les valeur de la deuxieme matrice");
	for(int c=0;c<l.getNline();c++) {
		for(int k=0;k<l.getNcolumn();k++) {
			v=sc.nextDouble();
			l.setData(c, k, v);
		}
}
m.print();
l.print();
m.add(l).print();
m.multiply(l).print();
}
	}


	
