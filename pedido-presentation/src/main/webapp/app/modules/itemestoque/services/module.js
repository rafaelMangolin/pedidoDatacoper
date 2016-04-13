define(function(require) {
   require('angular')
   .module('app.itemestoque.services', [])
   .service('ItemEstoqueService', require('app/modules/itemestoque/services/ItemEstoqueService'));
});