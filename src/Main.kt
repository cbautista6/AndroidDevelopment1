import java.util.Random

fun main(args: Array<String>){
    var num:Int=0
    var valid:Boolean=false;

    while(!valid){

        try{
            print("Enter integer from 1-15: ")
            num = readLine()!!.toInt()

            if(num in 1..15){
                valid=true
        }
            else{
                print("Invalid input. ")
             }
        }
        catch (e:NumberFormatException){
            print("Invalid input. ")

        }
    }

    val random = Random()
    println(List(num) {random.nextInt(0..9)})
}