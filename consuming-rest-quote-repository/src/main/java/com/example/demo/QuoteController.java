// Copyright (c) 2020, the REST Quote Repository project authors.  Please see
// the AUTHORS file for details. All rights reserved. Use of this source code
// is governed by a BSD-style license that can be found in the LICENSE file.

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
@Controller
public class QuoteController {

	/**
	 * 
	 */
	@Autowired
	QuoteRepository quotes;
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/quote")
	public String getRandomQuote(Model model) {
		Quote q = quotes.findQuote();
		model.addAttribute("quote", q);
		return "quoteDetails";
	}
}
