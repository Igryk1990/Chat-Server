package helllodate;

import java.util.Scanner;

public class Converter {
	
	public static void convert (int rub, double convD, double convE){
		double dollars = rub/convD;
		double euro = rub/convE;
		System.out.println("���������� ��������: "+dollars);
		System.out.println("���������� ����: "+euro);
	}

	public static void main(String[] args) {
		System.out.println("������� ���������� ������");
		Scanner scanR = new Scanner(System.in);
		int rub = scanR.nextInt();
		System.out.println("������� ���� ������� ($/RUB)");
		Scanner scanD = new Scanner(System.in);
		double dollars = scanD.nextDouble();
		System.out.println("������� ���� ���� (EUR/RUB)");
		Scanner scanE = new Scanner(System.in);
		double euro = scanE.nextDouble();
		convert(rub, dollars, euro);
		

	}

}
