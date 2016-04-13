define([], function() {


 	PessoaFormController.$inject = ['PessoaService', '$state', 'entity', '$scope', 'gumgaController', 'PapelService'];

 	function PessoaFormController(PessoaService, $state, entity, $scope, gumgaController, PapelService) {

    	gumgaController.createRestMethods($scope, PessoaService, 'pessoa');

		$scope.valueSexo = [{value:'MASCULINO', label:'MASCULINO'}, {value:'FEMININO', label:'FEMININO'}]

	    gumgaController.createRestMethods($scope, PapelService, 'papel');
	    $scope.papel.methods.search('descricao','');    

	    $scope.papeisOptions=[];
    
    	$scope.pessoa.data = entity.data || {};
		$scope.pessoa.data.dataNascimento = ($scope.pessoa.data.dataNascimento == undefined || $scope.pessoa.data.dataNascimento == "") ? new Date() : new Date($scope.pessoa.data.dataNascimento);
		
		$scope.continue = {};
	
		$scope.pessoa.on('putSuccess',function(data){
			$state.go('pessoa.list');
		});
 	}
	
	return PessoaFormController;   
});