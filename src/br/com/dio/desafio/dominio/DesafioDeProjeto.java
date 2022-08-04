package br.com.dio.desafio.dominio;

public class DesafioDeProjeto extends Conteudo {
    
    private int cargaHoraria;
    private String nivel;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Desafio de Projeto{" +
                "titulo: '" + getTitulo() + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", cargaHoraria: " + cargaHoraria + " hora(s)" + '\'' +
                 ", instrutor: '" + getInstrutor() + '\'' +
                ", nivel: '" + getNivel() + '\n' +
                '}';
    }
}
