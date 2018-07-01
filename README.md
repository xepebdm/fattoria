# fattoria

Bugs existentes:
Após remover um produto através do índice, a lista de produtos não é atualizada
para preencher o índice removido. A coluna índice passa a ser inútil em operações futuras, pois não
corresponde mas com o produto correspondente.
O índice começa com valor 0, caso seja selecionado um índice não existente o usuário será direcionado
a uma página de erro.
O usuário deve prestar atenção ao selecionar o produto desejado.

Ao editar um produto, o usuário é redirecionado para uma página que contém os valores atuais do produto
selecionado. O usuário deve alterar o valor desejado.
O bug mantém o produto anterior e o produto novo na tabela, o produto novo recebe um novo índice.
