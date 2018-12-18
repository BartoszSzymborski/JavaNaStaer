var app = angular.module('app3',[]);

app.controller('KeyController',function(){
    this.up = 0;
    this.down =0;
    this.press = 0;
    this.keyDown = function(){
        this.down++;
    }
    this.keyUp = function(){
        this.up++;
    }
    this.keyPress = function(){
        this.press++;
    }
});