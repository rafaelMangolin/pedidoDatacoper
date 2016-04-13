define(function (require) {
    var angular = require('angular');
    require('app/modules/itemestoque/services/module');
    require('angular-ui-router');

    return angular
            .module('app.itemestoque.controllers', ['app.itemestoque.services','ui.router'])
            .controller('ItemEstoqueFormController', require('app/modules/itemestoque/controllers/ItemEstoqueFormController'))
            .controller('ItemEstoqueListController', require('app/modules/itemestoque/controllers/ItemEstoqueListController'));
});