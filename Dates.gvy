Date date = new Date()
println(date)

date = new Date(1000000000)
println(date)

date = new Date("06/10/2024")
//date = new Date("09/10/2024")
Date date2 = new Date("09/10/2024")
println (date.equals(date2))

println date.getTime()
date.setTime(100000000)
println date