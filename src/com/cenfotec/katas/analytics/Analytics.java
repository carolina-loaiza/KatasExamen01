package com.cenfotec.katas.analytics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Analytics {
	
	public static String[] masLarga(String palabras) throws Exception {
		List<String> listaPalabras = new ArrayList<String>();
		String[] result = new String[5];
		
		try {
			listaPalabras = Arrays.asList(palabras.split(","));
			for (int i = 0; i < listaPalabras.size(); i++) {
				String palabra = listaPalabras.get(i);
				int next = i+1;
				String palabraNext = result[0] != null ? result[0] : listaPalabras.get(next);
				
				System.out.println(palabra + " -- " +palabraNext);
				if (palabra.length() <  palabraNext.length()) {
					result[0] = palabraNext;
				} else {
					result[0] = palabra;
				}
			}
		} catch (Exception e) {
			throw new Exception("Error" + e);
		}
	
		return result;
	}
}
