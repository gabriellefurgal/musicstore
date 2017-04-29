angular.module('demo', []).controller('Products', function($scope, $http) {
	$http.get('http://localhost:8080/products').then(function(response) {
		$scope.products = response.data;
		});
});
