package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    boolean continuar = true;

    Scanner scanner = new Scanner(System.in);
    Funcionalidades funcionalidades = new Funcionalidades();
    public void menu(){

        while(continuar) {

            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("     CAMPANHA DE ADOÇÃO");
            System.out.println("");
            System.out.println("[1] Cadastrar um cachorro");
            System.out.println("[2] Ver cachorros para adoção");
            int escolhaMenu = scanner.nextInt();
            scanner.nextLine();

            if(escolhaMenu == 1){

                funcionalidades.CadastroCachorro();

            }else if(escolhaMenu == 2){

                funcionalidades.ListaCachorros();

            }else{
                continuar= false;
            }

        }



    }


}
