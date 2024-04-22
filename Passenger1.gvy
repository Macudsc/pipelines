class Passenger {
    /** Фамилия и имя типа String */
    String firstName
    String lastName

    /**
     * Это метод hello
     *
     * @param принимает строку
     * @return возвращает строку
     */
    String hello() {
       println "Hello ${firstName} ${lastName}"
    }
}

Passenger p = new Passenger()
p.firstName = "Alex"
p.lastName = "Fox"
p.hello()