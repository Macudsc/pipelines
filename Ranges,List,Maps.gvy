def numbers = [0,'YYY',1,2,3,4]
println numbers[-2]

println ([1241,34,32423,['a','b','c'],342,6][3][1])

def str = [1241,34,32423,['a','b','c'],342,6]
println str.getAt(0..<2)

def str2 = 'qwerty'
println str2.substring(1,3)


numbers[0]=[1,0,1]
println numbers

numbers<<100
numbers<<1000

long s = 43
println (s<<1)

println numbers
println numbers + ['new','new']
println numbers-[3]
numbers.remove(3)
println numbers 

[100, 2000, 30000, 400000].each {
    println "Item: $it" // it - неявный параметр, соответствующий текущему элементу
}

['Valera', 'Vovan', 'Petro', 'Dmitro'].eachWithIndex { 
    it, i -> println "$i: $it"  // it — текущий элемент,  i — индекс
}

['p90','vector','m4'].eachWithIndex{
  it, i -> println "$i:$it"
}

def x = 1
def y = 2
def m = [x:y,y:x]
println m

def ooo = []
for(i in 1..4){ooo.add(i)}
println(ooo)

def att = ['first' : 100, 'second' : 500, 'last' : 999]

m = ['first' : 100, 'second' : 500, 'last' : 999]
m.put('age', 33) // добавит ключ : значение
println m.containsKey('age') // вернет true or false в зависимости есть ли ключ
println m.values().asList() // вернет список значений[100, 500, 999, 33]
println m.keySet() // вернет список ключей [first, second, last, age]
println m.size()  // вернет размер карты 4
println m.get('second') // вернет значения ключа second, т.е 500 

def map = [ Apple: 42,
            Raspberry: 54,
            Onion: 13,
            Pear: 70 ]
map.each { entry -> println "key: $entry.key | value: $entry.value" } // entry - это запись карты
map.eachWithIndex { 
    entry, i -> //  entry - это запись карты, i индекс на карте
    println "$i - Name: $entry.key Price: $entry.value" 
}
map.eachWithIndex { key, value, i -> // Ключ, значение и индекс 
    println "$i - Name: $key Price: $value"
}

numbers = "0123456789"
println numbers[1..7] // 1234567
println numbers[-1..1] // 987654321
println numbers[1..-1] // 123456789
println numbers[1..<7] // 123456