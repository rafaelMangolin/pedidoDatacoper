define(function (require) {
    var angular = require('angular');
    require('app/modules/itempedido/services/module');
    require('angular-ui-router');

    return angular
            .module('app.itempedido.controllers', ['app.itempedido.services','ui.router'])
            .controller('ItemPedidoFormController', require('app/modules/itempedido/controllers/ItemPedidoFormController'))
            .controller('ItemPedidoListController', require('app/modules/itempedido/controllers/ItemPedidoListController'));
});