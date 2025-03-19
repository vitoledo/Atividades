// classe driver
package atividades.ATVDS01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        int esc;
        Produto[] produtos = new Produto[10];

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
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");

                    System.out.println("\n\n");
                    break;
            }
        } while (esc != 5);
        scan.close();
    }
}