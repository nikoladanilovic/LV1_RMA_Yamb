
class SmallScaleCheck  {
    //number of times it has been scored by a player
    var isScored : Int

    constructor(){
        this.isScored = 0
    }


    fun isRoled(dice : Hand) : Boolean{
        var checkValue = 0
        var listOfDiceNumbers = mutableListOf<Int>()

        for(i in 1..6){
            listOfDiceNumbers.add(dice.getDiceList().get(i-1).getDiceValue())
        }

        for(i in 1..5){
            if(listOfDiceNumbers.indexOf(i) >= 0){
                checkValue += 1
            }
        }

        if(checkValue >= 5){
            this.isScored += 1
            return true
        }
        return false
    }

}
