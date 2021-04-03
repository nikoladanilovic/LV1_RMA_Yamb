

class Hand {
    private var dices = mutableListOf<Die>()
    private var lockedDices = mutableListOf<Boolean>()

    constructor(){
        for(i in 1..6){
            this.dices.add(Die(1))
            this.lockedDices.add(false)
        }
    }

    fun roll(){
        var iterator = dices.listIterator()

        for(dice in iterator){
            if(lockedDices.elementAt(iterator.nextIndex()-1).not()) {
                dice.roll()
            }
        }
    }

    fun getDiceList() : MutableList<Die>{
        return this.dices
    }

    // Method for locking dice values. Every time it is being used on same dice, it will change the property of the given dice from locked
    // to unlocked, and vice versa (in an alternating fashion). When used for the first time, it will just lock the dice value with a given index.
    fun lockUnlock(diceNumber: Int){
        if(diceNumber >= 1 && diceNumber <= 6) {
            lockedDices.set(diceNumber-1, lockedDices[diceNumber - 1].not())         //promjenio sam iz lockedDices.set(diceNumber-1, true)
        }
    }

    fun checkState(){
        var num : Int
        var iterator = dices.listIterator()
        for(dice in iterator){
            //println(dice.getDiceValue())
            num = dice.getDiceValue()
            print("$num ")
        }
        print("\n")
    }

    fun resetHand(){
        for(i in 0..5){
            lockedDices[i] = false
        }
        this.roll()
    }
}
