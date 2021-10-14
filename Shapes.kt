fun main() {
 // Square Variables
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "
  // Write your code below
  for( i in 1..sqSide){
    for( j in 1..sqSide){
    if((i % 2 == 0 && j % 2 == 0)||(i % 2 == 1 && j % 2 == 1)){
      print(sqChar1)
    }else{
      print(sqChar2)
    }
  }
   println()
  }


}
