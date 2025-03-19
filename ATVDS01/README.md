Atividade de DS


        "Scanner scan;
        scan = new Scanner(System.in);
        int esc;
        Produto[] produtos = new Produto[10];"
        
        - nessa parte eu criei o meu scanner, meu array de produtos e uma variavel 'esc' para usar no switch



        do {
            System.out.println("\n\n");
            System.out.println(" MENU");
            System.out.println(" 1 - CRIAR PRODUTO");
            System.out.println(" 2 - ALTERAR PRODUTO");
            System.out.println(" 3 - EXCLUIR PRODUTO");
            System.out.println(" 4 - LISTAR TODOS OS PRODUTOS");
            System.out.println(" 5 - SAIR");
            esc = scan.nextInt();
            System.out.println("\n\n");

            switch (esc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    
                    break;
                case 5:
            }
        } while (esc != 5);
        scan.close();

        - aqui usando o system.out.println, eu fiz o menu, tudo isso dentro de um 'do while' para no casa do 'esc' ser igual a 5 fechar o programa



        case 1:
                    System.out.println("Digite o id do produto: ");
                    Produto novoProduto = new Produto();
                    novoProduto.setId(scan.nextInt());
                    scan.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    novoProduto.setNome(scan.nextLine());
                    System.out.println("Digite a descrição do produto: ");
                    novoProduto.setSobre(scan.nextLine());
                    System.out.println("Digite o valor do produto: ");
                    novoProduto.setValor(scan.nextFloat());
                    scan.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    novoProduto.setQuant(scan.nextInt());
                    scan.nextLine();

                    boolean produtoAdicionado = false;
                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] == null) {
                            produtos[i] = novoProduto;
                            produtoAdicionado = true;
                            break;
                        }
                    }

                    if (!produtoAdicionado) {
                        System.out.println("Sem espaço para adicionar mais produtos!");
                    }

                    System.out.println("\n\n");
                    break;
        
        - no caso 1 usei os gets e os sets criados na classe produto para pegar todas as informações, e no final um for para adicionar as informações no próximo espaço vazio com um if que diz se ainda existe espaço para mais um produto ser adicionado



        case 2:

                    System.out.println("Digite a posição do produto que deseja alterar: ");
                    int id = scan.nextInt();
                    int i = id - 1;
                    if (produtos[i] == null) {
                        System.out.println("Esse produto não existe!");
                    } else {

                        scan.nextLine();
                        System.out.println("Digite o id do produto: ");
                        produtos[i].setId(scan.nextInt());
                        scan.nextLine();
                        System.out.println("Digite o nome do produto: ");
                        produtos[i].setNome(scan.nextLine());
                        System.out.println("Digite a descrição do produto: ");
                        produtos[i].setSobre(scan.nextLine());
                        System.out.println("Digite o valor do produto: ");
                        produtos[i].setValor(scan.nextFloat());
                        scan.nextLine();
                        System.out.println("Digite a quantidade do produto: ");
                        produtos[i].setQuant(scan.nextInt());
                        scan.nextLine();
                    }

                    System.out.println("\n\n");
                    break;

        - aqui no caso 2 no começo fiz um teste para saber se o produto que quer ser alterado existe ou não, e se existe as novas informações sobrepoem as antigas



        case 3:
                    System.out.println("Em qual posição esta o produto que deseja excluir: ");
                    int ex = scan.nextInt();
                    ex = ex - 1;
                    if (produtos[ex] == null) {
                        System.out.println("Este produto não existe!");
                    } else {
                        produtos[ex] = null;
                        System.out.println("Produto removido!");
                    }
                    System.out.println("\n\n");
                    break;

        - aqui o usuário escolhe o produto que deseja excluir, e um 'if' para ver se o produto existe ou não



        case 4:

                    for (int j = 0; j < produtos.length; j++) {
                        if (produtos[j] != null) {
                            System.out.println("\n\n");
                            System.out.println("POSICÃO:");
                            System.out.println(j + 1);

                            System.out.println("ID:");
                            System.out.println(produtos[j].getId());

                            System.out.println("NOME:");
                            System.out.println(produtos[j].getNome());

                            System.out.println("SOBRE:");
                            System.out.println(produtos[j].getSobre());

                            System.out.println("VALOR:");
                            System.out.println(produtos[j].getValor());

                            System.out.println("QUANTIDADE:");
                            System.out.println(produtos[j].getQuant());
                            System.out.println("\n\n");
                        } else {
                            System.out.println("O produto número " + (j + 1) + " está vazio!");
                        }
                        System.out.println("\n\n");
                    }
                    break;

        - aqui no caso 4 eu usei o 'system.out.println' e os 'gets' para colocar as informações dos produtos que estão encapsuladas, e depois fala quais posições estão vazias



        case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");

                    System.out.println("\n\n");
                    break;

        - no caso 5 ele solta a mensagem 'System.out.println("Saindo do sistema...");' e sai do 'do while', pelo fato do 'esc' a variavel usada no 'do while' ser 5, ai fecha o programa, e depois no 'default' eu uso para no caso de uma opção invalida



        public class Produto {

    // caracteristicas - atributos - propriedades
    private int id;
    private String nome;
    private String sobre;
    private float valor;
    private int quant;

    // metodos - funçoes contrutoras
    public Produto() {
    }

    public Produto(int id, String nome, String sobre, float valor, int quant) {
        this.id = id;
        this.nome = nome;
        this.sobre = sobre;
        this.valor = valor;
        this.quant = quant;

    }

    public Produto(float valor, int quant) {
        this.valor = valor;
        this.quant = quant;

    }

    public Produto(int id, String nome, String sobre) {
        this.id = id;
        this.nome = nome;
        this.sobre = sobre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    // public int getPro(int id, String nome, String sobre, float valor, int quant){
    // return id;
    // ret
    // }

}

- aqui eu apenas criei a classe objeto usando o encapsulamento, os sets e os gets, e as funções contrutoras, no final tentei criar um get pra todas as informações de produto, mas não soube como fazer

