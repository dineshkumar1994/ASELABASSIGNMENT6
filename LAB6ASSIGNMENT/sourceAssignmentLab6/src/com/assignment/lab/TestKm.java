package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestKm {

	
	KmChecker pc = new KmChecker();
	Double ps = pc.CPer(2.0);
	Double defVol= 3.2;
	DecimalFormat f = new DecimalFormat("##.00");
	String tper = f.format(ps);
	Double cps = Double.parseDouble(tper);

	
	@Test
	public void testweight() {
		System.out.println("@Kilometer(): " + defVol + " = " + cps);
		assertEquals(defVol,cps);
	}


	
}
