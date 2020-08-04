// Copyright (c) 2020, the REST Quote Repository project authors.  Please see
// the AUTHORS file for details. All rights reserved. Use of this source code
// is governed by a BSD-style license that can be found in the LICENSE file.

package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	/**
	 * 
	 */
	private Long id;
	
	/**
	 * 
	 */
	private String quote;

	/**
	 * 
	 */
	public Value() {
	}

	/**
	 * 
	 * @return
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * 
	 * @return
	 */
	public String getQuote() {
		return this.quote;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @param quote
	 */
	public void setQuote(String quote) {
		this.quote = quote;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Value{" + "id=" + id + ", quote='" + quote + '\'' + '}';
	}
}