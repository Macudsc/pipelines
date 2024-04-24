/*
Шпаргалка значений ключевых слов:
try – блок кода, в котором может произойти исключение
catch – блок кода, в котором происходит обработка исключения
finally – блок кода, который является необязательным, но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.
throw – используется для возбуждения исключения
throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.
*/

def a = "err"

println a

try {
  throw NumberFormatException
  println '0xb3'.toLong()   // это вызовет исключение
  println 'finished'
} catch (eggg) {
    println eggg
    println eggg.getMessage()
    //println e.printStackTrace()
} 
//catch() {
//} 
finally {
  println "Yea"
}


println a + 'fin'
println '//==============================='

def msg = 'empty'
try {
    def cc = 5, b = 0
    try {
        def k = cc / b
        println("never reached due")        
    } finally {
        msg = "It's ok"  //always executed even if Exception thrown
    }
} catch ( e ) {
    println(e) // java.lang.ArithmeticException: Division by zero
    println(msg) // It's ok
}

try {
    /* ... */
    def aa = null
    println a.length()
} catch ( IOException | NullPointerException e ) {
    println "blin"
    // один блок для обработки 2 исключений
}