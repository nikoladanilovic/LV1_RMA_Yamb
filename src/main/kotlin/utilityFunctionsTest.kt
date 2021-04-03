import kotlin.random.Random
import java.util.Scanner

fun main(){
    //test za utility function -- iz testa se zakljucilo da se dva puta mora upisivati u
    // input kako bi se ucitala zeljena vrijednost


    var numbr : String
    var num : Int

    print("Unesi brojeve \n")
    numbr = readLine()!!
    num = numbr.toInt()

    var listdicenum : MutableList<Int>

    listdicenum = UtilityFunctions.getNumbersFromNonSeparatedFormat(num)


    for(i in 0..4){
        print(listdicenum[i])
    }

}