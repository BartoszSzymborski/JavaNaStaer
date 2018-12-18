var app = angular.module('app2', []);

app.controller('MouseController', function() {
    this.mouseDown = function() {
        console.log('Mouse down');
    }
    this.mouseUp = function() {
        console.log('Mouse Up');
    }
    this.mouseEnter = function() {
        console.log('Mouse enter');
    }
    this.mouseLeave = function() {
        console.log('Mouse leave');
    }
    this.mouseMove = function() {
        console.log('Mouse move');
    }
    this.mouseOver = function() {
        console.log('Mouse over');
    }
});