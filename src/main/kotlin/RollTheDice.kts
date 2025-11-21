import kotlin.random.Random

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241129
 */

fun main() {

    val aDie = Random

    val playerScore = aDie.nextInt(1,7)
    val computerScore = aDie.nextInt(1,7)

    println("Gebe deinen Namen ein")
    var nameAnfrage: String = readln()

    // Todo: Den Fehler im Programm finden und beheben
    // Todo: Den Spieler nach dem Namen fragen
    // Todo: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat

    var breakGame : String = "Ja"


    while (breakGame.equals("ja", ignoreCase = true)) {

        println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
        when {
            playerScore > computerScore -> println("$nameAnfrage gewinnt")
            playerScore < computerScore -> println("Der Computer gewinnt")
            else -> println("Unentschieden")
        }
        println("Möchtest du weiter Spielen ? (Ja/Nein)")

        breakGame = readln()
    }

}

main()