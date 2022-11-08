package br.com.boaventura.api.business;

import java.util.Arrays;
import java.util.List;

import br.com.boaventura.api.datasource.model.PlanoTV;

public class TVBS {
	
	public static TVBS instancia;

	public PlanoTV obterPorNome(String nome) {
		List<PlanoTV> planos = Arrays.asList(PlanoTV.TOTAL,PlanoTV.MIX,PlanoTV.START);
		for (PlanoTV planoTV : planos) {
			if(planoTV.getNome().equalsIgnoreCase(nome))return planoTV;
		}
		return null;
	}

	public static TVBS getInstancia() {
		if(instancia == null) {
			instancia = new TVBS();
		}
		return instancia;
	}
}
