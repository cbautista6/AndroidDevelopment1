import java.util.*

fun main(args: Array<String>){
    val random = Random()
    var num = 0
    var valid = false

    while(!valid){
        try{
            print("Enter integer from 1-15: ")
            num = readLine()!!.toInt()

            if(num in 1..15){
                valid = true
        }
            else{
                print("Invalid input. ")
             }
        }
        catch (e:NumberFormatException){
            print("Invalid input. ")
        }
    }

    //add random integers to array
    var arrayInt=Array<Int>(num){0}
    for(item in 0..(num-1)){
        arrayInt[item] = random.nextInt(0..9)
    }

    //Ascending order
    bubbleSort(arrayInt)
    println("Sorted Array: " + Arrays.toString(arrayInt))

    //Mean
    println("Mean: " + "%.3f".format(mean(arrayInt)))

    //Mode
    println("Mode: " + mode(arrayInt))

    //Median
    println("Median: " + median(arrayInt))

}