fun calculateBugMentions(text: List<String>): Int {
    var count: Int = 0
    for (string in text){
        val word = string.split("BUG").size - 1
        count += word
    }
    return count
}

fun main(){
    println( calculateBugMentions(listOf("2232cxsfd2", "32BUG")))
}