define(function(require) {
   require('angular')
   .module('app.papel.services', [])
   .service('PapelService', require('app/modules/papel/services/PapelService'));
});