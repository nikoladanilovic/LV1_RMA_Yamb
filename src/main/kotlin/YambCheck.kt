
class YambCheck {
    var isScored : Boolean

    constructor(isScored : Boolean){
        this.isScored = isScored
    }

    companion object{
        fun isRoled(dice : Hand) : Boolean{
            var checkValue1 = 0
            var listOfDiceNumbers = mutableListOf<Int>()

            for(i in 1..6){
                listOfDiceNumbers.add(dice.getDiceList().get(i-1).getDiceValue())
            }

            //var iterator = listOfDiceNumbers.listIterator()

            for(i in 1..6){
                for(numOfDie in listOfDiceNumbers){
                    if (numOfDie == i){
                        checkValue1 += 1
                    }
                }
                if(checkValue1 >= 5){
                    return true
                }
                checkValue1 = 0
            }
            return false
        }
    }

}