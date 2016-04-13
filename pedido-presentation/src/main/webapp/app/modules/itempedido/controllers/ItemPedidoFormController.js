define([], function() {


 	ItemPedidoFormController.$inject = ['ItemPedidoService', '$state', 'entity', '$scope', 'gumgaController', 'ProdutoService'];

 	function ItemPedidoFormController(ItemPedidoService, $state, entity, $scope, gumgaController, ProdutoService) {

    	gumgaController.createRestMethods($scope, ItemPedidoService, 'itempedido');


	    gumgaController.createRestMethods($scope, ProdutoService, 'produto');
	    $scope.produto.methods.search('preco','');    

    
    	$scope.itempedido.data = entity.data || {};
		$scope.continue = {};
	
		$scope.itempedido.on('putSuccess',function(data){
			$state.go('itempedido.list');
		});
 	}
	
	return ItemPedidoFormController;   
});