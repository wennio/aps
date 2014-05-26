import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Testando {
	
	Pessoa p1 = new Pessoa("kelson", 22);
	ArrayList<Pessoa> lista = new ArrayList<>();
	@Test
	public void test1() {
		assertEquals("kelson", p1.getNome());
	}
	@Test
	public void test2(){
		assertEquals(22, p1.getIdade());
	}
	@Test
	public void test3(){
		lista.add(p1);
		assertEquals(1,lista.size());
	}
	
	
	
	

}
