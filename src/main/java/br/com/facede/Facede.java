package br.com.facede;

import pt.com.subsistema.CrmServ;
import py.com.subsistema.CepAPI;

public class Facede {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String uf = CepAPI.getInstancia().recuperarUf(nome);
        CrmServ.gravarCliente(nome,cep,uf, cidade);
    }
}
