define(['app/apiLocations'], function(APILocation) {

	ProdutoService.$inject = ['GumgaRest'];

	function ProdutoService(GumgaRest) {
    	var Service = new GumgaRest(APILocation.apiLocation + '/api/produto');
        
        Service.getMedidas = function(){
            return this.extend('get', '/medidas');
        }
    	return Service;
    }

  	return ProdutoService;
});