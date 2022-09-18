class for_loop {
  var x=3;
  var z=1;
def forloop(): Unit ={
print(s"\n")
  for (i <- z to x){
    println(f"for loop val is $i")
  }
  for (i <- z.to(x)) {
    println(f"for loop 2nd option val is $i")
  }
  for (i <- z until x) {
    //until prints until the max val
    println(f"until loop 3rd option val is $i")
  }
  for (i <- z.until(x)) {
    //until prints until the max val
    println(f"until loop 4th option val is $i")
  }

  //concurrent for loop
  for (i <- z to x;  j<- z to 5) {
    println("concurrent/nested loop val is " + i +" "+ j)
  }

  /// LIST
  val lst = List(1,2,3,4)
  for(i <- lst ){
    println("loop from list "+i)
  }

/// foor loop with filter
  for (i <- lst; if i>=2 && i<=3) {
    println("filterd loop from list " + i)
  }


  ///using yeild expression to save result and return once
  var exp = for {i <- lst; if i<=2} /// {} this also works brruh for formatting!
    yield {
    i*2
  }
  println("squired expression result is= "+exp)

}
}
