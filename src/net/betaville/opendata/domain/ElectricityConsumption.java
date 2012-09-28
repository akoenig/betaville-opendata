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
 * @author André König (andre.koeniig@gmail.com)
 *
 */
public class ElectricityConsumption {

	private String zip = null;
	private String commercial = null;
	private String industrial = null;
	private String institutional = null;
	private String residential = null;

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
	public String getCommercial() {
		return this.commercial;
	}

	/**
	 * DOCME
	 *
	 * @param commercial
	 */
	public void setCommercial(String commercial) {
		this.commercial = commercial;
	}

	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getIndustrial() {
		return this.industrial;
	}

	/**
	 * DOCME
	 *
	 * @param industrial
	 */
	public void setIndustrial(String industrial) {
		this.industrial = industrial;
	}
	
	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getInstitutional() {
		return this.institutional;
	}
	
	/**
	 * DOCME
	 *
	 * @param institutional
	 */
	public void setInstitutional(String institutional) {
		this.institutional = institutional;
	}
	
	/**
	 * DOCME
	 *
	 * @return
	 */
	public String getResidential() {
		return this.residential;
	}
	
	/**
	 * DOCME
	 *
	 * @param residential
	 */
	public void setResidential(String residential) {
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