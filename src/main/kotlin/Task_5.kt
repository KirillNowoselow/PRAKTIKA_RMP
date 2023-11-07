fun sugarСourse(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    val result: Int = ((dayNumber * bugRank) + 42) * cashAmount
    return result
}

fun main(){
    println( sugarСourse(3,5,10))
}