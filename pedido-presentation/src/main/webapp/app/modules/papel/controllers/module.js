define(function (require) {
    var angular = require('angular');
    require('app/modules/papel/services/module');
    require('angular-ui-router');

    return angular
            .module('app.papel.controllers', ['app.papel.services','ui.router'])
            .controller('PapelFormController', require('app/modules/papel/controllers/PapelFormController'))
            .controller('PapelListController', require('app/modules/papel/controllers/PapelListController'));
});