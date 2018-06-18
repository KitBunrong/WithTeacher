//  Get input from user "peace" and print it as "pc" 
/// and number of vowels is 2.
object MainObject{
    def main(args:Array[String]){
        println("Enter some text : ")
        var b = scala.io.StdIn.readLine()
        var a = b.toLowerCase()
        var anum:Int = 0
        var enum:Int = 0
        var inum:Int = 0
        var onum:Int = 0
        var unum:Int = 0
        var atem:Int = 0
        var etem:Int = 0
        var item:Int = 0
        var otem:Int = 0
        var utem:Int = 0
        var countVowel:Int = 0 
        for(c <- a){
            if(c == 'a'){
               anum = anum + 1 
            }else if(c == 'e'){
               enum = enum + 1
            }else if(c == 'i'){
                inum = inum + 1
            }else if(c == 'o'){
                onum = onum + 1
            }else if(c == 'u'){
                unum = unum + 1
            }
            else{
                print("The consonant is : " +c)
            }
        }
        if(anum != 0){
            atem = 1
        }
        if(enum != 0){
            etem = 1
        }
        if(inum != 0){
            item = 1
        }
        if(onum != 0){
            otem = 1
        }
        if(unum != 0){
            utem = 1
        }
        countVowel = atem + etem + item + otem + utem 
        println("Vowel "+countVowel)
    }
}