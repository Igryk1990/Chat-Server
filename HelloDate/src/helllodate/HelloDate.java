package helllodate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloDate {
	public static void calculator (int a, int b){
		int x1 = a+b;
		int x2 = a-b;
		int x3 = a*b;
		double x4 = (double)a/b; 
		System.out.println("����� "+x1);
		System.out.println("�������� "+x2);
		System.out.println("������������ "+x3);
		System.out.println("������� "+x4);
	}
	
	public static void main (String[] args){
		System.out.println("������� ������ ������������� ����� ");
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		String in1=null;
		int a=0;
		
			try {
				in1 = reader1.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			a = Integer.parseInt(in1);
		
		System.out.println("������� ������ ������������� ����� ");
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
		String in2=null;
		try {
			in2 = reader2.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int b = Integer.parseInt(in2);
	    calculator(a,b);
	}
}
