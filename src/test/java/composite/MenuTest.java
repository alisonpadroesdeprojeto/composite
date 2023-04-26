package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void deveRetornarExibicaoMenu() {
        Menu menu = new Menu("Menu Principal");

        Menu menu1 = new Menu("Menu 1");
        Menu menu1_1 = new Menu("Menu 1.1");
        menu1.adicionar(menu1_1);
        Menu menu1_2 = new Menu("Menu 1.2");
        menu1.adicionar(menu1_2);
        Menu menu1_2_1 = new Menu("Menu 1.2.1");
        menu1_2.adicionar(menu1_2_1);

        Menu menu2 = new Menu("Menu 2");
        menu1.adicionar(menu1_1);

        Menu menu3 = new Menu("Menu 3");

        menu.adicionar(menu1);
        menu.adicionar(menu2);
        menu.adicionar(menu3);

        assertEquals("- Menu Principal\n" +
                "\t- Menu 1\n" +
                "\t\t- Menu 1.1\n" +
                "\t\t- Menu 1.2\n" +
                "\t\t\t- Menu 1.2.1\n" +
                "\t\t- Menu 1.1\n" +
                "\t- Menu 2\n" +
                "\t- Menu 3\n", menu.getExibicao());
    }
}
