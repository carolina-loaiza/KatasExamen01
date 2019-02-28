package com.cenfotec.katas.analytics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Analytics {
	
	public static String[] masLarga(String palabras) throws Exception {
		List<String> listaPalabras = new ArrayList<String>();
		String[] result = new String[0];
		
		try {
			listaPalabras = Arrays.asList(palabras.split(","));
			for (Iterator i = listaPalabras.iterator(); i.hasNext();) {
				String palabra = i.toString();
				String palabraNext = (String) i.next();
				if (palabra.length() >  palabraNext.length()) {
					result[0] = palabra;
				} else {
					result[0] = palabraNext;
				}
			}
		} catch (Exception e) {
			throw new Exception("Error" + e);
		}
	
		return result;
	}
}
