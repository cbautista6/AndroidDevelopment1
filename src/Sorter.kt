

fun bubbleSort(numbers: Array<Int>){

    for (pass in 0 until (numbers.size-1)){

        for(ogPosition in 0 until (numbers.size-1)){

            if(numbers[ogPosition] > numbers[ogPosition + 1]){
                val temp = numbers[ogPosition]
                numbers[ogPosition] = numbers[ogPosition + 1]
                numbers[ogPosition + 1]=temp
            }

        }

    }

}