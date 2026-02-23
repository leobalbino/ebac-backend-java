package br.com.leo.list;

import br.com.leo.domain.Aluno;
import br.com.leo.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {

    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
//        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Leonardo Balbino", "Linux basico", 0);
        Aluno b = new Aluno("Henrique Balbino", "OpenOffice", 0);
        Aluno c = new Aluno("Ingrid Santos Silva", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("****** exemploListaSimplesOrdenadaComparatorAluno ******");

        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Leonardo Balbino", "Linux basico", 20);
        Aluno b = new Aluno("Henrique Balbino", "OpenOffice", 30);
        Aluno c = new Aluno("Ingrid Santos Silva", "Internet", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        System.out.println("");

        System.out.println("Lista sem ordenacao" + lista);
        System.out.println("Lista com ordenacao" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();

        System.out.println("Lista com ordenacao por nota" + lista);

        System.out.println("");

    }
}
