
public class Teste_Exception {
	
	private int num;
	private String nome;
	private int cod;

	public void setNome(String nome) throws Nome_Incorreto{
		
		this.nome = nome;
		
		if(this.nome.equals("Isto")){
			throw new Nome_Incorreto();
		}
	}
	
	public void setNum(int num) throws Num_Incorreto{
		
		this.num = num;
		
		if(this.num != (123)){
			throw new Num_Incorreto();
		}
	}
	
	public void setCod(int cod) throws Codigo_Incorreto{
		this.cod = cod;
		if(this.cod != (456)){
			
			throw new Codigo_Incorreto();
		} 
		
	}
	
}
