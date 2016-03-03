package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/MileToKm")
public class MileToKm {
	@GET
	@Produces("application/xml")
	public String MToKm(){
		 
		Double mile = 0.0;
		Double km;
		
		km = mile*1.60;
		
		String result="Output: Mile to Kilometer \n\n" + km;
		return "<mileoutput>" + "<mile>" + mile + "</mile>" + "<output>" + result + "</output>" + "</mileoutput>";
		
	}
		@Path("{m}")
		@GET
		@Produces("application/xml")
		
		public String HeightConvert(@PathParam("m") Double mile) {
			Double km;
			
			km = mile*1.60;
			
			String result="Output: Mile to Kilometer \n\n" + km;
			return "<mileoutput>" + "<mile>" + mile + "</mile>" + "<output>" + result + "</output>" + "</mileoutput>";
				
		}

}

