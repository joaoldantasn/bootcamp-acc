package sef.module4.activity;

import java.text.SimpleDateFormat;
import  java.util.Date;

public class DateActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		System.out.println(d);
		
		// Formatando a exibição da data
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    System.out.println(dateFormat.format(d));

//	    String strDate= dateFormat.format(d);   
//	    System.out.println(strDate);
	}

}
