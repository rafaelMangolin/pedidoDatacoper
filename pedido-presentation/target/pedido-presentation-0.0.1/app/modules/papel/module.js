define(function(require) {

  var APILocation = require('app/apiLocations');
  require('angular-ui-router');
  require('app/modules/papel/services/module');
  require('app/modules/papel/controllers/module');

  return require('angular')
    .module('app.papel', [
      'ui.router',
      'app.papel.controllers',
      'app.papel.services',
      'gumga.core'
    ])
    .config(function($stateProvider, $httpProvider) {
      $stateProvider
        .state('papel.list', {
          url: '/list',
          templateUrl: 'app/modules/papel/views/list.html',
          controller: 'PapelListController'
        })
        .state('papel.insert', {
          url: '/insert',
          templateUrl: 'app/modules/papel/views/form.html',
          controller: 'PapelFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/papel/new');
            }]
          }
        })
        .state('papel.edit', {
          url: '/edit/:id',
          templateUrl: 'app/modules/papel/views/form.html',
          controller: 'PapelFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/papel/' + $stateParams.id);
            }]
          }
        });
    })
});