/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 1 --> By Jefferson Itajahy
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
		
		//Adicionando dados à classe Carro
		System.out.println("Digite o modelo do Veículo:");
		c1.setModelo(entrada.next());
		
		System.out.println("Digite a cor do Veículo:");
		c1.setCor(entrada.next());
		
		System.out.println("Digite o ano do Veículo:");
		c1.setAno(entrada.nextInt());
		
		System.out.println("Digite o chassi do Veículo:");
		c1.setChassi(entrada.next());
		
		//adicionando dado à classe Marca
		System.out.println("Digite a marca do Veículo:");
		mc1.setMarca(entrada.next());
				
		//Adicionado dados da classe Proprietário
		System.out.println("===Dados do Proprietário do Veículo===");
		
		System.out.println("Digite o nome do proprietário:");
		pt1.setNome(entrada.next());
		
		System.out.println("Digite o cpf do proprietário:");
		pt1.setCpf(entrada.next());
		
		System.out.println("Digite a data de nascimento do proprietário:");
		pt1.setDataNascimento(entrada.next());
		
		//Adicionando dados à classe endereço
		System.out.println("===Endereço do Proprietário===");
		
		System.out.println("Digite a rua do proprietário:");
		end.setRua(entrada.next());
		
		System.out.println("Digite o bairro do proprietário:");
		end.setBairro(entrada.next());
		
		System.out.println("Digite a cidade do proprietário:");
		end.setCidade(entrada.next());
		
		System.out.println("Digite o estado do proprietário:");
		end.setEstado(entrada.next());
		
		System.out.println("Digite o CEP do proprietário:");
		end.setCep(entrada.next());
		
		System.out.println("Digite o complemento do proprietário:");
		end.setComplemento(entrada.next());
		
		System.out.println("Acelere digite 1 para acelerar:");
		c1.acelerar(entrada.nextInt());
		
		System.out.println("Freio digite 1 para frear:");
		c1.frear(entrada.nextInt());
		
		System.out.println("Digite a quantidade de combustível:");
		c1.setVolumeCombustivel(entrada.nextDouble());
		
		double consumoMedio;
		double distancia;
		double LitrosUsados;
	
		System.out.print("Digita a distancia da viagem: ");
		distancia = entrada.nextDouble();
		
		System.out.print("Digite o consumo medio: ");
		consumoMedio = entrada.nextDouble();
		
		LitrosUsados = distancia / consumoMedio;
		
        	//Impressão dos dados veículo
			System.out.println("\n===Imprime os dados do Veículo===\n");

			System.out.println("Modelo: " 	+ c1.getModelo());
			System.out.println("Cor: " 		+ c1.getCor());
			System.out.println("Ano: "		+ c1.getAno());
			System.out.println("Chassi: " 	+ c1.getChassi());
			System.out.println("Marca: " 	+ mc1.getMarca());
			System.out.println("Proprietário: " 	+ pt1.getNome());
			System.out.println("Velocidade Atual: " 	+ c1.getVelocidadeAtual());
			System.out.println("Volume de Combustível: " 	+ c1.getVolumeCombustivel() + " litros");
			System.out.print("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");
			
		entrada.close();
	}
}
