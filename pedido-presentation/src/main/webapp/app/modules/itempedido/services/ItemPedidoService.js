define(['app/apiLocations'], function(APILocation) {

	ItemPedidoService.$inject = ['GumgaRest'];

	function ItemPedidoService(GumgaRest) {
    	var Service = new GumgaRest(APILocation.apiLocation + '/api/itempedido');

    	return Service;
    }

  	return ItemPedidoService;
});