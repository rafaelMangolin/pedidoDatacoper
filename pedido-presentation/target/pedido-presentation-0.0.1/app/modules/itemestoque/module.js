define(function(require) {

  var APILocation = require('app/apiLocations');
  require('angular-ui-router');
  require('app/modules/itemestoque/services/module');
  require('app/modules/itemestoque/controllers/module');

  return require('angular')
    .module('app.itemestoque', [
      'ui.router',
      'app.itemestoque.controllers',
      'app.itemestoque.services',
      'gumga.core'
    ])
    .config(function($stateProvider, $httpProvider) {
      $stateProvider
        .state('itemestoque.list', {
          url: '/list',
          templateUrl: 'app/modules/itemestoque/views/list.html',
          controller: 'ItemEstoqueListController'
        })
        .state('itemestoque.insert', {
          url: '/insert',
          templateUrl: 'app/modules/itemestoque/views/form.html',
          controller: 'ItemEstoqueFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/itemestoque/new');
            }]
          }
        })
        .state('itemestoque.edit', {
          url: '/edit/:id',
          templateUrl: 'app/modules/itemestoque/views/form.html',
          controller: 'ItemEstoqueFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/itemestoque/' + $stateParams.id);
            }]
          }
        });
    })
});