package com.nandodevs.bootcamp;

public class Curso extends Conteudo{

    private int cargaHoraria;

   
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    

    

}