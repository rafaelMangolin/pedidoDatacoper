define(function(require) {

  var APILocation = require('app/apiLocations');
  require('angular-ui-router');
  require('app/modules/pessoa/services/module');
  require('app/modules/pessoa/controllers/module');

  return require('angular')
    .module('app.pessoa', [
      'ui.router',
      'app.pessoa.controllers',
      'app.pessoa.services',
      'gumga.core'
    ])
    .config(function($stateProvider, $httpProvider) {
      $stateProvider
        .state('pessoa.list', {
          url: '/list',
          templateUrl: 'app/modules/pessoa/views/list.html',
          controller: 'PessoaListController'
        })
        .state('pessoa.insert', {
          url: '/insert',
          templateUrl: 'app/modules/pessoa/views/form.html',
          controller: 'PessoaFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/pessoa/new');
            }]
          }
        })
        .state('pessoa.edit', {
          url: '/edit/:id',
          templateUrl: 'app/modules/pessoa/views/form.html',
          controller: 'PessoaFormController',
          resolve: {
            entity: ['$stateParams', '$http', function($stateParams, $http) {
              return $http.get(APILocation.apiLocation + '/api/pessoa/' + $stateParams.id);
            }]
          }
        });
    })
});