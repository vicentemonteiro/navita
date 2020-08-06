package com.monteiro.navita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monteiro.navita.business.NumberBusiness;

/**
 *
 * @author vicente.monteiro
 */
@RestController
@RequestMapping("publica/numero")
public class NumberController {

	@Autowired
	NumberBusiness numberBusiness;

	@RequestMapping(method = RequestMethod.GET)
	public String view(@RequestParam final String valor) {

		return numberBusiness.maiorValor(valor);
	}

}
