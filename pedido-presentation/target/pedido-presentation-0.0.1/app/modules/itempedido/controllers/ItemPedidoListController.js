define([], function() {

  ItemPedidoListController.$inject = ['$scope', 'ItemPedidoService', 'gumgaController'];

  function ItemPedidoListController($scope, ItemPedidoService, gumgaController) {

    gumgaController.createRestMethods($scope, ItemPedidoService, 'itempedido');

    ItemPedidoService.resetDefaultState();
    $scope.itempedido.execute('get');

    $scope.tableConfig = {
      columns: 'precoUnitario ,button',
      checkbox: true,
      columnsConfig: [{
        name: 'precoUnitario',
        title: '<span gumga-translate-tag="itempedido.precoUnitario"> precoUnitario </span>',
        content: '{{$value.precoUnitario }}',
        sortField: 'precoUnitario'
      }, {
        name: 'button',
        title: ' ',
        content: '<span class="pull-right"><a class="btn btn-primary btn-sm" ui-sref="itempedido.edit({id: {{$value.id}} })"><i class="glyphicon glyphicon-pencil"></i></a></span>'
      }]
    };

  };
  return ItemPedidoListController;
});
