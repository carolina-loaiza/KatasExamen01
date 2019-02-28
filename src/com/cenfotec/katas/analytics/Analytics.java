package com.cenfotec.katas.analytics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Analytics {
	
	public static String[] masLarga(String palabras) throws Exception {
		List<String> listaPalabras = new ArrayList<String>();
		String[] result = new String[palabras.split(",").length];
		
		try {
			listaPalabras = Arrays.asList(palabras.split(","));
			for (int i = 0; i < listaPalabras.size(); i++) {
				String palabra = listaPalabras.get(i);
				int next = i+1;
				String palabraNext = result[0] != null ? result[0] : listaPalabras.get(next);

				if (palabra.length() <  palabraNext.length()) {
					if (isNotValue(result, palabraNext))
							result[i] = palabraNext;
				} else {
					if (isNotValue(result, palabra))
							result[i] = palabra;
				}
			}
		} catch (Exception e) {
			throw new Exception("Error" + e);
		}
	
		return result;
	}
	
	public static Boolean isNotValue(String[] result, String value) {
		for (String elem : result) {
			if (elem == value) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean removeNull(String[] result, String value) {
		for (String elem : result) {
			if (elem == value) {
				return false;
			}
		}
		return true;
	}
	
	public static String[] masCorta(String palabras) throws Exception {
		List<String> listaPalabras = new ArrayList<String>();
		String[] result = new String[palabras.split(",").length];
		
		try {
			listaPalabras = Arrays.asList(palabras.split(","));
			for (int i = 0; i < listaPalabras.size(); i++) {
				String palabra = listaPalabras.get(i);
				int next = i+1;
				String palabraNext = listaPalabras.size() > next ? listaPalabras.get(next) : result[0];

				if (palabra.length() <= palabraNext.length()) {
					if (isNotValue(result, palabra))
							if (result[0] == null)
								result[0] = palabra;
							else
								result[i] = palabra;
				}
			}
		} catch (Exception e) {
			throw new Exception("Error" + e);
		}
	
		return result;
	}
	
	
}
