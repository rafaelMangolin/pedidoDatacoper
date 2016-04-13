define([], function() {

  PapelListController.$inject = ['$scope', 'PapelService', 'gumgaController'];

  function PapelListController($scope, PapelService, gumgaController) {

    gumgaController.createRestMethods($scope, PapelService, 'papel');

    PapelService.resetDefaultState();
    $scope.papel.execute('get');

    $scope.tableConfig = {
      columns: 'descricao ,button',
      checkbox: true,
      columnsConfig: [{
        name: 'descricao',
        title: '<span gumga-translate-tag="papel.descricao"> descricao </span>',
        content: '{{$value.descricao }}',
        sortField: 'descricao'
      }, {
        name: 'button',
        title: ' ',
        content: '<span class="pull-right"><a class="btn btn-primary btn-sm" ui-sref="papel.edit({id: {{$value.id}} })"><i class="glyphicon glyphicon-pencil"></i></a></span>'
      }]
    };

  };
  return PapelListController;
});
