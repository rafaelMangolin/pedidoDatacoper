define(function(require) {
  'use strict';
  require('angular');
  require('angular-ui-router');
  require('gumga-components');
  require('angular-ui-mask');
  require('angular-locale-pt-br');
  require('app/modules/login/module');
  require('app/apiLocations');
  require('app/modules/gumgatagdefinition/module');
  require('app/modules/gumgacustomfield/module');
    require('app/modules/pedido/module');
    require('app/modules/pessoa/module');
    require('app/modules/papel/module');
    require('app/modules/produto/module');
    require('app/modules/itempedido/module');
    require('app/modules/categoria/module');
    require('app/modules/itemestoque/module');
    
  //FIMREQUIRE
  angular.module('app.core', [
    'ui.router'
    ,'gumga.core'
    ,'app.login'
    ,'app.gumgatagdefinition'
    ,'app.gumgacustomfield'
        ,'app.pedido'
        ,'app.pessoa'
        ,'app.papel'
        ,'app.produto'
        ,'app.itempedido'
        ,'app.categoria'
        ,'app.itemestoque'
        ,'ui.utils.masks'
  //FIMINJECTIONS
    ])
    .config(function($stateProvider, $urlRouterProvider, $httpProvider, $injector, GumgaAlertProvider) {

    var template = [
        '<gumga-nav></gumga-nav>',
        '<gumga-menu menu-url="gumga-menu.json" keys-url="keys.json" image="./resources/images/gumga.png"></gumga-menu>',
        'oi<div class="gumga-container">',
        '<gumga-multi-entity-search data="multi.search"></gumga-multi-entity-search>',
        '</div>'
      ];

      $urlRouterProvider.otherwise('login/log');
      $stateProvider
        .state('login', {
          abstract: true,
          url: '/login',
          data: {
            id: 0
          },
          template: '<div ui-view style="height: 100%;"></div>'
        })
        .state('welcome', {
          url: '/welcome',
          data: {
            id: 0
          },
          templateUrl: 'app/modules/welcome/views/welcome.html'
        })
        .state('multientity', {
          url: '/multientity/:search',
          template: template.join('\n'),
          controller: 'MultiEntityController',
          controllerAs: 'multi',
          data: {
            id: 0
          },
          resolve: {
            SearchPromise: ['$stateParams', '$http', function($stateParams, $http) {
              var url = APILocations.apiLocation + '/public/multisearch/search/';
              return $http.get(url + $stateParams.search);
            }]
          }
        })
        .state('gumgatagdefinition', {
             url: '/gumgatagdefinition',
             templateUrl: 'app/modules/gumgatagdefinition/views/base.html'
        })
        .state('gumgacustomfield', {
             url: '/gumgacustomfield',
             templateUrl: 'app/modules/gumgacustomfield/views/base.html'
        })
        .state('pedido', {
        data: {
            id: 1
        }, 
            url: '/pedido',
            templateUrl: 'app/modules/pedido/views/base.html'
        })

        .state('pessoa', {
        data: {
            id: 1
        }, 
            url: '/pessoa',
            templateUrl: 'app/modules/pessoa/views/base.html'
        })

        .state('papel', {
        data: {
            id: 1
        }, 
            url: '/papel',
            templateUrl: 'app/modules/papel/views/base.html'
        })

        .state('produto', {
        data: {
            id: 1
        }, 
            url: '/produto',
            templateUrl: 'app/modules/produto/views/base.html'
        })

        .state('itempedido', {
        data: {
            id: 1
        }, 
            url: '/itempedido',
            templateUrl: 'app/modules/itempedido/views/base.html'
        })

        .state('categoria', {
        data: {
            id: 1
        }, 
            url: '/categoria',
            templateUrl: 'app/modules/categoria/views/base.html'
        })

        .state('itemestoque', {
        data: {
            id: 1
        }, 
            url: '/itemestoque',
            templateUrl: 'app/modules/itemestoque/views/base.html'
        })

        //FIMROUTE


      $httpProvider.interceptors.push(function($q, $injector, $timeout) {

        return {
          'request': function(config) {
            config.headers['gumgaToken'] = window.sessionStorage.getItem('token') || 0;
            return config;
          },
          'responseError': function(rejection) {
            var $state = $injector.get('$state');
            GumgaAlertProvider.createDangerMessage(rejection.data.response, rejection.statusText);
            rejection.status == 403 && ($state.go('login.log'));
            return $q.reject(rejection);
          }
        };
      })
    })
});
