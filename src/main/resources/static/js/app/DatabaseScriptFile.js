var myApp = angular.module("myModule",[])
				   .controller("myController",function($scope,$http){
					   $http.get("http://localhost:8060/employee/HomePage/listallemployee")
					   .then(function(response){
						   $scope.employees = response.data;
					   });
				   });

