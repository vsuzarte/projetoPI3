/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aztec.koob.mock;

import java.util.ArrayList;
import com.aztec.koob.model.Produto;
import com.aztec.koob.model.ItemVenda;

/**
 *
 * @author gabriel.sleal1
 */
public class MockVenda {

    public static ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
    public static ArrayList<ItemVenda> listaDeItemVenda = new ArrayList<ItemVenda>();

    public static double calcularValor() {
        double valor = 0;
        for (int i = 0; i < listaDeItemVenda.size(); i++) {
            valor += listaDeItemVenda.get(i).getValor();
        }
        return valor;
    }

}
