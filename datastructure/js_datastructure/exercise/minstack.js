Stack = require("../js_datastructure/Stack.js");

function minStack () {
  var dataStack = new Stack.Stack();
  var minStack = new Stack.Stack();

  //push a new items
  this.push = function (item) {
    dataStack.push(item);
    if (minStack.isEmpty() || minStack.top() > item) {
      minStack.push(item);
    } else {
      minStack.push(minStack.top());
    }
  }

  this.min = function () {
    return minStack.top();
  }

}

var testStack = new minStack();
testStack.push(3);
testStack.push(6);
testStack.push(9);
console.log(testStack.min());
