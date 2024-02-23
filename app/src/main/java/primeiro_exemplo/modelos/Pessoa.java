package primeiro_exemplo.modelos;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
 
  //Método
public boolean verificarMaioridade() {
return this.idade >= 18;
 }
  public void setNome(String nome) {

    this.nome = nome;
  }
   public String getNome() {
       return this.nome;

   }

   public void setIdade(int idade) {
    this.idade = idade;
   }
   public int getIdade() {
      return this.idade;



   }


}
