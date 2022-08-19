fun main(){

    /*
      Crie um programa para trabalhar com estoque de uma loja, o programa obrigatório
      trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
      programa deve atender as seguintes funcionalidades:
      Armazenar dados da Lista
      Remover dados da lista;
      Atualizar dados da lista.
      Todos Apresentando os dados da lista.
       */

    enquanto ( verdadeiro ){

        println ( " (1) - Cadastrar um produto " )
        println ( " (2) - Remover um produto " )
        println ( " (3) - Atualizar um produto " )
        println ( " (4) - Estoque Apresentado " )
        println ( " (0) - Sair " )
        print ( " Selecione: " )

        quando (readln().toInt()){
            1  -> {
            println ( " Cadastrando produtos! " )
            print ( " Informe o nome do produto: " )
            val produto = readln()
            print ( " Informe a quantidade do produto: " )
            val quantidade = readln ().toInt()
            print ( " Informe o valor unitário do produto: " )
            val valor = readln().toDouble()
            cadastraProdutoLista(produto, quantidade, valor)
        }
            2  -> {
            println ( " Removendo produtos! " )
            print ( " Informe o nome do produto: " )
            val produto = readln()
            removeProdutoLista(produto)
        }
            3  -> {
            println ( " Atualizando produtos! " )
            print ( " Informe o nome do produto: " )
            val produto = readln()
            atualizaçãoProdutoLista(produto)
        }
            4  -> {
            println ( " Listando produtos: " )
            listaProdutosLista()
        }
            0  -> {
            println ( " Obrigado por usar! " )
            parar
        }
            mais  -> {
            println ( " Opção inválida " )
        }
        }

    }







}