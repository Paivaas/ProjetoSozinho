package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionalidades extends Cachorro{

    Scanner scanner = new Scanner(System.in);

    public void CadastroCachorro() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.print("Nome: ");
        super.nome = scanner.nextLine();
        System.out.print("Raça: ");
        super.raca = scanner.nextLine();
        System.out.print("Porte: ");
        super.porte = scanner.nextLine();
        System.out.print("Idade: ");
        super.idade = scanner.nextInt();
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }


    List<Cachorro> listaCachorros = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }
    public void setPorte(String porte) {this.porte = porte;}
    public String getPorte(){ return porte; }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade(){ return idade;}

    public void adicionarLista(Cachorro cachorro){
        listaCachorros.add(cachorro);
    }

    public void ListaCachorros(){
        for(Cachorro cachorro : listaCachorros){
            System.out.println("Nome: "+cachorro.getNome());
            System.out.println("Raça: "+cachorro.getRaca());
            System.out.println("Porte: "+cachorro.getPorte());
            System.out.println("Idade: "+cachorro.getIdade());
            System.out.println(" ");
        }
    }





}
