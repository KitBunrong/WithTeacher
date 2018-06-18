object MainObject{
    def main(arg: Array[String]){
        println("The result is : "+factorial(5))
    }

    def factorial(n:Int):Int = n match {
        case 0 => 1
        case _ => n * factorial(n-1)
    }
}