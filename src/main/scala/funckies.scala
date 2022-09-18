object funckies {
def add_fun(a:Int =10, b:Int =20): Int ={
  return a+b
}
  //anonymous
  var AnonymousFun=( a:Int ,  b:Int)=> a+b; //this is anonymous func

  //higher order func, take func as args and return func as argument
def ho_fun_calcs (
            a :Double , b :Double, fun:(Double,Double)=>Double//func input & return type
        ):Double =fun(a,b);

def ho_fun_calcs_3params(
a: Double, b: Double, c: Double, fun: (Double, Double) => Double ): Double = fun(fun(a, b),c);
};
}
