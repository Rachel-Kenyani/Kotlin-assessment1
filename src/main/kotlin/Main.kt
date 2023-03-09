import java.util.Collections

fun main() {
text("Prison","Break")

    var figure=numbers(23,4,30,100)

    words("Made")

    people("doctor","developer","nurse")

    var operate=arithmetic(50,25)
    operate.addition()
    operate.subtraction()
    operate.division()
    operate.multiplication()
}
fun text(name1:String,name2:String):Char{
    var statement=name1.first()
    var statement2=name2.first()
  if(name1>=name2){
      return statement
  }
  else{
        return  statement2
    }
}

fun numbers(num1:Int,num2:Int,num3:Int,num4:Int):Array<Int>{
    var smallest=numbers.min()
    var largest=numbers.max()
    var average=numbers.average()
}

fun words(name:String){
    var change=name[1]
    println(change)

}
fun people(name1:String,name2:String,name3:String){
    var first=arrayOf(name1,name2,name3)
    var second=first.toString()
    println(second.toString())
}

class arithmetic(var num1: Int,var num2: Int){
    fun addition(){
        var add=num1+num2
        println(add)
    }
    fun subtraction(){
        var sub=num1-num2
        println(sub)
    }
    fun division(){
        var div=num1/num2
        println(div)
    }
    fun multiplication(){
        var multiply=num1*num2
        println(multiply)
    }
}





















