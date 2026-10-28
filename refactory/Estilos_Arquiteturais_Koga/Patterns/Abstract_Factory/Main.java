
package Patterns.Abstract_Factory;

public class Main {

    public static void main(String[] args) {
        executarAplicacao(new FabricaAndroid());
    }

    public static void executarAplicacao(Fabricas fabrica) {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}
