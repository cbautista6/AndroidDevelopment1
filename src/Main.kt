import java.util.*

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
 //   println(List(num) {random.nextInt(0..9)}) <-- sloth method lol

    var arrayInt=Array<Int>(num){0}
    for(item in 0..(num-1)){
        arrayInt[item]=random.nextInt(0..9)
    }
    print(Arrays.toString(arrayInt))


}