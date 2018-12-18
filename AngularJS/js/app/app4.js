var app = angular.module('app4',[]);

app.controller('ChangeController',function(){
    this.header='Odznaczony';
    this.changeState = function(){
        this.header = this.checkbox? 'Zaznaczony':'Odznaczony';
    }
});