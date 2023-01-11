package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void display(String a[]) {
		
		String res = "";
		
//		for(int i=0; i<a.length; i++) {
//			res += a[i] + ", ";
//		}
//		
		for(String str : a) {
			res += str + ", ";
		}
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 원소값\n\n" + res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
		
		display(str);

	}

}
