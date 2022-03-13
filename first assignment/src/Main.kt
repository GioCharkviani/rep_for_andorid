fun main() {

    println(palindromeIsGiven("ana"))
    println(palindromeIsGiven("jksdhfiodsh"))
    println(sum(arrayOf(1,2,5,7,12)))

}
fun palindromeIsGiven(name1:String):Boolean
{
    var name2:String = ""
    for (i in 0 until  name1.length) {
        name2 += name1[name1.length-1-i]

    }
    if (name1.equals(name2))
    {
        return true
    }
    return false
}
fun sum(masivi:Array<Int>):Int
{
    var sum:Int = 0
    for (i in 0 until masivi.size step 2)
    {
        sum+=masivi[i]
    }
    return sum
}