var app = angular.module('app1', []);

app.controller('ClickController', function() {
    this.header = "Header przed zmianami";
    this.changeHeader = function() {
        this.header = this.textInput;
        this.header = this.header.toUpperCase();
    }
});