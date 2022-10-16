fun main(args: Array<String>) {

    //#1
  fun  printFullName(firstName:String="Roman",lastName:String="Semkin") = firstName +" "+ lastName

    //#2
    // val printFullName = String
     printFullName(firstName="Roman",lastName="Semkin")

        //#3
    fun calculateFullName( firstName:String,lastName:String):String{
        return firstName +" "+ lastName

    }

    //#4w
    val num = 29
    var flag = false
    for (i in 2..num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")

    //#5

        val n = 30  // количество элементов-значений последовательности Фибоначчи
        var a1 = 0
        var a2 = 1

        print("Первые $n значений последовательности Фибоначчи : ")
        println()
        for (i in 1..n) {
            print("$a1 + ")

            val sum = a1 + a2
            a1 = a2
            a2 = sum
            for (v in 1..10 step 10){
                println()}
        }

}