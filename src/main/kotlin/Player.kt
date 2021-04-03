class Player {
    var hand : Hand
    var results : ResultCheck

    constructor(){
        this.hand = Hand()
        this.results = ResultCheck()
    }

    fun isScored() : Int {
        return this.results.isScored(hand)
    }

    fun roll(){
        this.hand.roll()
    }

    fun checkState(){
        this.hand.checkState()
    }
}