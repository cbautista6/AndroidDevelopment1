import java.util.*

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

fun mode(numbers: Array<Int>):Int{

    var maxVal:Int=0
    var maxCount:Int=0

    for (a in 0 until numbers.size) {
        var count = 0
        for (b in 0 until numbers.size) {
            if (numbers[b] == numbers[a])
                ++count
        }
        if (count > maxCount) {
            maxCount = count
            maxVal = numbers[a]
        }
    }

    return maxVal

}