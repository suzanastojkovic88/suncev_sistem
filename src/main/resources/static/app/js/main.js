var suncevSistemApp = angular.module("suncevSistemApp", [ 'ngRoute' ]);

suncevSistemApp.controller("satelitiCtrl", function($scope, $http, $location) {

	var satelitiUrl = "/api/sateliti";
	var planeteUrl = "/api/planete";

	$scope.pageNum = 0;
	$scope.totalPages = 1;

	$scope.planete = [];
	$scope.sateliti = [];

	$scope.trazeniSatelit = {};
	$scope.trazeniSatelit.planeta = "";

	var getSateliti = function() {

		var config = {
			params : {}
		};

		config.params.pageNum = $scope.pageNum;

		if ($scope.trazeniSatelit.planeta != "") {
			config.params.planeta = $scope.trazeniSatelit.planeta;
		}

		$http.get(satelitiUrl, config).then(function success(res) {
			$scope.sateliti = res.data;
			$scope.totalPages = res.headers('totalPages');
		}, function error(res) {
			alert("Neuspešno dobavljanje satelita!");
		});
	};

	var getPlanete = function() {

		$http.get(planeteUrl).then(function success(res) {
			$scope.planete = res.data;
		}, function error(res) {
			alert("Neuspešno dobavljanje planeta!");
		});

	};

	getSateliti();
	getPlanete();

	$scope.nazad = function() {
		if ($scope.pageNum > 0) {
			$scope.pageNum = $scope.pageNum - 1;
			getSateliti();
		}
	};

	$scope.napred = function() {
		if ($scope.pageNum < $scope.totalPages - 1) {
			$scope.pageNum = $scope.pageNum + 1;
			getSateliti();
		}
	};

	$scope.trazi = function() {
		$scope.pageNum = 0;
		getSateliti();
	}
});

suncevSistemApp.controller("planeteCtrl", function($scope, $http, $location) {

	var url = "/api/planete";

	$scope.planete = [];

	var getPlanete = function() {

		var promise = $http.get(url);
		promise.then(function success(res) {
			$scope.planete = res.data;
		}, function error(res) {
			alert("Neuspešno dobavljanje planeta!");
		});
	}

	getPlanete();

});

suncevSistemApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/sateliti', {
		templateUrl : '/app/html/sateliti.html'
	}).when('/planete', {
		templateUrl : '/app/html/planete.html'
	}).otherwise({
		redirectTo : '/'
	});
} ]);
