package model.services;

import java.util.List;

import entidades.Funcionario;

public interface Busca {
	
	default Integer posicao(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if ( list.get(i).getMatricula() == id) {
				return i;
			}

		}
		return null;
	}

}
