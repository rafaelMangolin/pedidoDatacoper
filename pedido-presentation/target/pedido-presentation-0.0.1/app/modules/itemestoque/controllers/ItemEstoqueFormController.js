define([], function() {


 	ItemEstoqueFormController.$inject = ['ItemEstoqueService', '$state', 'entity', '$scope', 'gumgaController', 'ProdutoService'];

 	function ItemEstoqueFormController(ItemEstoqueService, $state, entity, $scope, gumgaController, ProdutoService) {

    	gumgaController.createRestMethods($scope, ItemEstoqueService, 'itemestoque');


	    gumgaController.createRestMethods($scope, ProdutoService, 'produto');
	    $scope.produto.methods.search('preco','');    

    
    	$scope.itemestoque.data = entity.data || {};
		$scope.itemestoque.data.data = ($scope.itemestoque.data.data == undefined || $scope.itemestoque.data.data == "") ? new Date() : new Date($scope.itemestoque.data.data);
		
		$scope.continue = {};
	
		$scope.itemestoque.on('putSuccess',function(data){
			$state.go('itemestoque.list');
		});
 	}
	
	return ItemEstoqueFormController;   
});