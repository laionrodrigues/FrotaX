package modelo;

import util.Validador;
import util.VerificarString;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private static final int IDADE_MINIMA = 21;
    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String cpf;
    private String cnh;

    public Cliente(String nome, String sobrenome, LocalDate dataNascimento, String cpf, String cnh) {
        setNome(nome);
        setSobrenome(sobrenome);
        setDataNascimento(dataNascimento);
        setCpf(cpf);
        setCnh(cnh);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = VerificarString.formatarString(nome.strip());
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome == null || sobrenome.isBlank()) {
            throw new IllegalArgumentException("Sobrenome inválido.");
        }
        this.sobrenome = VerificarString.formatarString(sobrenome.strip());
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDataNascimentoFormatada() {
        return dataNascimento.format(FORMATO_DATA);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null) {
            throw new IllegalArgumentException("Data de nascimento inválida.");
        }
        if (Period.between(dataNascimento, LocalDate.now()).getYears() < IDADE_MINIMA) {
            throw new IllegalArgumentException("O cliente deve ter pelo menos " + IDADE_MINIMA + " anos.");
        }
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!Validador.validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido!");
        }

        this.cpf = cpf.replace(".", "").replace("-", "");
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        if (!Validador.validarCNH(cnh)) {
            throw new IllegalArgumentException("CNH inválida!");
        }

        this.cnh = cnh;
    }



    @Override
    public String toString() {
        return "ID: " + id
                + "\nNOME: " + getNomeCompleto()
                + "\nNASCIMENTO: " + getDataNascimentoFormatada()
                + "\nCPF: " + cpf;
    }
}