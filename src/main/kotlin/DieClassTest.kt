import kotlin.random.Random
import java.util.Scanner

fun main(){

    //test za Die klasu

    var die1 = Die(1)
    var die2 = Die(2)
    var die3 = Die(1)
    var die4 = Die(2)
    var die5 = Die(1)
    var die6 = Die(2)

    die1.checkState()
    die6.checkState()

    die1.roll()
    die2.roll()
    die6.roll()

    die1.checkState()
    die2.checkState()
    die6.checkState()

}