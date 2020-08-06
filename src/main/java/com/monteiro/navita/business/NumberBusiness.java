package com.monteiro.navita.business;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author vicente.monteiro
 */
@Service
public class NumberBusiness {

	public String maiorValor(final String valor) {

		Integer numero = null;
		try {
			numero = Integer.parseInt(valor);
			if (numero < 0) {
				throw new IllegalArgumentException();
			}
		} catch (final Exception e) {
			throw e;
		}

		final List<String> numeros = new LinkedList<String>(Arrays.asList(valor.split("(?!^)")));
		String resultado = "";

		while (!numeros.isEmpty()) {
			final String valorMaximo = Collections.max(numeros);
			resultado += valorMaximo;
			numeros.remove(valorMaximo);
		}

		numero = Integer.parseInt(resultado);
		return (numero > 100000000) ? "-1" : numero.toString();
	}

}
