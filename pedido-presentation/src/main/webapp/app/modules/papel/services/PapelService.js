define(['app/apiLocations'], function(APILocation) {

	PapelService.$inject = ['GumgaRest'];

	function PapelService(GumgaRest) {
    	var Service = new GumgaRest(APILocation.apiLocation + '/api/papel');

    	return Service;
    }

  	return PapelService;
});