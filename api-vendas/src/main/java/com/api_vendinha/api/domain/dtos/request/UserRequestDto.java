package com.api_vendinha.api.domain.dtos.request;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para representar os dados necessários para criar ou atualizar um usuário.
 */
@Data // Gera automaticamente métodos getters, setters, toString, equals e hashCode.
@NoArgsConstructor // Gera um construtor sem argumentos, necessário para a criação de instâncias pelo JPA e outras operações.
public class UserRequestDto {

    /**
     * Nome do usuário.
     *
     * Este campo é obrigatório e será utilizado para criar ou atualizar um usuário no sistema.
     */
    private String name;
    private String email;
    private String password;
    private Integer cpf_cnpj;

    public Integer getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(Integer cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
