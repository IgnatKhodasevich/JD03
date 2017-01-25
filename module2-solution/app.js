(function(){
  'use strict';

angular.module('ShoppingListAppCheckOff', [])
.controller('ToBuyController', ToBuyController)
.controller('AlreadyBoughtController', AlreadyBoughtController)
.service('ShoppingListCheckOffService', ShoppingListCheckOffService);

ToBuyController.$inject = ['ShoppingListCheckOffService'];
function ToBuyController(ShoppingListCheckOffService) {
var toBuy = this;

toBuy.items = ShoppingListCheckOffService.getItemsToBuy();

toBuy.buyItem = function(itemIndex){
  ShoppingListCheckOffService.buyItem(itemIndex);

};


}


AlreadyBoughtController.$inject = ['ShoppingListCheckOffService'];
function AlreadyBoughtController(ShoppingListCheckOffService) {
var alreadyBought = this;
alreadyBought.items = ShoppingListCheckOffService.getBoughtItems();

}

function ShoppingListCheckOffService() {
  var service = this;
  var itemsToBuy = [];
  var itemsBought = [];


  itemsToBuy[0] = {
    name: "cookies",
    quantity: "10"
  };

  itemsToBuy[1] = {
    name: "apples",
    quantity: "5"
  };
  itemsToBuy[2] = {
    name: "pepsi",
    quantity: "7"
  };

service.getItemsToBuy = function(){
  return itemsToBuy;
};
service.getBoughtItems = function(){
  return itemsBought;
};

service.buyItem = function(itemIndex){

  itemsBought.push(itemsToBuy[itemIndex]);
  itemsToBuy.splice(itemIndex, 1);

};

}



})();
