package org.java.array;

public class Array5 {

	public static void main(String[] args) {
		System.out.println("����");
		
		int [][] score= {
				{100, 66, 77},
				{88, 66, 88},
				{80, 46, 97},
				{70, 88, 80},
				{100, 90, 88}
		};
		int kor=0;
		int math=0;
		int eng=0;
		int ssum=0;
		double avg=0.0;
		int scoreLength = score.length; //�迭�� ����
		
		System.out.println("�߰����� ����ǥ");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("=============================================");
		
		for (int i=0; i<scoreLength; i++) {
			int sum=0;
			System.out.print((i+0)+ "\t");
			
			kor += score[i][0];
			math += score[i][1];
			eng += score[i][2];
			
			for (int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				ssum += score[i][j];
			}
			avg=Math.round((double) sum / score[i].length);
			System.out.println(sum + "\t" + avg);
		}
		
		System.out.println("=============================================");
		System.out.println("���� \t" + kor + "\t" + math + "\t" + eng + "\t" + ssum);
		
		
		
	}
}