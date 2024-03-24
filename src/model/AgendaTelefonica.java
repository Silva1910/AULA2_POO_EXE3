package model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato novoContato) {
        contatos.add(novoContato);
    }

    public List<Contato> removerContato(String telefone) {
        Iterator<Contato> iterator = contatos.iterator();
        while (iterator.hasNext()) {
            Contato c = iterator.next();
            if (c.getTelefone().equals(telefone)) {
                iterator.remove();
            }
        }
        return contatos;
    }

    public List<Contato> buscarContato(String termoBusca) {
        List<Contato> contatosEncontrados = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().contains(termoBusca) || contato.getTelefone().contains(termoBusca) || contato.getEmail().contains(termoBusca)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }
}
