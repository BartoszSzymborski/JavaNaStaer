var app = angular.module('app6', []);

app.controller('RepeatController', function() {
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    this.people = [
        new Person('Jan', 'Kowalski'),
        new Person('Ania', 'Abacka'),
        new Person('Wojtek', 'Nowak')
    ];
    this.changeH1Style = function() {
        this.h1style = {'color': 'red'};
    }
    this.even = 'parzyste';
    this.odd = 'nieparzyste';
});