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

package net.betaville.opendata.domain;

/**
 * DOCME
 * 
 * @author Andre Koenig (andre.koenig@gmail.com)
 *
 */
public class ElectricityConsumption {

	private String zip = null;
	private String lat = null;
	private String lng = null;
	private float commercial = 0.0f;
	private float industrial = 0.0f;
	private float institutional = 0.0f;
	private float residential = 0.0f;

	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 * DOCME
	 *
	 * @param zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getLat() {
		return this.lat;
	}

	/**
	 * DOCME
	 *
	 * @param lat
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}

	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getLng() {
		return this.lng;
	}

	/**
	 * DOCME
	 *
	 * @param lng
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}

	/**
	 * DOCME
	 * 
	 * @return
	 */
	public float getCommercial() {
		return this.commercial;
	}

	/**
	 * DOCME
	 *
	 * @param commercial
	 */
	public void setCommercial(float commercial) {
		this.commercial = commercial;
	}

	/**
	 * DOCME
	 *
	 * @return
	 */
	public float getIndustrial() {
		return this.industrial;
	}

	/**
	 * DOCME
	 *
	 * @param industrial
	 */
	public void setIndustrial(float industrial) {
		this.industrial = industrial;
	}
	
	/**
	 * DOCME
	 *
	 * @return
	 */
	public float getInstitutional() {
		return this.institutional;
	}
	
	/**
	 * DOCME
	 *
	 * @param institutional
	 */
	public void setInstitutional(float institutional) {
		this.institutional = institutional;
	}
	
	/**
	 * DOCME
	 *
	 * @return
	 */
	public float getResidential() {
		return this.residential;
	}
	
	/**
	 * DOCME
	 *
	 * @param residential
	 */
	public void setResidential(float residential) {
		this.residential = residential;
	}
	
	/**
	 * DOCME
	 *
	 */
	@Override
	public String toString() {
		return "ElectricityConsumption [zip=" + zip + ", commercial="
				+ commercial + ", industrial=" + industrial
				+ ", institutional=" + institutional + ", residential="
				+ residential + "]";
	}
}