var app = angular.module('person', [ 'ui.bootstrap', 'person.controller',
		'person.service', 'personDetails.controller']);
app.constant("CONSTANTS", {
	getPersonById : "/rest/pessoa/",
	getAllPersons : "/rest/pessoas",
	savePerson : "/rest/pessoa/save",
	deletePersonById : "/rest/pessoa/remove/"
});