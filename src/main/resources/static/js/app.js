var app = angular.module('planning-poker', ['ngRoute']);

app.config(function ($routeProvider, $httpProvider) {

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

    $routeProvider
        .when('/', {
            templateUrl: '/home.html',
            controller: 'home',
            controllerAs: 'controller'
        })
        .when('/login', {
            templateUrl: '/login.html',
            controller: 'login',
            controllerAs: 'controller'
        })
        .otherwise('/');
});

