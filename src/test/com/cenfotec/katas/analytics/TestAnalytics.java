package test.com.cenfotec.katas.analytics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cenfotec.katas.analytics.Analytics;

class TestAnalytics {

	@Test
	public void masLargaTest() throws Exception {
		String[] result = {"manzana"};
		String[] test = Analytics.masLarga("manzana,mala,pelota,hola,caro");
		
		assertEquals(result[0], test[0], "*Should be [manzana]");
	}

}
