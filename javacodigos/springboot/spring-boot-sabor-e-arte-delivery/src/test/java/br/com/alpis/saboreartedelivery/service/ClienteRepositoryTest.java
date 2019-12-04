package br.com.alpis.saboreartedelivery.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.alpis.saboreartedelivery.domain.Cliente;
import br.com.alpis.saboreartedelivery.repository.ClienteRepository;
 
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteRepositoryTest {

	@Autowired
	ClienteRepository repository;

	@Test
	public void buscaClientesCadastrados() {

		Page<Cliente> clientes = this.repository.findAll(new PageRequest(0, 10));
		assertThat(clientes.getTotalElements()).isGreaterThan(1L);
	}

	@Test
	public void buscaClienteAlan() {
		
		Cliente clienteNaoEncontrado = this.repository.findByNome("Alan");
		assertThat(clienteNaoEncontrado).isNull();

		Cliente cliente = this.repository.findByNome("Alan Santos");
		assertThat(cliente).isNotNull();
		assertThat(cliente.getNome()).isEqualTo("Alan Santos");
		assertThat(cliente.getEndereco()).isEqualTo("Salvador");
		
	}
 
}