define([], function() {

  ModalItemPedidoController.$inject = ['$scope', 'gumgaController', '$uibModal', '$uibModalInstance', 'gumgaController','entity','ProdutoService'];

  function ModalItemPedidoController($scope, gumgaController, $uibModal, $uibModalInstance, gumgaController, entity,ProdutoService) {
  
  	   $scope.pedido = {};
  	   $scope.pedido.data = angular.copy(entity) || {};
  	   
  

      gumgaController.createRestMethods($scope, ProdutoService, 'produto');
      $scope.produto.methods.search('','')

  

  
 	  $scope.ok = function (obj) {
          $uibModalInstance.close(obj);
      };

      $scope.cancel = function () {
          if($scope.Modal.$dirty) {
              var modal = $uibModal.open( {
                  template:
                  '<div>'+
                  '   <section class="modal-body">' +
                  '       <h4>Deseja sair sem salvar as altera��es?</h4>' +
                  '   </section>'+
                  '   <div class="modal-footer">'+
                  '       <button class="btn btn-default" ng-click="handleClose(false)">N�o</button>' +
                  '       <button class="btn btn-default" ng-click="handleClose(true)">Sim</button>' +
                  '   </div>'+
                  '</div>',
                  backdrop: false,
                  keyboard: false,
                  size: 'md',
                  controller: function($scope, $uibModalInstance) {
                      $scope.handleClose = function(_boolean) {
                          _boolean ? $uibModalInstance.close(true) : $uibModalInstance.close(false);
                      }
                  }
              });

              modal.result.then(function(_boolean) {
                  if(_boolean){
                      $uibModalInstance.dismiss('cancel');
                  }
              })
              return 0
          }
          $uibModalInstance.dismiss('cancel');
      };

  };
  return ModalItemPedidoController;
});



