package br.com.alpis.saboreartedelivery.carga;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.alpis.saboreartedelivery.domain.Cliente;
import br.com.alpis.saboreartedelivery.domain.Item;
import br.com.alpis.saboreartedelivery.domain.Pedido;
import br.com.alpis.saboreartedelivery.repository.ClienteRepository;

@Component
public class RepositoryTest 
implements ApplicationRunner 
{

	private static final long ID_CLIENTE_ALAN = 11l;
	private static final long ID_CLIENTE_IZA = 22l;
	
	private static final long ID_ITEM1 = 100l;
	private static final long ID_ITEM2 = 101l;
	private static final long ID_ITEM3 = 102l;
	
	private static final long ID_PEDIDO1 = 1000l;
	private static final long ID_PEDIDO2 = 1001l;
	private static final long ID_PEDIDO3 = 1002l;
	
	@Autowired
    private ClienteRepository clienteRepository;
	
    @Override  
    public void run(ApplicationArguments applicationArguments) throws Exception {

    	System.out.println(">>> Iniciando carga de dados...");
    	Cliente alan = new Cliente(ID_CLIENTE_ALAN, "Alan Santos","Salvador");
    	Cliente iza = new Cliente(ID_CLIENTE_IZA,"Iza","Mar Grande");    	
    	
    	Item bolos = new Item(ID_ITEM1,"5 Bolos de Chocolate",25d);
    	Item doces = new Item(ID_ITEM2,"Brigadeiros 12 unidades ",27d);
		Item salgados = new Item(ID_ITEM3,"Empanadas 100 unidades",150d);
    	
    	List<Item> listaPedidoAlan1 = new ArrayList<Item>();
    	listaPedidoAlan1.add(bolos);

    	List<Item> listaPedidoIza1 = new ArrayList<Item>();
    	listaPedidoIza1.add(doces);
    	listaPedidoIza1.add(salgados);
    	
    	Pedido pedidoDoAlan = new Pedido(ID_PEDIDO1,alan,listaPedidoAlan1,bolos.getPreco());
    	alan.novoPedido(pedidoDoAlan);
    	
    	Pedido pedidoDaIza= new Pedido(ID_PEDIDO2,iza,listaPedidoIza1, doces.getPreco()+salgados.getPreco());
    	iza.novoPedido(pedidoDaIza);
    	
    	System.out.println(">>> Pedido 1 - Alan : "+ pedidoDoAlan);
    	System.out.println(">>> Pedido 2 - Iza: "+ pedidoDaIza);
    	
       
		clienteRepository.saveAndFlush(iza);
		System.out.println(">>> Gravado cliente 2: "+iza);

		List<Item> listaPedidoAlan2 = new ArrayList<Item>();
		listaPedidoAlan2.add(doces);
    	Pedido pedido2DoAlan  = new Pedido(ID_PEDIDO3,alan,listaPedidoAlan2,doces.getPreco());
    	alan.novoPedido(pedido2DoAlan);
    	clienteRepository.saveAndFlush(alan);
    	System.out.println(">>> Pedido 2 - Alan : "+ pedido2DoAlan);
    	System.out.println(">>> Gravado cliente 1: "+ alan);
		
    }
 
}