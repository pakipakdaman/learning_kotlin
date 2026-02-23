/*fun main(){
    val num1 : Int = 15
    val num2 : Int = 4
    val pi : Double = 3.14159
    val num3 : Double = 2.1
    println("${num1+num2}")
    println("${num1-num2}")
    println("${num1* num2}")
    println("${num1/num2}")
    println("${pi/num3}")
    println("${pi%num3}")
    println("${pi*2}")




}*/
fun main(){
    println("number:")
    val number = readLine()?.toIntOrNull()
    if (number is Int){
        println("$number")
        if (number > 100 || number < 1){
            println("out of range")
        }else{
            when {
                number%2 == 0 -> println("زوج")
                else -> println("فرد")
            }
            var number2 = 0
            for (i in 1 until number+1 step 1){
                if (i%2 == 0){
                    number2 += i
                }
            }
            println("$number2")
            var i = 1
            var number3 = 0
            while (i <= number){
                number3 += i
                i++
            }
            var number4: Long = 1
            var j = 1
            do {
                number4 = number4 * j
                j++
            }
                while(j<= number)
            println("$number4")
            }
        }

    else{
        println("error")
    }

}