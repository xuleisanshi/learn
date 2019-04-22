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



function is_leagl_brackets (string) {
  var stack = new Stack();
  for (var i = 0; i < string.length; i++) {
    var item = string[i];
    if (item == "(") {
      // 将左括号压⼊入栈
      stack.push(item);
    } else if (item == ")") {
      // 如果为空,就说明没有左括号与之抵消 if(stack.isEmpty()){
      if (stack.isEmpty()) {
        return false;

      } else {
        // 将栈顶的元素弹出
        stack.pop();
      }
    }
  }
  return stack.size() === 0;
}


console.log(is_leagl_brackets("()()))"));
console.log(is_leagl_brackets("()"))
console.log(is_leagl_brackets("sdf(ds(ew(we)rw)rwqq)qwewe"));
console.log(is_leagl_brackets("()()sd()(sd()fw))("));

console.log("========================")

function calc_exp (exp) {
  var stack = new Stack();
  for (let i = 0; i < exp.length; i++) {
    var item = exp[i];
    if (["+", "-", "*", "/"].indexOf(item) >= 0) {
      let v1 = stack.pop();
      let v2 = stack.pop();
      let exp_str = v1 + item + v2;
      stack.push(parseInt(eval(exp_str)));
    }
    else {
      stack.push(item);
    }

  }
  return stack.top();
}

var exp_1 = ["4", "13", "5", "/", "+"];
var exp_2 = ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"];
console.log(calc_exp(exp_1));
console.log(calc_exp(exp_2));

