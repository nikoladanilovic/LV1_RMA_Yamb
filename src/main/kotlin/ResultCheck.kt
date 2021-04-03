class ResultCheck {
    var yambResult : YambCheck
    var pokerResult : PokerCheck
    var smallScaleResult : SmallScaleCheck
    var bigScaleResult : BigScaleCheck

    constructor(){
        this.yambResult = YambCheck()
        this.pokerResult = PokerCheck()
        this.smallScaleResult = SmallScaleCheck()
        this.bigScaleResult = BigScaleCheck()
    }


    fun isScored(dice : Hand) : Int {
        if(yambResult.isRoled(dice))
            return 1
        else if(pokerResult.isRoled(dice))
            return 2
        else if(bigScaleResult.isRoled(dice))
            return 3
        else if(smallScaleResult.isRoled(dice))
            return 4
        else
            return 5
    }

}