fun main(){
    println("Hey")
    add(6,2)
    square(5)
    displayName(arrayOf("phelisa","cudra","swabrina"))
    chartostring(arrayOf())
    vow(arrayOf())
    datatypes()
    arraywithloop()
    program(8,9)


}
fun add (num:Int,num2:Int){
    var plus =num+num2
    println(plus)
}
fun square (sq1:Int){
    var square=sq1
    square*=sq1
    println(square)

}
fun displayName(names:Array<String>){
    names.forEach { pri->
        println(pri)

    }

}
fun chartostring(chars:Array<String>){
    var cha='c'
    var string = Character.toString(cha)
    println(string)

}
fun vow(vowels: Array<String>) {

    var irabu = charArrayOf('a', 'e', 'i', 'o', 'u')
    var take= String(irabu)
    println(take)
    var gari=mobile("adroid","oppo","200")
     println( gari .model)
    println(gari.brand)
    println(gari.mrp)
    var mtu =user("lynette","jepchumba",20)
    println(mtu.age)
    println(mtu.fullname)
    var mwajiri=employee("harmony","harmony@gmail.com","Posta")
    println(mwajiri.name)
    println(mwajiri.email)
    println(mwajiri.company)
    program(8,9)

}


class mobile(var model:String,var brand:String,var mrp:String ){
}
class user (var firstName:String , var lastName:String , var age:Int){
    var fullname=firstName+lastName



}
class  employee (var name:String, var email: String,var company:String){

}

fun datatypes(){
    var subject =5
    var  marks=47.5
    var names ="Deepak"
    println("${subject::class.simpleName}")
    println("${marks::class.simpleName}")
    println("${names::class.simpleName}")


}
fun arraywithloop(){
    var int = arrayOf(1,2,3,4,5)
    int.forEach { num->
        println(num)

    }
}
fun program(ad:Int,ad2:Int){
var together=ad+ad2
    println(together)

}

