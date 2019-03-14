angular.module('person.service', []).factory('PersonService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getPersonById = function(id) {
				return $http.get(CONSTANTS.getPersonById + id);
			}
			service.getAllPersons = function() {
				return $http.get(CONSTANTS.getAllPersons);
			}
			service.savePerson = function(personDto) {
				return $http.post(CONSTANTS.savePerson, personDto);
			}
			service.deletePersonById = function(id){
				return $http.delete(CONSTANTS.deletePersonById + id);
			}
			return service;
		} ]);