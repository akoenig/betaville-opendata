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
public class OilBoilerFacility {

	private String id = null;
	private String address = null;
	private String city = null;
	private String state = null;
	private String zip = null;
	private String lat = null;
	private String lng = null;
	private boolean numberSixOil = false;
	private boolean multiFuel = false;
	private String boilerCapacity = null;

	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * DOCME
	 *
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * DOCME
	 *
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * DOCME
	 *
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * DOCME
	 *
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

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
	public boolean isNumberSixOil() {
		return this.numberSixOil;
	}

	/**
	 * DOCME
	 *
	 * @param numberSixOil
	 */
	public void setNumberSixOil(boolean numberSixOil) {
		this.numberSixOil = numberSixOil;
	}

	/**
	 * DOCME
	 *
	 * @return
	 */
	public boolean isMultiFuel() {
		return this.multiFuel;
	}

	/**
	 * DOCME
	 *
	 * @param multiFuel
	 */
	public void setMultiFuel(boolean multiFuel) {
		this.multiFuel = multiFuel;
	}

	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getBoilerCapacity() {
		return this.boilerCapacity;
	}

	/**
	 * DOCME
	 *
	 * @param boilerCapacity
	 */
	public void setBoilerCapacity(String boilerCapacity) {
		this.boilerCapacity = boilerCapacity;
	}

	/**
	 * DOCME
	 *
	 */
	@Override
	public String toString() {
		return "OilBoilerFacility [id=" + id + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", lat=" + lat + ", lng=" + lng + ", numberSixOil="
				+ numberSixOil + ", multiFuel=" + multiFuel
				+ ", boilerCapacity=" + boilerCapacity + "]";
	}
}