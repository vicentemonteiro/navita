package com.monteiro.navita.dao;

import org.springframework.data.repository.CrudRepository;

import com.monteiro.navita.model.Patrimonio;

/**
 *
 * @author vicente.monteiro
 */
public interface PatrimonioDAO extends CrudRepository<Patrimonio, Long> {
}
