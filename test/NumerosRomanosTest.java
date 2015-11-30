import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosRomanosTest {
	
	NumerosRomanos num = new NumerosRomanos();

	@Test
	public void existeClase() {
		
		assertNotNull(num);
	}
	
	@Test
	public void convertirUno() {

		String uno = num.convertir(1);
		assertEquals(uno, "I");
	}
	
	@Test
	public void convertirDos() {

		String dos = num.convertir(2);
		assertEquals(dos, "II");
	}
	
	@Test
	public void convertirTres() {

		String tres = num.convertir(3);
		assertEquals(tres, "III");
	}

	@Test
	public void convertirCuatro() {

		String cuatro = num.convertir(4);
		assertEquals(cuatro, "IV");
	}
	
	@Test
	public void convertirCinco() {

		String cinco = num.convertir(5);
		assertEquals(cinco, "V");
	}
	
	@Test
	public void convertirSeis() {

		String seis = num.convertir(6);
		assertEquals(seis, "VI");
	}
	
	@Test
	public void convertirSiete() {

		String siete = num.convertir(7);
		assertEquals(siete, "VII");
	}
	
	@Test
	public void convertirOcho() {

		String ocho = num.convertir(8);
		assertEquals(ocho, "VIII");
	}
	
	@Test
	public void convertirNueve() {

		String nueve = num.convertir(9);
		assertEquals(nueve, "IX");
	}
	
	@Test
	public void convertirDiez() {

		String diez = num.convertir(10);
		assertEquals(diez, "X");
	}
	
	@Test
	public void convertirOnce() {

		String once = num.convertir(11);
		assertEquals(once, "XI");
	}
	
	@Test
	public void convertirDoce() {

		String doce = num.convertir(12);
		assertEquals(doce, "XII");
	}
	
	@Test
	public void convertirTrece() {

		String trece = num.convertir(13);
		assertEquals(trece, "XIII");
	}
	
	@Test
	public void convertirCatorce() {

		String catorce = num.convertir(14);
		assertEquals(catorce, "XIV");
	}
	@Test
	public void convertirQuince() {

		String quince = num.convertir(15);
		assertEquals(quince, "XV");
	}
	@Test
	public void convertirDieciseis() {

		String dieciseis = num.convertir(16);
		assertEquals(dieciseis, "XVI");
	}
	@Test
	public void convertir17() {

		String d = num.convertir(17);
		assertEquals(d, "XVII");
	}
	@Test
	public void convertir18() {

		String d = num.convertir(18);
		assertEquals(d, "XVIII");
	}
	
	@Test
	public void convertir19() {

		String d = num.convertir(19);
		assertEquals(d, "XIX");
	}
	@Test
	public void convertir20() {

		String d = num.convertir(20);
		assertEquals(d, "XX");
	}
	
	@Test
	public void convertir21() {

		String d = num.convertir(21);
		assertEquals(d, "XXI");
	}
	
	@Test
	public void convertir22() {

		String d = num.convertir(22);
		assertEquals(d, "XXII");
	}
	
	@Test
	public void convertir23() {

		String d = num.convertir(23);
		assertEquals(d, "XXIII");
	}
	
	@Test
	public void convertir24() {

		String d = num.convertir(24);
		assertEquals(d, "XXIV");
	}
	
	@Test
	public void convertir25() {

		String d = num.convertir(25);
		assertEquals(d, "XXV");
	}
	
	@Test
	public void convertir26() {

		String d = num.convertir(26);
		assertEquals(d, "XXVI");
	}
	
	@Test
	public void convertir27() {

		String d = num.convertir(27);
		assertEquals(d, "XXVII");
	}
	
	@Test
	public void convertir28() {

		String d = num.convertir(28);
		assertEquals(d, "XXVIII");
	}
}
