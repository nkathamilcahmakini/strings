fun main(){
   school()
    stmt("Sally", 17)
    length()
    boolean("Sally")
    boolean("Favour")
}

fun school(){
    var school = "AkiraChix"
   var s = println(school[1])
    var t = println(school[3])
    var u = println(school[4])
    println("s"+"t"+"u")

}
fun stmt(name: String, age: Int){
    println("Hi, my name is $name and I am $age years old")

}

fun length(){
    var txt = "Smart"
    println(txt.length)
}

fun boolean(name: String){
    if (name=="Favour")
        println("That`s me!")
    else
        println("I don`t know who that is")



}
