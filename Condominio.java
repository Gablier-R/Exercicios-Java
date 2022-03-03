/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import dao.ApartamentoDao;
import dao.EdificioDao;
import dao.PessoaDao;
import java.util.Scanner;
import modelo.Apartamento;
import modelo.Edificio;
import modelo.Pessoa;



/**
 *
 * @author User
 */
public class Condominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EdificioDao edificiodao = new EdificioDao();
        Edificio edificio = new Edificio();
        
        ApartamentoDao apartamentodao = new ApartamentoDao();
        Apartamento apartamento = new Apartamento();
        
        PessoaDao pessoadao = new PessoaDao();
        Pessoa pessoa = new Pessoa();
        
        
        
        System.err.println("Inicializando a aplicação...");
        
        
//Usando Scanner para dar valores ao Edificio

        System.err.println("Valores do Edificio");
   
        System.out.println("Digite a data de construção:");
        Scanner b = new Scanner(System.in);
        String dateConstrucao = b.nextLine();
        
        System.out.println("Digite a data de vistoria:");
        Scanner c = new Scanner(System.in);
        String dataVistoria = c.nextLine();
        
        
        System.out.println("Digite o endereço do edificio:");
        Scanner a = new Scanner(System.in);
        String endereco = a.nextLine();

        //Setando valores no Banco
        edificio.setDataConstrucao(dateConstrucao);
        edificio.setEndereco(endereco);
        edificio.setDataVistoria(dataVistoria);
        
        
        
        
//Usando Scanner para dar valores ao Apartamento
        System.err.print("Valores do Apartamento");
   
        System.out.println("Digite a Area do Apartamento:");
        Scanner e = new Scanner(System.in);
        String area = e.nextLine();
        
        System.out.println("Digite o nome do Proprietario:");
        Scanner f = new Scanner(System.in);
        String proprietario = f.nextLine();
        
        //Setando valores no Banco
        apartamento.setArea(area);
        apartamento.setProprietario(proprietario);

        
        
        
                
//Usando Scanner para dar valores ao Pessoa
        System.err.print("Valores da Pessoa");
   
        System.out.println("Digite o nome do Proprietario:");
        Scanner g = new Scanner(System.in);
        String nome = g.nextLine();
        
        System.out.println("Digite o Sexo do proprietario:");
        Scanner h = new Scanner(System.in);
        String sexo = h.nextLine();
        
        System.out.println("Digite a Data de nascimento do proprietario:");
        Scanner i = new Scanner(System.in);
        String dataNascimento = i.nextLine();
        
        
        //Setando valores no Banco
        pessoa.setNome(nome);
        pessoa.setSexo(sexo);
        pessoa.setDataNascimento(dataNascimento);

        
        
//Persistindo no Banco
        pessoadao.persist(pessoa);
        edificiodao.persist(edificio);
        apartamentodao.persist(apartamento);
        
        System.err.println("Finalizando a aplicação...");
    }
    
}
