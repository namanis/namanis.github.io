public class Arvore{
private String nome;
public String getNome(){
return nome;
}
public void setNome(String novoNome){
nome=novoNome;
}
public static void main(String [] args){
	Arvore arvore = new Arvore();
	arvore.setNome("Mangueira");
	System.out.println(arvore.getNome());
}
}