package com.monteiro.navita.controller;

import java.util.Collection;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monteiro.navita.dao.MarcaDAO;
import com.monteiro.navita.model.Marca;

/**
 *
 * @author vicente.monteiro
 */
@RestController
@RequestMapping("privada/marca")
public class MarcaController {

	@Autowired
	MarcaDAO marcaDAO;

	@RequestMapping(method = RequestMethod.POST)
	public Marca save(@RequestBody final Marca request) {
		return this.marcaDAO.save(request);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Marca view(@RequestParam final String id) {
		return this.marcaDAO.findById(Long.parseLong(id)).get();
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestParam final String id) {
		this.marcaDAO.deleteById(Long.parseLong(id));
	}

	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public Collection<Marca> viewAll() {
		return IteratorUtils.toList(this.marcaDAO.findAll().iterator());
	}

}
