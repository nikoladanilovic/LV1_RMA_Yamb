
class BigScaleCheck  {
    var isScored : Boolean

    constructor(isScored : Boolean){
        this.isScored = isScored
    }

    companion object{
        fun isRoled(dice : Hand) : Boolean{
            var checkValue = 0
            var listOfDiceNumbers = mutableListOf<Int>()

            for(i in 1..6){
                listOfDiceNumbers.add(dice.getDiceList().get(i-1).getDiceValue())
            }

            for(i in 2..6){
                if(listOfDiceNumbers.indexOf(i) >= 0){
                    checkValue += 1
                }
            }

            if(checkValue >= 5){
                return true
            }
            return false
        }
    }

}
