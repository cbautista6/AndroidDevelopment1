

fun mean(numbers: Array<Int>):Float{
    var sum:Double=0.0
    var num:Int=0
    var mean:Float?

    for (index in 0..(numbers.size-1)){
        num=numbers[index]
        sum=sum+num
    }

    mean=sum.toFloat()/(numbers.size).toFloat()
    return mean
}