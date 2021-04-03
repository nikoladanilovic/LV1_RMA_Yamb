class ResultCheck {
    companion object{
        fun isScored(dice : Hand) : Int {
            if(YambCheck.isRoled(dice))
                return 1
            else if(PokerCheck.isRoled(dice))
                return 2
            else if(BigScaleCheck.isRoled(dice))
                return 3
            else if(SmallScaleCheck.isRoled(dice))
                return 4
            else
                return 5
        }
    }
}