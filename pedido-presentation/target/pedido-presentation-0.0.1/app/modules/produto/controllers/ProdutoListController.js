define([], function() {

  ProdutoListController.$inject = ['$scope', 'ProdutoService', 'gumgaController'];

  function ProdutoListController($scope, ProdutoService, gumgaController) {

    gumgaController.createRestMethods($scope, ProdutoService, 'produto');

    ProdutoService.resetDefaultState();
    $scope.produto.execute('get');

    $scope.tableConfig = {
      columns: 'preco ,button',
      checkbox: true,
      columnsConfig: [{
        name: 'preco',
        title: '<span gumga-translate-tag="produto.preco"> preco </span>',
        content: '{{$value.preco }}',
        sortField: 'preco'
      }, {
        name: 'button',
        title: ' ',
        content: '<span class="pull-right"><a class="btn btn-primary btn-sm" ui-sref="produto.edit({id: {{$value.id}} })"><i class="glyphicon glyphicon-pencil"></i></a></span>'
      }]
    };

  };
  return ProdutoListController;
});
