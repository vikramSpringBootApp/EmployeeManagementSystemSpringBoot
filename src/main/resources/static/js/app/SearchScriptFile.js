var myApp = angular
						.module("myModule",[])
						.filter("gender", function() {
							return function(gender){
								switch(gender){
									case "Male" : return 1;
									case "Female" : return 2;
								}
							}
						})
						.controller("myController", function($scope) {
							var employees = [
								{ name : "Vikram",    dob : new Date("October 30,1993") ,  gender : "Male" , salary : 33383 , city : "Varnashi"},
								{ name : "Rishi",     dob : new Date("November 30,1991") , gender : "Male" , salary : 33330 , city : "Indore"},
								{ name : "Virendra",  dob : new Date("October 30,1992") ,  gender : "Male" , salary : 33312, city : "Bikaner"},
								{ name : "Rahul" ,   dob : new Date("August 31,1994") ,   gender : "Female" , salary : 33900 , city : "Nagpur"}
								];
								$scope.employees = employees;
								
								$scope.search = function(item){
									if($scope.SearchText == undefined){
										return false;
									}
									else{
										if(item.name.toLowerCase().indexOf($scope.SearchText.toLowerCase()) != -1 ||
												item.city.toLowerCase().indexOf($scope.SearchText.toLowerCase()) != -1){
											return true;
										}
									}
									return false;
								}
								
								$scope.employeeView = "EmployeeTable.html";
								
						});	