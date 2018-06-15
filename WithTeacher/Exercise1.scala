// Input 6: it should be print 0 1 1 2 3 5 8 

object MainObject{
    def main(args: Array[String]){
        var i:Int=0
        println("Enter a number: ")
        //  use to get input from user, but in here i minus
        /// it by 1.
        var n = (scala.io.StdIn.readInt() -1):Int
        println("The result is : ")
        //  using for loop for getting print each of result 
        /// because function that we use it return only the 
        /// last result.
        for(i<-0 to n)
        {
            // calling function 
            print(fac(i))
            // give space for each number
            print(" ")
        
        }
    }

    //  = is used for return, and variable num have to 
    /// match with the variable inside parameter,
    /// match keyword is used like switch case in C.  
    def fac(num:Int):Int = num match{
        case 0 => 0
        case 1 => 1
        //  _ default meat that if it does match with any
        /// above case it will go to this one.
        case _ => (fac(num-1)+fac(num-2))
        
    }
}