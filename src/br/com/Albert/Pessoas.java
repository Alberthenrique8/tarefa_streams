package br.com.Albert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoas {
    private List<Pessoas> listaFinal;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String nome;
    public String sexo;
    public Pessoas(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite Seu Nome e Sexo separando por virgula");
        String nomeSexo = s.nextLine();
        String[] partes = nomeSexo.split(",");

        List<Pessoas> listaFinal = new ArrayList<>();
        for (String item : partes) {
                String[] dados = item. split("-");
                String nome = dados[0];
                String sexo = dados[1];
                Pessoas p = new Pessoas(nome, sexo);
                listaFinal.add(p);
  }
        listaFinal.stream().filter(pessoas1 -> pessoas1.getSexo().equals("M"))
                .forEach(pessoas1 -> System.out.println(pessoas1.getNome()));
 }

 }
