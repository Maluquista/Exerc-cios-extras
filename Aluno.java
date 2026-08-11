package testee;

public class Aluno {

	private String nome = "";
	private float n1, n2, n3, n4;
	
	public Aluno () {
		nome = "";
		n1 = n2 = n3 = n4 = 0;
	}
		public Aluno(String nome, float n1,float n2, float n3, float n4) {
			
		this.nome = nome;
			this.n1 = n1; 
			this.n2 = n2;
			this.n3 = n3;
			this.n4 = n4;
		}
		
		public void setNome(String nome) {
			this.nome = nome;} 
			public void setNota1(float n1) {
				this.n1 = n1;
				}
			public void setNota2(float n2) {
				this.n2 = n2;
				}
			public void setNota3(float n3) {
				this.n3 = n3;
				}
			public void setNota4(float n4) {
				this.n4 = n4;
				}
		
			public String getNome() {return nome;}
			public float getNota1() {return n1;}
			public float getNota2() {return n2;}
			public float getNota3() {return n3;}
			public float getNota4() {return n4;}
		
			public float calculaMedia() {
				return (n1 + n2 + n3 + n4)/4; }
			
			public String situacaoAluno() {
				float media = (n1 + n2 + n3 + n4)/4;
				if(media >= 7)return "Aluno aprovado";
				else if(media < 2)return "Aluno reprovado";
				else return "Aluno em exame";
			}
			public String toString() {
				return "nome: " + getNome() + 
						"\nNota 1: " + getNota1() + 
						"\nNota 2: " + getNota2() + 
						"\nNota 3: " + getNota3() + 
						"\nNota 4: " + getNota4() + 
						"\nMédia: " + calculaMedia() + 
						"\nSituação: " + situacaoAluno();
				
				
			}
			
}