package primeiro_exemplo;
 
import primeiro_exemplo.modelos.Pessoa;
 
public class hello {
    public static void main(String[] args) {
        int cont = 16022024;
        String nome = "Etec";
        System.out.println("Bom Dia!!!");
 
        System.out.println(cont + " : " + nome);
       
        Pessoa p1 = new Pessoa();
 
        p1.nome = "isadora";
        p1.idade = 17 ;
 
        System.out.println(p1.nome + ":" + p1.idade);
 
        Pessoa p2 = new Pessoa();
        p2.nome = "felipe";
        p2.idade = 21 ;
 
        System.out.println(p2.nome + ":" + p2.idade);
     
        Pessoa p3 = new Pessoa();
        p3.nome = "Rafaela";
        p3.idade = 10;
 
        System.out.println(p3.nome + ":" + p3.idade);
     
        System.out.println("Se marcar *true* sua você é maior de idade e se der *false* você é menor de idade:");
 
        System.out.println(p1.verificarMaioridade());
        System.out.println(p2.verificarMaioridade());
        System.out.println(p3.verificarMaioridade());
    }
}