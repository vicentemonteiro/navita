package com.monteiro.navita.dao;

import org.springframework.data.repository.CrudRepository;

import com.monteiro.navita.model.Marca;

/**
 *
 * @author vicente.monteiro
 */
public interface MarcaDAO extends CrudRepository<Marca, Long> {
}
