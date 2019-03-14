angular.module('person.controller', []).controller("PersonController", [ "$scope", "$rootScope", "$uibModal", "PersonService",
		function($scope, $rootScope, $uibModal, PersonService) {
            $scope.allItemsSelected = false;
			$scope.personDto = {
				id : null,
				name : null,
				street : null,
				number : null,
				neighborhood : null,
				city : null,
				state : null,
				cellphonesk : null,
				phone : null
            };

            $scope.selectEntity = function () {
	            for (var i = 0; i < $scope.allPersons.length; i++) {
	                if (!$scope.allPersons[i].isChecked) {
	                    $scope.allItemsSelected = false;
	                    return;
	                }
                }
                $scope.allItemsSelected = true;
	        };
	
	        $scope.selectAll = function () {
                console.log($scope.allItemsSelected);
	            for (var i = 0; i < $scope.allPersons.length; i++) {
	                $scope.allPersons[i].isChecked = $scope.allItemsSelected;
	            }
	        };
            
            PersonService.getAllPersons().then(function(value) {
						$scope.allPersons= value.data;
					}, function(reason) {
						console.log("error occured: " + reason);
					}, function(value) {
						console.log("no callback " + value);
					});
			
		    $scope.deletePersonById = function() {
                for (var i = 0; i < $scope.allPersons.length; i++) {
	                if ($scope.allPersons[i].isChecked) {
				PersonService.deletePersonById($scope.allPersons[i].id).then(function() {
                    console.log("Person was removed");
                    
					PersonService.getAllPersons().then(function(value) {
						$scope.allPersons= value.data;
					}, function(reason) {
						console.log("error occured: " + reason);
					}, function(value) {
						console.log("no callback " + value);
					});					
				
				}, function(reason) {
					console.log("error occured: " + reason);
				}, function(value) {
					console.log("no callback " + value);
                });
             }
             }  
			}

			$scope.savePerson = function() {
                PersonService.savePerson($scope.personDto).then(function() {
					console.log("Person added");
					PersonService.getAllPersons().then(function(value) {
						$scope.allPersons= value.data;
					}, function(reason) {
						console.log("error occured: " + reason.data);
					}, function(value) {
						console.log("no callback " + value);
					});

					$scope.personDto = {
						id : null,
						name : null,
						street : null,
						number : null,
						neighborhood : null,
						city : null,
						state : null,
						cellphone : null,
						phone : null
					};
				}, function(reason) {
					console.log("error occured: " + reason.data);
				}, function(value) {
					console.log("no callback " + value);
				});
            }

            $scope.open = function (id) {
                PersonService.getPersonById(id).then(function(value) {
                    $rootScope.personDetail = value.data;
				}, function(reason) {
					console.log("error occured: " + reason);
				}, function(value) {
					console.log("no callback " + value);
                });
                
                $uibModal.open({
                    templateUrl: "PersonDetails",
                    controller: "PersonDetails",
                    id: "id",
                });
                
            }
            
        } ]);
        