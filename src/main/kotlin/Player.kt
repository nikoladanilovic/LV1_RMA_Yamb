class Player {
    private var hand : Hand
    private var results : ResultCheck

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

    fun getHand() : Hand {
        return this.hand
    }

    fun setHand(hand1 : Hand) {
        this.hand = hand1
    }
}