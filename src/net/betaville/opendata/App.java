/* Copyright (c) 2008-2012, Brooklyn eXperimental Media Center
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Brooklyn eXperimental Media Center nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Brooklyn eXperimental Media Center BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.betaville.opendata;

import java.util.Vector;

import net.betaville.opendata.domain.ElectricityConsumption;
import net.betaville.opendata.domain.OilBoilerFacility;
import net.betaville.opendata.exceptions.OpenDataApiException;
import net.betaville.opendata.feeds.ElectricityConsumptionFeed;
import net.betaville.opendata.feeds.OilBoilerFeed;

/**
 * DOCME
 * 
 * @author AndrŽ Kšnig (andre.koeniig@gmail.com)
 *
 */
public class App {

	public static void main(String args[]) {
		try {
			System.out.println("=> Grabing the 'Oil Boiler Facility' data");

			Vector<OilBoilerFacility> facilities = OilBoilerFeed.getInstance().findAll();
			
			int i = 0;
			for (OilBoilerFacility facility : facilities) {
				i++;
				System.out.println(facility.toString());
			}
			System.out.println("COUNT " + i);
			
			System.out.println("=> Grabing the 'Electricity Consumption' data");

			Vector<ElectricityConsumption> consumptions = ElectricityConsumptionFeed.getInstance().findAll();
			
			i = 0;
			
			for (ElectricityConsumption consumption : consumptions) {
				i++;
				System.out.println(consumption.toString());
			}
			
			System.out.println("COUNT " + i);
			
		} catch (OpenDataApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
