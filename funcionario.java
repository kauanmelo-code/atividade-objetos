public class Funcionario {
	int cracha;
	float salario;
	String cargo;
	
	Funcionario(){}
	
	Funcionario(int c, float s, String car){
		this.cargo = car;
		this.cracha = c;
		this.salario = s;
	}
	
	Funcionario duplicar(){
		return new Funcionario(this.cracha, this.salario, this.cargo);
	}
	
	float calculaAumento(float percent){
		return this.salario +(salario*(percent/100f));
		
	}
	
	float calculaAumento(int tempo){
		return this.salario+tempo*150f;
		
	}
	
	@Override
	public String toString(){
		return  "numero de cracha:  " + this.cracha +
				"\nvalor de salario:  " + this.salario +
				"\ncargo:  " + this.cargo;
	}
}
