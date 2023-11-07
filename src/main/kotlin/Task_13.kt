fun getCubeList(n: Int): List<Int> {
    val cubeList = mutableListOf<Int>()
    for (i in 0 until n) {
        val cube = i * i * i
        cubeList.add(cube)
    }
    return cubeList
}

fun main(){
    val cubes = getCubeList(115)
    println(cubes)
}

