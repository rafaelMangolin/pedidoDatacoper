define([], function() {


 	PapelFormController.$inject = ['PapelService', '$state', 'entity', '$scope', 'gumgaController'];

 	function PapelFormController(PapelService, $state, entity, $scope, gumgaController) {

    	gumgaController.createRestMethods($scope, PapelService, 'papel');



    
    	$scope.papel.data = entity.data || {};
		$scope.continue = {};
	
		$scope.papel.on('putSuccess',function(data){
			$state.go('papel.list');
		});
 	}
	
	return PapelFormController;   
});