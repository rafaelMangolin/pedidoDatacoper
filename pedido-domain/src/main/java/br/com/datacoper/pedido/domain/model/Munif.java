/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.datacoper.pedido.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Fábio
 */
@Entity
public class Munif {
    
    @Id
    private Long id;
    
    private String nome;
}
