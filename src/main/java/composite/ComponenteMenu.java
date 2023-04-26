package composite;

public interface ComponenteMenu {
    void adicionar(ComponenteMenu c);
    String getExibicao();
    String getExibicaoTabulada(int nivel);
}
