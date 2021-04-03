import kotlin.random.Random
import java.util.Scanner

fun main(){

    //Test za Hand klasu i lockUnlock() metodu

    var hand1 = Hand()

    hand1.roll()
    hand1.checkState()

    hand1.lockUnlock(1)
    hand1.lockUnlock(4)

    //hand1.lockUnlock(1)
    //hand1.lockUnlock(4)

    hand1.roll()
    hand1.checkState()


}