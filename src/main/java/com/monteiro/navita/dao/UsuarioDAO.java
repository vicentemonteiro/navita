package com.monteiro.navita.dao;

import org.springframework.data.repository.CrudRepository;

import com.monteiro.navita.model.Usuario;

/**
 *
 * @author vicente.monteiro
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
}
