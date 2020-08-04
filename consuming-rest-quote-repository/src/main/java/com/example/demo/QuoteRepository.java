// Copyright (c) 2020, the REST Quote Repository project authors.  Please see
// the AUTHORS file for details. All rights reserved. Use of this source code
// is governed by a BSD-style license that can be found in the LICENSE file.

package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
@Repository
public class QuoteRepository {

	/**
	 * 
	 */
	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	/**
	 * 
	 */
	@Autowired
	RestTemplate restTemplate;

	/**
	 * 
	 * @return
	 */
	public Quote findQuote() {
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
		return quote;
	}
}
