
fun mean(numbers: Array<Int>):Float{
    var sum = 0.0
    var num:Int?
    var mean:Float?

    for (index in 0..(numbers.size-1)){
        num = numbers[index]
        sum += num
    }
    mean=sum.toFloat()/(numbers.size).toFloat()
    return mean
}

fun mode(numbers: Array<Int>):Int{
    var maxVal = 0
    var maxCount = 0

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

fun median(numbers: Array<Int>):Double{

    val mid = numbers.size / 2
    return if (numbers.size % 2 === 1) {
        numbers[mid].toDouble()
    } else {
        (numbers[mid - 1].toDouble() + numbers[mid]) / 2.0
    }

}