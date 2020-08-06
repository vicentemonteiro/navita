package com.monteiro.navita.controller;

import java.util.Collection;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monteiro.navita.dao.UsuarioDAO;
import com.monteiro.navita.model.Usuario;

/**
 *
 * @author vicente.monteiro
 */
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@RequestMapping(value = "publica/usuario", method = RequestMethod.POST)
	public Usuario save(@RequestBody final Usuario request) {
		return this.usuarioDAO.save(request);
	}

	@RequestMapping(value = "privada/usuario", method = RequestMethod.GET)
	public Usuario view(@RequestParam final String id) {
		return this.usuarioDAO.findById(Long.parseLong(id)).get();
	}

	@RequestMapping(value = "privada/usuario", method = RequestMethod.DELETE)
	public void delete(@RequestParam final String id) {
		this.usuarioDAO.deleteById(Long.parseLong(id));
	}

	@RequestMapping(value = "privada/usuario/lista", method = RequestMethod.GET)
	public Collection<Usuario> viewAll() {
		return IteratorUtils.toList(this.usuarioDAO.findAll().iterator());
	}
}
