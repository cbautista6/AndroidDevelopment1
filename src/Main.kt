import java.util.Random

fun main(args: Array<String>){

    print("Enter integer from 1-15: ")
    var num:Int= readLine()!!.toInt()

    while(num !in 1..15){
        print("Invalid input. Enter integer from 1-15: ")
        num= readLine()!!.toInt()
    }


    val random = Random()
    println(List(num) {random.nextInt(0..9)})



}