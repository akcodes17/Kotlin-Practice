/* Priority Table
1) ()
2) ++ -- (PRE)
3) ^
4) * /
5) + -
6) =
7) ++ -- (POST)
 */

fun main(args:Array<String>)
{
    var n1:Int=10
    var n2:Int=10
    var n3:Int=5
    var sum:Int?

    var m=n1+++n2
    sum=n1+n2*n3-3
    println("M is: $m")
    println("n1 is $n1")
    println("Sum is: $sum")

}
