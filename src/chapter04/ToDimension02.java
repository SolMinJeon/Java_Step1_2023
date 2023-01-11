package chapter04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ToDimension02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int JavaScore[][] = new int[2][3];
		for(int i=0; i<JavaScore.length; i++) {
			for(int j=0; j<JavaScore[i].length; j++) {
				JavaScore[i][j] = sc.nextInt();
				//JavaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("점수"));
			}
		}
		
		for(int i=0; i<JavaScore.length; i++) {
			for(int j=0; j<JavaScore[i].length; j++) {
				System.out.print(JavaScore[i][j] + " ");
			}
			System.out.println();
		}

	}

}
