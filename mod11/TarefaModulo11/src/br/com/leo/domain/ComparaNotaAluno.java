package br.com.leo.domain;

public class ComparaNotaAluno implements Comparable<Aluno> {


    public int compareTo(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }

    @Override
    public int compareTo(Aluno o) {
        return 0;
    }
}
