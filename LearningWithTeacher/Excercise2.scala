//  Get input from user "peace" and print it as "pc" 
/// and number of vowels is 2.
object MainObject{
    def main(args:Array[String]){
        println("Enter some text : ")
        var b = scala.io.StdIn.readLine()
        var a = b.toLowerCase()
        for(c <- a){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){

            }else{
                println(c)
            }
        }
        println("Vowel "+num)
    }
}
