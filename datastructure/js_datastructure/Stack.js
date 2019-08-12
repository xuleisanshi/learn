function Stack () {
  var items = [];
  //push a new element to a stack
  this.push = function (item) {
    items.push(item);
  }

  //pop the top element in the stack
  this.pop = function () {
    return items.pop();
  }

  //top method to return the top element
  this.top = function () {
    return items[items.length - 1];
  }

  // is the stack empty
  this.isEmpty = function () {
    return items.length === 0;
  }

  //return the size of the stack
  this.size = function () {
    return items.length;
  }

  //clean the stack
  this.clear = function () {
    items = [];
  }
}
exports.Stack = Stack;

