define([], function() {


 	PedidoFormController.$inject = ['PedidoService', '$state', 'entity', '$scope', 'gumgaController', 'PessoaService'];

 	function PedidoFormController(PedidoService, $state, entity, $scope, gumgaController, PessoaService) {

    	gumgaController.createRestMethods($scope, PedidoService, 'pedido');

		$scope.valueTipoOperacao = [{value:'COMPRA', label:'COMPRA'}, {value:'VENDA', label:'VENDA'}]

	    gumgaController.createRestMethods($scope, PessoaService, 'pessoa');
	    $scope.pessoa.methods.search('nome','');    

    
    	$scope.pedido.data = entity.data || {};
		$scope.pedido.data.data = ($scope.pedido.data.data == undefined || $scope.pedido.data.data == "") ? new Date() : new Date($scope.pedido.data.data);
		
		$scope.pedido.data.itenspedido = $scope.pedido.data.itenspedido || [];
		$scope.continue = {};
	
		$scope.pedido.on('putSuccess',function(data){
			$state.go('pedido.list');
		});
 	}
	
	return PedidoFormController;   
});