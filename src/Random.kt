import java.util.Random

fun Random.nextInt(range: IntRange): Int {
    return range.start + nextInt(range.last - range.start)
}