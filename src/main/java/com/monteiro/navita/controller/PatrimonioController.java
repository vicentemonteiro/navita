package com.monteiro.navita.controller;

import java.util.Collection;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monteiro.navita.dao.PatrimonioDAO;
import com.monteiro.navita.model.Patrimonio;

/**
 *
 * @author vicente.monteiro
 */
@RestController
@RequestMapping("privada/patrimonio")
public class PatrimonioController {

    @Autowired
    PatrimonioDAO patrimonioDAO;

    @RequestMapping(method = RequestMethod.POST)
    public Patrimonio save(@RequestBody final Patrimonio request) {
        return this.patrimonioDAO.save(request);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Patrimonio view(@RequestParam final String id) {
        return this.patrimonioDAO.findById(Long.parseLong(id)).get();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestParam final String id) {
        this.patrimonioDAO.deleteById(Long.parseLong(id));
    }

    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public Collection<Patrimonio> viewAll() {
        return IteratorUtils.toList(this.patrimonioDAO.findAll().iterator());
    }

  
}
