define(function(require) {

  var APILocation = require('app/apiLocations');
  require('angular-ui-router');
  require('app/modules/itempedido/services/module');
  require('app/modules/itempedido/controllers/module');

  return require('angular')
    .module('app.itempedido', [
      'ui.router',
      'app.itempedido.controllers',
      'app.itempedido.services',
      'gumga.core'
    ])
    .config(function($stateProvider, $httpProvider) {
      $stateProvider
        .state('itempedido.list', {
          url: '/list',
          templateUrl: 'app/modules/itempedido/views/list.html',
          controller: 'ItemPedidoListController'
        })
        .state('itempedido.insert', {
          url: '/insert',
          templateUrl: 'app/modules/itempedido/views/form.html',
          controller: 'ItemPedidoFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/itempedido/new');
            }]
          }
        })
        .state('itempedido.edit', {
          url: '/edit/:id',
          templateUrl: 'app/modules/itempedido/views/form.html',
          controller: 'ItemPedidoFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/itempedido/' + $stateParams.id);
            }]
          }
        });
    })
});