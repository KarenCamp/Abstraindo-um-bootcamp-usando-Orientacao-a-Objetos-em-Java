package br.com.dio.desafio.dominio;

import static br.com.dio.desafio.dominio.Bootcamp.definirPadraoData;
import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public String getData() {
        return definirPadraoData(data);
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo: '" + getTitulo() + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", data: " + getData() + '\'' +
                 ", instrutor: '" + getInstrutor() + '\n' +
                '}';
    }
}
