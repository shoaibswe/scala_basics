object main {
def main(args: Array[String]):Unit={

  var whilellop = new while_loop();
//  whilellop.scala_while()

  var doloop = new do_while();
//  doloop.do_loop()

  var fl = new for_loop;
//  fl.forloop()

//  var mat_exp = new match_expr;
//  mat_exp.age; //() not given coz void returns, so () can be ommted

//  hello_object.hi() // object does not need to instanciate , can direct call

var x:Int=  funckies.add_fun() //uses default param 10,20
var y:Int=  funckies.add_fun(3,5) //uses custom param
  println(f"$x+$y="+x+y)
  println(x+ ""+ y +"=" +x+y) //does not sum, just shows value
  println(x+ ""+ y +"=" +(x+y))
  println(x+ "+"+ y +"=" +(x+y)) //correct to calculate sum
  println(f"$x+$y="+x+y) //does not sum, just shows value
  println(f"$x+$y="+(x+y)) //correct to calculate sum
print("Happy Birthday!")
}
}
