package work;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testes {

	@Test
	void test() {
		
		ref_nome obj1 = new ref_nome();
		obj1.atri1 = 2;
		obj1.atri2 = 3;
		
		assertEquals(5, obj1.soma());
		
		assertEquals(3, obj1.funcao1());
		assertEquals(4, obj1.funcao2());
		assertEquals(2, obj1.funcao3());
		assertEquals(12, obj1.funcao4());
		assertEquals(23, obj1.funcao5());
	}
	
	@Test
	void test2() {
		ref_move obj2 = new ref_move();
		assertEquals("Este método deve estar em ref_move2", obj2.metodo_para_move2());
	}
	
	@Test
	void test3() {
		ref_change_signature obj3 = new ref_change_signature();
		
		assertEquals(15, obj3.calculo(10, 5));
		
	}
	
	@Test
	void test4() {
		ref_make_static obj4 = new ref_make_static();
		
		assertEquals(12, obj4.tornar_static(10, 5, 3));
		
	}
	
	@Test
	void test5() {
		ref_inline obj5 = new ref_inline();
		
		assertEquals(52, obj5.retorno());
		
	}

}
