public class Principal {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        Produto p1 = new Produto("Arroz", 5.99);
        Produto p2 = new Produto("Feijão", 7.49);
        Produto p3 = new Produto("Macarrão", 3.25);

        mercado.adicionarProduto(p1);
        mercado.adicionarProduto(p2);
        mercado.adicionarProduto(p3);

        Produto pesquisado = mercado.pesquisarProduto("Feijão");
        if (pesquisado != null) {
            System.out.println("Produto encontrado: " + pesquisado);
        } else {
            System.out.println("Produto não encontrado.");
        }

        boolean excluido = mercado.excluirProduto("Arroz");
        if (excluido) {
            System.out.println("Produto 'Arroz' excluído com sucesso.");
        } else {
            System.out.println("Produto 'Arroz' não encontrado para exclusão.");
        }

        // Testando uma nova pesquisa após exclusão
        Produto verificar = mercado.pesquisarProduto("Arroz");
        if (verificar == null) {
            System.out.println("O produto 'Arroz' não está mais no mercado.");
        }
    }
}