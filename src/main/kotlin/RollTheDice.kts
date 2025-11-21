import kotlin.random.Random

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241129
 */

fun main() {

    println("Gebe deinen Namen ein")
    var name: String = readln()

    // Todo: Ausgeben, wer mehr Runden gewonnen hat

    var breakGame : String = "Ja"
    var wincomputer = 0
    var winuser = 0

    while (breakGame.equals("ja", ignoreCase = true)) {

        val aDie = Random
        val playerScore = aDie.nextInt(1,7)
        val computerScore = aDie.nextInt(1,7)

        println(name + " würfelt: $playerScore  --  Computer würfelt: $computerScore")
        when {
            playerScore > computerScore ->{
                winuser += 1
                println("$name gewinnt")
            }
            playerScore < computerScore -> {
                wincomputer += 1
                println("Der Computer gewinnt")
            }
            else -> println("Unentschieden")
        }
        println("Möchtest du weiter Spielen ? (Ja/Nein)")

        breakGame = readln()
    }

    println(name + " hat $winuser mal gewonnen")
    println("Computer hat $wincomputer mal gewonnen")

}

main()