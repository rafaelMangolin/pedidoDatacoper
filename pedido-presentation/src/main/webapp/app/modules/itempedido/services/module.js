define(function(require) {
   require('angular')
   .module('app.itempedido.services', [])
   .service('ItemPedidoService', require('app/modules/itempedido/services/ItemPedidoService'));
});