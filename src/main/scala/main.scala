import closure.closure_var

object main {
def main(args: Array[String]):Unit={

  /*
  var whilellop = new while_loop();
  whilellop.scala_while()

  var doloop = new do_while();
  doloop.do_loop()

  var fl = new for_loop;
  fl.forloop()

  var mat_exp = new match_expr;
  mat_exp.age; //() not given coz void returns, so () can be ommted

  hello_object.hi() // object does not need to instanciate , can direct call
*/

/*
var x:Int=  funckies.add_fun() //uses default param 10,20
var y:Int=  funckies.add_fun(3,5) //uses custom param
  println(f"$x+$y="+x+y)
  println(x+ ""+ y +"=" +x+y) //does not sum, just shows value
  println(x+ ""+ y +"=" +(x+y))
  println(x+ "+"+ y +"=" +(x+y)) //correct to calculate sum
  println(f"$x+$y="+x+y) //does not sum, just shows value
  println(f"$x+$y="+(x+y)) //correct to calculate sum

  print(funckies.AnonymousFun(1,2)) //calling an anonymous fun
*/

/*
  //higher oder functions
var ho_fun_add:Double=  funckies.ho_fun_calcs(10,20,(a,b)=>(a+b))
var ho_fun_mul:Double=  funckies.ho_fun_calcs(10,20,(a,b)=>(a*b))
var ho_fun_min:Double=  funckies.ho_fun_calcs(10,20,(a,b)=>(a min b))
println(ho_fun_add)
  println(ho_fun_mul)
  println(ho_fun_min)

  var ho_3param_min:Double=  funckies.ho_fun_calcs_3params(90,80,50,(a,b)=>(a min b))
  println(ho_3param_min)

  //wildcart with Higheroder Func, more flexible, less code  😀
  var ho_3param_min_wildcart:Double=  funckies.ho_fun_calcs_3params(90,80,50,_ min _)
  println(ho_3param_min_wildcart)
  */

  //partial fun
/*
 print(funckies.partial_fun(20))
*/


  //closure
  closure_var=100; //import closure.closure_var
  println(closure.closure_add(20));
}
}
