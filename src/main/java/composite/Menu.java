package composite;

import java.util.ArrayList;
import java.util.List;


public class Menu implements ComponenteMenu {
    private String nome;
    private List<ComponenteMenu> componentes = new ArrayList<>();

    public Menu(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteMenu c) {
        componentes.add(c);
    }

    public String getExibicao() {
        int nivel = 0;
        return this.getExibicaoTabulada(nivel);
    }

    public String getExibicaoTabulada(int nivel) {
        StringBuilder exibicao = new StringBuilder("\t".repeat(nivel) + "- " + this.nome + "\n");
        for (ComponenteMenu componenteMenu : componentes) {
            exibicao.append(componenteMenu.getExibicaoTabulada(nivel+1));
        }
        return exibicao.toString();
    }
}