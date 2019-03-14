angular.module('personDetails.controller', []).controller("PersonDetails", [ "$scope", "$uibModalInstance",
		function($scope, $uibModalInstance) {
            $scope.close = function(){
                $uibModalInstance.close("Ok");
            }
        } ]);