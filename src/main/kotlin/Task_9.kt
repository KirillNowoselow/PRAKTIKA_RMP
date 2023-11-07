class SimpleClass {
    private var name: String = ""
    private var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun calculateEvenDigits(string: String): Int {
        var sum: Int = 0
        for (char in string){
            val digit = char.toString().toIntOrNull()
            if (digit!=null && digit%2==0){sum+=digit}
        }
        return sum
    }
}