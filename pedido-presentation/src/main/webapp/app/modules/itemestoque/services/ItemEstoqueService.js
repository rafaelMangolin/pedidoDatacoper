define(['app/apiLocations'], function(APILocation) {

	ItemEstoqueService.$inject = ['GumgaRest'];

	function ItemEstoqueService(GumgaRest) {
    	var Service = new GumgaRest(APILocation.apiLocation + '/api/itemestoque');

    	return Service;
    }

  	return ItemEstoqueService;
});