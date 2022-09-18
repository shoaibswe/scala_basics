object main {
def main(args: Array[String]):Unit={

  var whilellop = new while_loop();
//  whilellop.scala_while()

  var doloop = new do_while();
//  doloop.do_loop()

  var fl = new for_loop;
//  fl.forloop()

  var mat_exp = new match_expr;
  mat_exp.age; //() not given coz void returns, so () can be ommted

  hello_object.hi() // object does not need to instanciate , can direct call
}
}
