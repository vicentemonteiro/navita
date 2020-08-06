package com.monteiro.navita.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 *
 * @author vicente.monteiro
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=NumberBusiness.class, loader=AnnotationConfigContextLoader.class)
public class NumberBusinessTU {

	@Autowired
	private NumberBusiness numberBusiness;

	@Test
	public void testarAlgoritmo() {
		assertEquals("321", numberBusiness.maiorValor("213"));
		assertEquals("553", numberBusiness.maiorValor("553"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testarEntradaPositiva() {
		numberBusiness.maiorValor("-1");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testarEntradaNumerica() {
		numberBusiness.maiorValor("abc");
	}

	@Test
	public void testarLimiteSuperior() {
		assertEquals("-1", numberBusiness.maiorValor("100000001"));
	}

}
