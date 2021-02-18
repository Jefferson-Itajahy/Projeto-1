/*****************************************************************************************************************
* Prova T�cnica Java --> Projeto 1 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.TestaClasses;

import java.util.Scanner;

import br.com.carro.Carro;
import br.com.carro.Marca;
import br.com.proprietario.Endereco;
import br.com.proprietario.Proprietario;

public class TestaVeiculo {


	public static void main(String[] args)  {

		Scanner entrada = new Scanner(System.in);
		
		Carro c1 = new Carro();
		Marca mc1 = new Marca();
		Proprietario pt1 = new Proprietario();
		Endereco end = new Endereco();
		
		//Adicionando dados � classe Carro
		System.out.println("Digite o modelo do Ve�culo:");
		c1.setModelo(entrada.next());
		
		System.out.println("Digite a cor do Ve�culo:");
		c1.setCor(entrada.next());
		
		System.out.println("Digite o ano do Ve�culo:");
		c1.setAno(entrada.nextInt());
		
		System.out.println("Digite o chassi do Ve�culo:");
		c1.setChassi(entrada.next());
		
		//adicionando dado � classe Marca
		System.out.println("Digite a marca do Ve�culo:");
		mc1.setMarca(entrada.next());
				
		//Adicionado dados da classe Propriet�rio
		System.out.println("===Dados do Propriet�rio do Ve�culo===");
		
		System.out.println("Digite o nome do propriet�rio:");
		pt1.setNome(entrada.next());
		
		System.out.println("Digite o cpf do propriet�rio:");
		pt1.setCpf(entrada.next());
		
		System.out.println("Digite a data de nascimento do propriet�rio:");
		pt1.setDataNascimento(entrada.next());
		
		//Adicionando dados � classe endere�o
		System.out.println("===Endere�o do Propriet�rio===");
		
		System.out.println("Digite a rua do propriet�rio:");
		end.setRua(entrada.next());
		
		System.out.println("Digite o bairro do propriet�rio:");
		end.setBairro(entrada.next());
		
		System.out.println("Digite a cidade do propriet�rio:");
		end.setCidade(entrada.next());
		
		System.out.println("Digite o estado do propriet�rio:");
		end.setEstado(entrada.next());
		
		System.out.println("Digite o CEP do propriet�rio:");
		end.setCep(entrada.next());
		
		System.out.println("Digite o complemento do propriet�rio:");
		end.setComplemento(entrada.next());
		
		System.out.println("Acelere digite 1 para acelerar:");
		c1.acelerar(entrada.nextInt());
		
		System.out.println("Freio digite 1 para frear:");
		c1.frear(entrada.nextInt());
		
		System.out.println("Digite a quantidade de combust�vel:");
		c1.setVolumeCombustivel(entrada.nextDouble());
		
		double consumoMedio;
		double distancia;
		double LitrosUsados;
	
		System.out.print("Digita a distancia da viagem: ");
		distancia = entrada.nextDouble();
		
		System.out.print("Digite o consumo medio: ");
		consumoMedio = entrada.nextDouble();
		
		LitrosUsados = distancia / consumoMedio;
		
        	//Impress�o dos dados ve�culo
			System.out.println("\n===Imprime os dados do Ve�culo===\n");

			System.out.println("Modelo: " 	+ c1.getModelo());
			System.out.println("Cor: " 		+ c1.getCor());
			System.out.println("Ano: "		+ c1.getAno());
			System.out.println("Chassi: " 	+ c1.getChassi());
			System.out.println("Marca: " 	+ mc1.getMarca());
			System.out.println("Propriet�rio: " 	+ pt1.getNome());
			System.out.println("Velocidade Atual: " 	+ c1.getVelocidadeAtual());
			System.out.println("Volume de Combust�vel: " 	+ c1.getVolumeCombustivel() + " litros");
			System.out.print("Quantidade de Combust�vel utilizado: " + LitrosUsados + " litros\n");
			
		entrada.close();
	}
}
