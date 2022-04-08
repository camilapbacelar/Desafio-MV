import br.com.desafiomv.Desafio;
import br.com.desafiomv.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p=new Pessoa("Camila", 000000, "caju");
        Pessoa p2= new Pessoa("felipe", 11111111, "cafe");
        Desafio d=new Desafio();
        d.adicionarPessoa(p);
        d.adicionarPessoa(p2);
        Pessoa pessoaEncontrada = d.selecionarPessoa("felipe");
        d.deletarPessoa(11111111);

        System.out.println(pessoaEncontrada.getNome() + " " +  pessoaEncontrada.getComida());
    }
}
