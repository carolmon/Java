package br.com.magnasistemas.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import br.com.magnasistemas.aerodino.Aviao;
import br.com.magnasistemas.aerodino.DroneAsaFixa;
import br.com.magnasistemas.aerodino.DroneAsaRotativa;
import br.com.magnasistemas.aerodino.Helicoptero;
import br.com.magnasistemas.aerodino.Hibrido;
import br.com.magnasistemas.aerodino.MotoPlanador;
import br.com.magnasistemas.aerodino.Planador;
import br.com.magnasistemas.aerostatos.Balao;
import br.com.magnasistemas.aerostatos.Dirigivel;
import br.com.magnasistemas.arquivos.Entrada;
import br.com.magnasistemas.arquivos.Saida;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.Rigidez;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class CriaAeronave {

//	@Test
//	public void testeAviao(){
//		Aviao testeAviao = new Aviao.Builder().combustivel(Combustivel.GASOLINA).funcao("comercial").impulsdor("pistão").nome("jorginho").
//				porte("grande").quantidadeDeAsas(2).quantidadeDeMotores(3).build();
//				testeAviao.resultados();
//				System.out.println("Avião 1 " + testeAviao.resultados());
//		assertNotEquals(testeAviao, null);
//	}
//	@Test
//	public void testeDroneAsaFixa() {
//		DroneAsaFixa testeDroneAsaFixa = new DroneAsaFixa.Builder().quantidadeDeAsas(1).quantidadeDeMotores(1).build();
//		testeDroneAsaFixa.setNome("jorginho 2");
//		testeDroneAsaFixa.resultados();
//		System.out.println("Drone Asa Fixa " + testeDroneAsaFixa.resultados());
//		assertNotEquals(testeDroneAsaFixa, null);
//	}
//	@Test
//	public void testeDroneAsaRotativa() {
//		DroneAsaRotativa testeDroneAsaRotativa = new DroneAsaRotativa.Builder().quantidadeDeMotores(1).build();
//		testeDroneAsaRotativa.setNome("jorginho 3");
//		testeDroneAsaRotativa.resultados();
//		System.out.println("Drone Asa Rotativa " + testeDroneAsaRotativa.resultados());
//		assertNotEquals(testeDroneAsaRotativa, null);
//	}
//	@Test
//	public void testeHelicoptero() {
//		Helicoptero testeHelicoptero = new Helicoptero.Builder().quantidadeDeMotores(2).build();
//		testeHelicoptero.setNome("jorginho 3");
//		testeHelicoptero.resultados();
//		System.out.println("Helicoptero " + testeHelicoptero.resultados());
//		assertNotEquals(testeHelicoptero, null);
//	}
//	@Test
//	public void testeHibrido() {
//		Hibrido testeHibrido = new Hibrido.Builder().quantidadeDeAsas(1).quantidadeDeMotores(1).build();
//		testeHibrido.setNome("jorginho 3");
//		testeHibrido.resultados();
//		System.out.println("Hibrido " + testeHibrido.resultados());
//		assertNotEquals(testeHibrido, null);
//	}
//	@Test
//	public void testeMotoPlanador() {
//		MotoPlanador testeMotoPlanador = new MotoPlanador.Builder().quantidadeDeAsas(1).quantidadeDeMotores(1).build();
//		testeMotoPlanador.setNome("jorginho 3");
//		testeMotoPlanador.resultados();
//		System.out.println("MotoPlanador " + testeMotoPlanador.resultados());
//		assertNotEquals(testeMotoPlanador, null);
//	}
//
//	@Test
//	public void testeDirigivel() {
//		Dirigivel testeDirigivel = new Dirigivel.Builder().combustivel(Combustivel.AR_QUENTE).rigidez(Rigidez.HIBRIDO).build();
//		testeDirigivel.setNome("jorginho 3");
//		testeDirigivel.resultados();
//		System.out.println("Balão " + testeDirigivel.resultados());
//		assertNotEquals(testeDirigivel, null);
//	}
//	@Test
//	public void testePlanador() {
//		Planador testePlanador = new Planador.Builder().quantidadeDeAsas(1).build();
//		testePlanador.setNome("jorginho 3");
//		testePlanador.resultados();
//		System.out.println("Planador " + testePlanador.resultados());
//		assertNotEquals(testePlanador, null);
//	}
//	@Test
//	public void testeArquivos() throws IOException {
//		Entrada entrada = new Entrada();
//		entrada.pegaEntradaETrataDados();
//		Saida saida = new Saida();
//		saida.escreveCsv();
//		assertNotEquals(entrada, null);
//	}
	@Test
//	public void testeBalao() {
//		Balao testeBalao = new Balao();
//		testeBalao.setNome("Balão sem builder");
//		testeBalao.setCombustivel(Combustivel.AR_QUENTE);
//		testeBalao.setPorte("medio");
//		testeBalao.setImpulsdor("dilatação");
//		testeBalao.resultados();
//		System.out.println("Balão " + testeBalao.resultados());
//		assertNotEquals(testeBalao, null);
//	}
	public static void main(String[] args) {
		
			Balao testeBalao = new Balao(Combustivel.AR_QUENTE, 
										 "Balão com constructor", 
										 "teste", 
										 "dilatação", 
										 "medio", 
										 Tripulacao.TRIPULACAOUNICA, 
										 OutrosComponentes.CESTO);
			testeBalao.resultados();
			System.out.println("Balão " + testeBalao.resultados());
			Dirigivel testeDirigivel = new Dirigivel(Combustivel.HELIO, 
													 "Led Zeplin", 
													 "comercial", 
													 "dilataçaõ", 
													 "grande", 
													 Tripulacao.TRIPULACAODUPLA, 
													 OutrosComponentes.LEME, 
													 OutrosComponentes.GONDOLA,
													 Rigidez.HIBRIDO);

		
	}
}

