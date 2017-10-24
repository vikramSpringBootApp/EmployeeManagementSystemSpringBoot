var myapp = angular
				.module("myModule",[])
				.controller("myController",function($scope){
					
					var employees = [
						{ name : "Vikram",    dob : new Date("October 30,1993") ,  gender : "Male" , salary : 33383},
						{ name : "Rishi",     dob : new Date("November 30,1991") , gender : "Male" , salary : 33330},
						{ name : "Virendra",  dob : new Date("October 30,1992") ,  gender : "Male" , salary : 33312},
						{ name : "Rahul" ,   dob : new Date("August 31,1994") ,   gender : "Male" , salary : 33900}
						];
						$scope.employees = employees;
						$scope.orderSelect = "name";
				});

