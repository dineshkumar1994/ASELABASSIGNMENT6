package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/KmToMile")
public class KmToMile {
	@GET
	@Produces("application/xml")
	public String kmtom(){
		 
		Double km = 0.0;
		Double m;
		
		m = km*0.62137;
		
		String result = "Output: Kilometer to Mile \n\n" + m;
		return "<KmToM>" + "<km>" + km + "</km>" + "<mile>" + result + "</mile>" + "</KmToM>";
		
	}
		@Path("{km}")
		@GET
		@Produces("application/xml")
		
		public String WeightConvert(@PathParam("km") Double km) {
			Double m;
			m = km*0.62137;
			
			String result = "Output: Kilometer to Mile \n\n" + m;
			return "<KmToM>" + "<km>" + km + "</km>" + "<mile>" + result + "</mile>" + "</KmToM>";
			}
}

