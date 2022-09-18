class match_expr {
var age=29;
  age match{
    case 20=> println("not 20")
    case 30=> println("not 30")
    case 29=> println("yes 29")
    case _ => println("Default") //underscore means defualt
  }

  for(i <- 0 to 5 ){
    i match{
      case 1 | 3 | 5 => println("odd") // pipe means or, checking even odd
      case 0 | 2 |4 => println("Even")
    }
  }
}
