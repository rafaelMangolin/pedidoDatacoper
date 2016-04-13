define([], function() {

  ItemEstoqueListController.$inject = ['$scope', 'ItemEstoqueService', 'gumgaController'];

  function ItemEstoqueListController($scope, ItemEstoqueService, gumgaController) {

    gumgaController.createRestMethods($scope, ItemEstoqueService, 'itemestoque');

    ItemEstoqueService.resetDefaultState();
    $scope.itemestoque.execute('get');

    $scope.tableConfig = {
      columns: 'quantidade ,button',
      checkbox: true,
      columnsConfig: [{
        name: 'quantidade',
        title: '<span gumga-translate-tag="itemestoque.quantidade"> quantidade </span>',
        content: '{{$value.quantidade }}',
        sortField: 'quantidade'
      }, {
        name: 'button',
        title: ' ',
        content: '<span class="pull-right"><a class="btn btn-primary btn-sm" ui-sref="itemestoque.edit({id: {{$value.id}} })"><i class="glyphicon glyphicon-pencil"></i></a></span>'
      }]
    };

  };
  return ItemEstoqueListController;
});
