def newMethod () {
  println "Welcum!"
}

newMethod()

def method2 (par1 = 2, par2 = 1){ 
  println par1 >= par2 ? 'Nice' : 'bad'
}

method2(4, 6)
method2()

def method3 (int a = 1, float b = 2){
  println 'next string'
  a + b
}

println method3(6, 1)

def someMethod() { 'method called' }                 // метод без объявленного возвращаемого типа и параметра                       
String anotherMethod() { 'another method called' }   // метод с явным типом возврата и без параметра       
def thirdMethod(param1) { "$param1 passed" }         // метод с параметром без определенного типа                
static String fourthMethod(String param1) {          // статический метод со строковым параметром
"$param1 passed" 
} 


def user(Map args) { "${args.name}: ${args.password}" }
println user(name: 'Alex', password: 1234)


def user(Map args, Integer id) { println "${args.name}: ${args.password}, #ID is ${id}" }

user(name: 'Alex', password: 1234, 1) // Вызов метода с доп числовым аргументом типа Integer

user(2, name: 'Petro', password: 3909) // Вызов метода с измененным порядком следования аргументов

def user(Integer number, Map args) { "${args.name}: ${args.age}, and the number is ${number}" }
user(3, [name: 'Max', password: 1])

def check(Object... args) { args.length
  println args
}
println check() == 0 // true
println check(1) == 1 // true
println check(1, 2) == 2 // true

def check2(Object[] args)  { args.length 
println args
}
println check2() == 0 // true
println check2(1) == 1 // true
println check2(1, 2) == 2 // true

def check3(Object[] args)  { args }
assert check3(null) == null   // true

def foo(Object... args) { args }
Integer[] ints = [1, 2]
assert foo(ints) == [1, 2]
println foo(1, 2)