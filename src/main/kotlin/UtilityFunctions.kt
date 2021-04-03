
class UtilityFunctions {
    companion object{
        //extracts numbers of dies to be locked from non separated input format that is used in the game
        fun getNumbersFromNonSeparatedFormat(num : Int) : MutableList<Int>{
            var listOfNumbers = mutableListOf<Int>()
            var numberDice = num
            while(numberDice > 0){
                listOfNumbers.add(numberDice % 10)
                numberDice /= 10
            }
            return listOfNumbers
        }

        //applies extracted numbers on dies in hand to be locked or unlocked (numbers are to be extracted by getNumbersFromNonSeparatedFormat() function)
        fun applyListOfDiceNumbersToBeLocked(listOfNum : MutableList<Int>, player : Player){
            for(diceNum in listOfNum){
                player.getHand().lockUnlock(diceNum)
            }
        }
    }
}
