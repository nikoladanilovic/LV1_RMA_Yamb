import kotlin.random.Random

class Die {
    private var diceValue : Int

    constructor(state: Int){
        this.diceValue = state
    }

    fun roll(){
        this.diceValue = Random.nextInt(1, 7)
    }

    fun setDiceValue(value: Int) {
        this.diceValue = value
    }

    fun getDiceValue() : Int {
        return diceValue
    }

    fun checkState(){
        println(this.diceValue)
    }
}