package com.santana.java.back.end.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO	{
    @NotBlank(message = "Campo obrigatorio")
    private	String nome;
    @NotBlank(message = "Campo obrigatorio")
    private	String cpf;
    private	String endereco;
    @NotBlank(message = "Campo obrigatorio")
    private	String email;
    private	String telefone;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataCadastro;
}
