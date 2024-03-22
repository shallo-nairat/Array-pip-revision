fun main() {

names("Mary","Hawa","Kur","")
addTwoNumbers(30,50)

 println( word("hawah"))


    // given the array below find the minimum value
    var numbers= arrayOf(50,60,30,80,10)
    println(numbers.minOrNull())

    //give the max value
    println(numbers.maxOrNull())

    //give the total sum of the array
    println(numbers.sum())
    //give the average of the array
    println(numbers.average())

    numbers=numbers.sortedArray()
    println(numbers.contentToString())

    numbers=numbers.sortedArrayDescending()
    println(numbers.contentToString())
}
////Create a function that takes in 4 strings and create an array out of them
//then prints out the array
fun names (a:String,b:String,c:String,d:String){
    var nameArray= arrayOf("a","b","c","d")
    println(nameArray.contentToString())


   println(nameArray.contentToString())
}
//create a function that takes in two intergers  and returns it sum
fun addTwoNumbers(num1:Int,num2:Int):Int{
    val sum = num1+num2
    println(sum)
    return sum
}
//write a function that takes in a string and returns its length
fun word (word:String):Int{
    val text = word.length
    return text
}

