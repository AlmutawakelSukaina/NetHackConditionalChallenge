fun main()
{
    var healthPoints=100;
    val playerName="Madrigal"
    var Aura=" "
    var PlayerStatus=""
    val Karma=(Math.pow(Math.random(),(110-healthPoints)/100.0)*20).toInt()


    if (healthPoints==100)
        println("Madrigal is excellent condition!")
    else if(healthPoints in 90..99)
        println("Madrigal has a few scratches !")
    else if(healthPoints in 75..89) {
        println("Madrigal has some minor wounds!")

    }
    else if(healthPoints in 15..75)
        println("Madrigal looks pretty hurt!")
    else if(healthPoints in 0..14)
        println("Madrigal is in awful condition!")

    var isBlessed =true;
    isBlessed=healthPoints>=75

    if(isBlessed)
        println("has some minor wounds but is healing quite quickly")

    else
        println("has some minor wounds ")


    println(playerName+" "+healthPoints)


    if(Karma in 0..5)
        Aura="red"
    else if (Karma in 6..10)
        Aura="orange"
    else if(Karma in 11..15)
        Aura="purple"
    else if(Karma in 16..20)
        Aura="green"

    if(Aura=="green")
        PlayerStatus="displayed"
    else
        PlayerStatus="Not displayed"

    println(PlayerStatus)

}