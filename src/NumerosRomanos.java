
public class NumerosRomanos {
	
	private String uno = "I";
	private String cinco = "V";
	private String diez = "X";
	
	public NumerosRomanos(){
		
	}
	
	public int decimal(int numero){
		int digitoDecimal = numero/10;		
		return digitoDecimal ;
	}
	
	public String addUnos(int x){
		String s = "";
		for (int i = 1; i <= x; i++) {
			s +=uno;
		}
		return s;
	}
	
	public String FromFourToEight(int x){
		String s ="";
		if(x==4){
			 s = uno +cinco;
		}
		else{
			s = cinco+addUnos(x-5);
		}
		return s;
	}
	
	public String from9To18(int x){
		String s = "";
		if(x==9){
			s= uno +diez;
		}else if(x>=10 && x <= 13){
		s= diez+ addUnos(x-(10 * decimal(x)));
		}else{
		   s = diez + FromFourToEight(x-(10 * decimal(x)));
			
		}
		return s;
	}	
	
	public String from20To28(int x){
		String s = "";
		if(x>=20 && x <= 23){
			s= diez + diez + addUnos(x-(10 * decimal(x)));
		}else{
		   s = diez + diez + FromFourToEight(x-(10 * decimal(x)));
			
		}
		return s;
	}	
	
	public String convertir(int numero){
		String resultado = null;
		if(numero>0 && numero <=3){
			
			resultado = addUnos(numero);
			
		}else if(numero >= 4 && numero<9){
			resultado =FromFourToEight(numero);
			
		}else if(numero >= 9 && numero <=18){
			
			resultado = from9To18(numero);
			
		}else if(numero == 19){
			resultado = diez + uno + diez;
		}else if(numero >= 20 && numero <=28){
			resultado = from20To28(numero);
		}
		
		return resultado;
	}
	

}
