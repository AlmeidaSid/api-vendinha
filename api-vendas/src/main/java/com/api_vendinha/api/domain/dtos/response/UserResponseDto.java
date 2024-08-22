package com.api_vendinha.api.domain.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponseDto {
    private Long id;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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