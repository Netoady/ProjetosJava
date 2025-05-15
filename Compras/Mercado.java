public class Mercado {
    private Produto [] produtos;
    private int quantidade;

    public Mercado () {
        produtos = new Produto [20];
        quantidade = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (quantidade < produtos.length) {
            produtos[quantidade++] = produto;
        } else {
            System.out.println("Limite de produtos atingido!");
        }
    }

    public Produto pesquisarProduto(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nome)) {
                return produtos[i];
            }
        }
        return null;
    }

    public boolean excluirProduto(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < quantidade - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                produtos[--quantidade] = null;
                return true;
            }
        }
        return false;
    }
    
}