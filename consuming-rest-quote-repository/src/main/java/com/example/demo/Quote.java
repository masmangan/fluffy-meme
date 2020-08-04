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
public class Quote {

	/**
	 * 
	 */
	private String type;
	
	/**
	 * 
	 */
	private Value value;

	/**
	 * 
	 */
	public Quote() {
	}

	/**
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(Value value) {
		this.value = value;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Quote{" + "type='" + type + '\'' + ", value=" + value + '}';
	}
}