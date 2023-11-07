fun calculateEvenDigits(string: String): Int {
    var sum: Int = 0
    for (char in string){
        val digit = char.toString().toIntOrNull()
        if (digit!=null && digit%2==0){sum+=digit}
    }
    return sum
}

fun main(){
    println( calculateEvenDigits("2232cxsfd2"))
}