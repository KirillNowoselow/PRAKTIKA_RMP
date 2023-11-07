fun getYearEra(year: Int): String {
    return when {
        year < 1970 -> "до"
        year == 1970 -> "соответствует"
        year <= 1999 -> "после (XX век)"
        year <= 2099 -> "после (XXI век)"
        else -> "далекое будущее"
    }
}

fun main(){
    println( getYearEra(22212))
}