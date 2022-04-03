fun main() {
    //1
    oddNums(1)
    //2
var names=arrayOfNames(arrayOf("Jessica","Joane","Nancvida","Collete"))
println(names)
    //3
    drinkType(5)
    drinkType(11)
    drinkType(17)
    //4
    getNUms()

}
    //1
fun oddNums(num:Int) {
    for (num in 1..100)
        if (num%2 !== 0)
            println(listOf(num))
}
    //2
fun arrayOfNames(name:Array<String>):Int{
        var output=0
        name.forEach { x->
            if (x.length>5){
            output++
        }

        }
        return output
}
   //3
fun drinkType(age:Int){
        if (age <= 6){
            println("drink glass of milk")
}
    //4
else if (age>6 && age<15){
    println("drink fanta orange")
}
else{
println("get cocacola")
        }
}
fun getNUms() {
    for(x in 1..100){
        if(x%3==0){
            println("Fizz")
        }
        else if (x%5==0){
            println("Buzz")
        }
        else if (x%3==0 && x%5==0){
            println("FizzBuzz")
        }
        else{
            println(x)
        }
    }
}






