package primeiro_exemplo;
 
import primeiro_exemplo.modelos.Pessoa;
 
public class hello {
    public static void main(String[] args) {
        int cont = 16022024;
        String nome = "Etec";
        System.out.println("Bom Dia!!!");
 
        System.out.println(cont + " : " + nome);
       
        Pessoa p1 = new Pessoa();
 
        //p1.nome = "Beatriz";
        p1.setNome("Isadora");
        //p1.idade = 17 ;
        p1.setIdade(17);
 
        //System.out.println(p1.nome + ":" + p1.idade);
        System.out.println(p1.getNome() + ":" + p1.getIdade());
 
        Pessoa p2 = new Pessoa();
        p2.setNome("Felipe");
        p2.setIdade(21);
 
        System.out.println(p2.getNome() + ":" + p2.getIdade());
     
        Pessoa p3 = new Pessoa();
        p3.setNome("Rafaela");
        p3.setIdade(10);
 
        System.out.println(p3.getNome() + ":" + p3.getIdade());
     
        System.out.println("Se marcar *true* você é maior de idade e se der *false* você é menor de idade:");
 
        System.out.println(p1.verificarMaioridade());
        System.out.println(p2.verificarMaioridade());
        System.out.println(p3.verificarMaioridade());
    }
}