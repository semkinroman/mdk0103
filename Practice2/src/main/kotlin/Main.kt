fun main(args: Array<String>) {

  //#1
  val  age1:Int =42;
    val age2:Int=21; // Ctrl+Shift+P = Tyre is unknown

  //#2 //#3
      val avg1:Double
      avg1 = (age1+age2)/2.0
println(avg1)
  //#4

 val firstName:String="Roman"
 val lastName:String="Semkin"

//#5
  val fullName:String
  fullName=firstName+" "+lastName
  println(fullName)

  //#6
  val myDetails:String = "Привет, меня зовут "+fullName
  println(myDetails)

  //#7
 //fun Triple(a:Int,b:Int,c:Int):
    //val Triple = Triple(2, 3, 1)
   // val (x3, y3, z3) = Triple
    val Triple = Triple(2, 3, 2015)
    //#8
   // val month = Triple.first
   // val day = Triple.second
   // val year = Triple.third
  //#9
    var (month, _, year) = Triple

    //#10

    month = 7
    val updatedTriple = Pair(month, year)

//semkin roman
}

