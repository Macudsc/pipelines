def word = "string!"
println 'Slabaya stroka ><$word><'
println "Strong $word"

println "a" + "b"

println 'c $word'
println '''
d
d
d
'''
println "e $word"
println """
f $word
f $word
f $word
"""

println 'text \' text'
println "an escaped escape character: \\ needs a double backslash"
println 'Japan currency symbol: \u2C0A'

println 'tt\ttt'
println '12\b34'
println 'nn\nnn'
println '123444444\r56'
println '122222222\f344444444\f5666666666'
println '//\'//'
println '//\"//'
println '//\\//'


def step = 'Zalutal grinkartu!'
println step[7] + 'huh?'
println step[-1]
println step[10]

println step[1..8]
println step[1..<8]
println step[10..1]
println step[0,4,8,11]


def str = "HHHHLO"
println str.size()
println str.length()
println str.count("H")
println str.contains("L")

def MyList = [0,1,2,3,4]
println MyList.size()
//println MyList.length()

def baseop = 'Study Mayak Farming'
println 'Hello' + 'enof==========='
println 'xD'*4
println baseop - 'Mayak '
println baseop.size()
println baseop.length()
println baseop.count('a')
println baseop.contains("ing")

//comparison
println 'MP7 dorogo :(' <=> 'MP7 dorogo :(' //равны
println 'Kriss Vector' <=> 'MP7 dorogo :(' //левое больше
println 'p90' <=> 'P90' //правое больше
//println ('p90' == 'p90')
println 'aug'.compareTo('Aug')
println "aug".equals("aug")

String a = 'center';
println(a.center(80))
println(a.center(40))
println(a.center(20))

String str1 = "This Is Demo"; 
String str2 = "THIS IS DEMO"; 
String str3 = "THIS Is Demo test";

println str1.compareToIgnoreCase(str2); 
println str2.compareToIgnoreCase(str3); 
println str3.compareToIgnoreCase(str1);

str1 = "This is "
str1 = str1.concat("DEMO")
println str1

str1 = "This is DEmos"
str1.eachMatch("i") {
    d -> println d
}


String s = "This is demo"
println s.endsWith("o")
println s.endsWith("demo")
println "this is test".endsWith("estr")

str1 = "Hello"; 
str2 = "HELLO"; 
println str1.equalsIgnoreCase(str2)

str1 = "This is groovy lang!"; 
println str1.getAt(8)
println str1.getAt(0)
println str1.getAt(-1)

str1 = "This is groovy lang!"; 
println str1.indexOf('T')
println str1.indexOf('i')
// int indexOf(string str, int fromIndex) 
println str1.indexOf("oo", 5)

str1 = "The price is \$9"
println str1
println str1.minus("\$9")


str1 = "The price is 105"
println "ff".next()
println "this is groovy".next()
println "The price is 101".next()
println str1.next()


str1 = "hello"
println str1.plus(" world")


str1 = "This is groovy lang"
println str1
println str1.replaceAll("y lang","e street family")

str1 = "This is groovy lang"
println str1
println str1.reverse()


str1 = "This is groovy-lang"
println str1.split('-')
println str1.split('-')[0]
println str1.split('-')[1]

str1 = "This is groovy lang"
println str1
println str1.substring(8)
println str1.substring(8, 15)

println "Hello World".toUpperCase()


str1 = "GO WRITE YAML"
println str1.toLowerCase()


/*
Строки, созданные с помощью одинарной кавычки ('), не поддерживают интерполяцию
Слэши и тройные или двойными кавычками могут быть многострочными
Многострочные строки содержат пробельные символы из-за отступа кода
Обратный слэш (\) используется для экранирования специальных символов в каждом типе, кроме строки с слэша доллара, где мы должны использовать доллар ($) для экранирования
*/

println 'Study Stepik'.substring(6, 'Study Stepik'.size())

def sss = 'ABCDEFGHIJKLMNOPQRSTUVWXYZAFA'
println sss.indexOf('A', 3)