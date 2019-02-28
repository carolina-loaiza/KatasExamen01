package test.com.cenfotec.katas.analytics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cenfotec.katas.analytics.Analytics;

class TestAnalytics {

	@Test
	public void masLargaTest() throws Exception {
		String[] result1 = {"manzana"};
		String[] test1 = Analytics.masLarga("manzana,mala,pelota,hola,caro");
		
		assertEquals(result1[0], test1[0], "*Should be [manzana]");
		
		String[] result2 = {"manzana", "corazon"};
		String[] test2 = Analytics.masLarga("manzana,corazon,mala,pelota,hola,caro");
		
		assertEquals(result2[1], test2[1], "*Should be [corazon]");
	}
	
	@Test
	public void masCortaTest() throws Exception {
		String[] result1 = {"mala"};
		String[] test1 = Analytics.masCorta("manzana,mala,pelota");
		
		assertEquals(result1[0], test1[0], "*Should be [mala]");
	}

}
