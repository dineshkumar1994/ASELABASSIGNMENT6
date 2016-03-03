package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestMileToKm {

	MileChecker cv = new MileChecker();
	Double vol = cv.CVol(3.0);
	Double defVol =  3.20;
	DecimalFormat f = new DecimalFormat("##.00");
	String km = f.format(vol);
	Double ccm = Double.parseDouble(km);

	
	@Test
	public void testheight() {
		System.out.println("@Test Km(): " + km + " = " + ccm);
		assertEquals(defVol, ccm);
	}


}
