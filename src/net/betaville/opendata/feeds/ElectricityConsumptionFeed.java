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

package net.betaville.opendata.feeds;

import java.io.BufferedReader;
import java.lang.reflect.Type;
import java.util.Vector;

import net.betaville.opendata.domain.ElectricityConsumption;
import net.betaville.opendata.exceptions.OpenDataApiException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * DOCME
 * 
 * @author Andr� K�nig (andre.koeniig@gmail.com)
 *
 */
public class ElectricityConsumptionFeed extends AbstractFeed {

	// DOCME
	private static final String ELECTRICITY_CONSUMPTION_API_ENDPOINT = "http://nycopendata.jit.su/feed/53?betaville=true";
	
	// DOCME
	private static volatile ElectricityConsumptionFeed instance = null;
	
	// DOCME
	private ElectricityConsumptionFeed() {}
	
	/**
	 * DOCME
	 * 
	 * @return
	 */
	public static ElectricityConsumptionFeed getInstance() {
		if (instance == null) {
			synchronized (ElectricityConsumptionFeed .class) {
				if (instance == null) {
					instance = new ElectricityConsumptionFeed();
				}
			}
		}
		
		return instance;
	}

	/**
	 * DOCME
	 *
	 * @return
	 * @throws OpenDataApiException 
	 */
	public Vector<ElectricityConsumption> findAll() throws OpenDataApiException {
		BufferedReader response = this.doGet(ELECTRICITY_CONSUMPTION_API_ENDPOINT);

		Gson gson = new Gson();

		Type collectionType = new TypeToken<Vector<ElectricityConsumption>>(){}.getType();
		Vector<ElectricityConsumption> eConsumptions = gson.fromJson(response, collectionType);

		return eConsumptions;
	}
}
