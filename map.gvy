def map = [:]

map."first nme" = "Valera pidor"
map."sasik" = 11

println map."first nme"
println map."sasik"
println map

byte b = 1
char c = 97
short s = 3
int i = 4
long l = 5
BigInteger bi = 6

println b
println c
println s
println i
println l
println bi

byte XXX = 0b11
println XXX + "---" + (XXX == 3)

int DDD = 0b10101111
println DDD + "---" + (DDD == 175)

short SS = 011
println SS

int AR = 0x77
println "AR = " + AR

float f = 1.234
double d = 2.345
println  f + " --- " + d

println Byte.MIN_VALUE  
println Byte.MAX_VALUE
println Short.MIN_VALUE
println Short.MAX_VALUE
println Integer.MIN_VALUE
println Integer.MAX_VALUE
println Long.MIN_VALUE
println Long.MAX_VALUE 
println Float.MIN_VALUE
println Float.MAX_VALUE 
println Double.MIN_VALUE
println Double.MAX_VALUE

float ii = 1e3
println ii

def bol = true
boolean BO = false

def a = 9223372036854775808
println (a instanceof BigInteger)

import FirstClass from FirstClass.gvy
def gvy = new FirstClass()
println gvy 