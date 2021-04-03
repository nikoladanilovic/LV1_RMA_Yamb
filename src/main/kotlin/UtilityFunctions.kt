
class UtilityFunctions {
    companion object{
        fun getNumbersFromNonSeparatedFormat(num : Int) : MutableList<Int>{
            var listOfNumbers = mutableListOf<Int>()
            var numberDice = num
            while(numberDice > 0){
                listOfNumbers.add(numberDice % 10)
                numberDice /= 10
            }
            return listOfNumbers
        }

        fun applyListOfDiceNumbersToBeLocked(listOfNum : MutableList<Int>, hand : Hand){
            for(diceNum in listOfNum){
                hand.lockUnlock(diceNum)
            }
        }
    }
}
