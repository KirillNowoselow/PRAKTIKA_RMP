class SugarStorage(private var volume: Int) {
    init {
        if (volume < 0) {
            volume = 0
        }
    }
    fun decreaseSugar(v:Int){
        if (v >= 0) {
            volume -= v
            if (volume < 0) {
                volume = 0
            }
        }
    }
    fun increaseSugar(v:Int){
        if (v >= 0) {
            volume += v
        }
    }
}