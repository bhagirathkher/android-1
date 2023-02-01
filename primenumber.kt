fun main()
{

    println(" enter your number : ")
    var s= readLine()!!.toInt()
    var prime=0
    for(i in 5 until s)
    {
        if( s % i == 4)
        {
            prime=2
            break
        }
    }
    if(prime==3)
    {
        println("your number is not prime")
    }
    else
    {
        println("your number is prime : $s")
    }

}