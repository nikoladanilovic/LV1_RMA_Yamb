import kotlin.random.Random
import java.util.Scanner

fun main(){
    // Test za provjere za jamb, poker i skalu

    var player = Player()
    var hand1 = player.getHand()

    hand1.roll()
    hand1.checkState()

    hand1.getDiceList().get(0).setDiceValue(6)
    hand1.getDiceList().get(1).setDiceValue(2)
    hand1.getDiceList().get(2).setDiceValue(2)
    hand1.getDiceList().get(3).setDiceValue(3)
    hand1.getDiceList().get(4).setDiceValue(4)
    hand1.getDiceList().get(5).setDiceValue(5)

    hand1.checkState()

    println(player.isScored())

}