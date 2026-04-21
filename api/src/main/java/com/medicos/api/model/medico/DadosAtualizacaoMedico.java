package com.medicos.api.model.medico;

import com.medicos.api.model.endereco.DadosCadastroEndereco;

// Classe responsável por receber os dados de atualização do médico, utilizando o recurso record.
// DadosCadastroEndereco é um DTO, então como o endereço pode ser alterado em qualquer campo,
// estamos reusando (reuso) para a alteração do médico.
public record DadosAtualizacaoMedico(Integer id, String nome, String email, DadosCadastroEndereco endereco) {
    
}
