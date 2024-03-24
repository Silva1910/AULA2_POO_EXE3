package view;

import model.AgendaTelefonica;
import model.Contato;

public class Principal {
    public static void main(String[] args) {

        AgendaTelefonica agenda = new AgendaTelefonica();
        

        Contato contato1 = new Contato("Amos", "11959355141", "amossilvaneg@gmail.com");
        

        agenda.adicionarContato(contato1);
        

        Contato contato2 = new Contato("Joao", "1123456789", "joao@example.com");
        agenda.adicionarContato(contato2);
        
        
        
        String NomeBusca = "Amos";
        for (Contato contato : agenda.buscarContato(NomeBusca)) {
            System.out.println(contato.getNome() + " - " + contato.getTelefone() + " - " + contato.getEmail());
        }
    }
}
