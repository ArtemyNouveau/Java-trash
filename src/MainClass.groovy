import groovy.time.TimeCategory
import java.sql.*;

def java = new JavaClass()

println '--------------------------'
println "Lesson 1"
println ''

def firstClassGeneratedThroughNamedParameters
try {
    firstClassGeneratedThroughNamedParameters = new FirstClass(id: 1, title: "NamedParameters", isBlocked: false, rating: 32.2f)
} catch (Exception e) {
    println "we already have a constructor for this class"
}

def firstClassGeneratedThroughConstructor = new FirstClass(1, "ThroughConstructor", false, 32.2f)

def firstClassWithBindings = new FirstClass()
println firstClassWithBindings.binding.title
println firstClassGeneratedThroughNamedParameters.title
println firstClassGeneratedThroughNamedParameters.getTitle()
println firstClassGeneratedThroughConstructor.title

println "------------"

println "Integer instanceof String: ${5 instanceof String}"
println "String instanceof Integer ${"" instanceof Integer}"

java.instanceOfExample()

println "Method with final value without return: ${firstClassGeneratedThroughConstructor.getId()}"

println ''
println '--------------------------'
println "Lesson 2"
println ''

int methodReturnsInt(Integer a) { a }

Integer methodReturnsInteger(Integer a) { a }

try {
    println methodReturnsInt(null)
} catch (Exception e) {
    println "Method which returns int has failed"
}

try {
    println methodReturnsInteger(null)
} catch (Exception e) {
    println "Method which returns Integer has failed"
}

println "------------"

def bigDecimalFirst = new BigDecimal(5)
def bigDecimalSecond = new BigDecimal(5)

println "Are objects at the same memory address? ${System.identityHashCode(bigDecimalFirst) == System.identityHashCode(bigDecimalSecond)}"
println "bigDecimalFirst.equals(bigDecimalSecond) = ${bigDecimalFirst.equals(bigDecimalSecond)}"
println "bigDecimalFirst == bigDecimalSecond = ${bigDecimalFirst == bigDecimalSecond}"
println "bigDecimalFirst.compareTo(bigDecimalSecond) = ${bigDecimalFirst.compareTo(bigDecimalSecond)}"
println "bigDecimalFirst.add(bigDecimalSecond) = ${bigDecimalFirst.add(bigDecimalSecond)}"
println "bigDecimalFirst + bigDecimalSecond = ${bigDecimalFirst + bigDecimalSecond}"
println "bigDecimalFirst.divide(bigDecimalSecond) = ${bigDecimalFirst.divide(bigDecimalSecond)}"
println "bigDecimalFirst / bigDecimalSecond = ${bigDecimalFirst / bigDecimalSecond}"
println "bigDecimalFirst.multiply(bigDecimalSecond) = ${bigDecimalFirst.multiply(bigDecimalSecond)}"
println "bigDecimalFirst * bigDecimalSecond = ${bigDecimalFirst * bigDecimalSecond}"

println "---------------"
println 'JavaClass:'

java.bigDecimalExample()

println "---------------"

def exampleVariable = "first"
println "exampleVariable type: ${exampleVariable.getClass()}"
exampleVariable = 10
println "exampleVariable type: ${exampleVariable.getClass()}"
exampleVariable = 'f' as char
println "exampleVariable type: ${exampleVariable.getClass()}"

println ''
println '--------------------------'
println "Lesson 3"
println ''

def division = { a, b -> a / b }
println "15 / 3 = ${division(15, 3)}"

def substraction = { d, c -> d - c }
println "33 - 6 = ${substraction(33, 6)}"

def combined = { a, b, c -> substraction(division(a, b), c) }
println "15 / 3 - 10 = ${combined(15, 3, 10)}"

println ''
println '--------------------------'
println "Lesson 4"
println ''

Class.forName("org.postgresql.Driver");
def db = [url: "jdbc:postgresql://localhost:5432/itms", user: "postgres", password: "password"]
    def sql = groovy.sql.Sql.newInstance(db.url, db.user, db.password, "org.postgresql.Driver")
def rows = sql.rows('select * from Items')

println rows.join('\n')