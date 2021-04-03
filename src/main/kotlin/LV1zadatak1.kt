import kotlin.random.Random
import java.util.Scanner

fun main(){

    //Igra jamba

    var hand1 = Hand()
    var gameIsOn = true
    var scoreHand1 = 0
    var gameValues : Int
    var dicesToBeLocked : Int
    val reader = Scanner(System.`in`)

    println("Dobro dosli u igru jamba.")
    println("Pravila igre su da se pomocu kontrola moraju vrtit kockice te je cilj dobiti\n" +
            "5 istih (jamb), 4 iste (poker) ili 5 za redom kockica (skala - mala i velika). Treba imati na\n" +
            "umu da zbog nekog bug-a u intelliJ-u , kada se trazi unos nekog broja, potrebno\n" +
            "je ponekad dva puta unijeti zeljeni broj kako bi se pravilno ucitao. Igru igra\n" +
            "jedan igrac, te u svakoj rundi igrac ce imati priliku 3 puta zavrtit kocke. i birati \n" +
            "koje zeli vrijednosti kocke ocuvati, kako bi dobio zeljene kombinacije.")

    while(gameIsOn){
        println("\nNOVA RUNDA!!!")
        println("/////////////////////////////////////////////////////////\n\n")

        for(gameIteratorValue in 1..3){     //Jedna runda igre (naizmjenicna igra dva igraca)
            println("Unesi koju radnju zelis napraviti pomocu jednog broja:")
            println("1 - vrti kockice, a zatim mozes upisati redne brojeve kockica koje zelis zakljucati ili otkljucati")
            println("2 - napusti igru")

            gameValues = reader.nextInt()

            when(gameValues){
                1 -> {
                    hand1.roll()
                    hand1.checkState()

                    println("Unesi u spojenom formatu, znaci bez razmaka, redne brojeve kocki koje zelis zakljucati, \n" +
                            "ili ako si zakljucao vec, okljucati. Nije bitan redosljed. Npr, za zakljucavanje prve i druge \n" +
                            "kocke moze se napisati 12 ili 21, jedino bitno da se zeljeni redni broj kocke samo jednom napise. \n" +
                            "ako se ne zeli mijenjati zakljucanost niti jedne kocke, moze se samo nula upisati.")
                    dicesToBeLocked = reader.nextInt()
                    UtilityFunctions.applyListOfDiceNumbersToBeLocked(UtilityFunctions.getNumbersFromNonSeparatedFormat(dicesToBeLocked),hand1)


                }

                else -> {
                    gameIsOn = false
                    println("Igra je zavrsena!!")
                    break
                }
            }
        }

        //pregled rezultata

        when(ResultCheck.isScored(hand1)){
            1 -> {
                scoreHand1 += 50
                println("Dobiven je jamb, dobili ste 50 bodova, sada ukupno imate $scoreHand1 bodova")
            }
            2 -> {
                scoreHand1 += 40
                println("Dobiven je poker, dobili ste 40 bodova, sada ukupno imate $scoreHand1 bodova")
            }
            3 -> {
                scoreHand1 += 45
                println("Dobivena je velika skala, dobili ste 45 bodova, sada ukupno imate $scoreHand1 bodova")
            }
            4 -> {
                scoreHand1 += 35
                println("Dobivena je mala skala, dobili ste 35 bodova, sada ukupno imate $scoreHand1 bodova")
            }
            else -> {
                println("Niste nista uspjeli dobiti u ovoj rundi, zasad imate ukupno $scoreHand1 bodova.")
            }

        }

        hand1.resetHand()

    }
    println("Skupljeni bodovi su: $scoreHand1")


}

