package com.scala.oops

object PracticeOpps extends App{
    val author = new Writer("Jhon", "Wick", 1842)
    val imposter = new Writer("Jhon", "Wick", 1842)
    val novel = new Novel("Day Dreams", 1861, author)


    println(author.fullName)
    println(author.writerAge)

    println(novel.authorAge)
    println(novel.wirttenBy(author))
    println(novel.wirttenBy(imposter))

    print(novel.copy(1993))
}
//Writer class
class Writer(firstName: String, lastName: String, val year: Int)
{
    def fullName: String = firstName + " " + lastName
    def writerAge = year
}
//Novel class
class Novel(name: String, year: Int, author: Writer)
{
    def authorAge =  year - author.year
    def wirttenBy(author: Writer) = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


