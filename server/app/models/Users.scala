package models

object Users {
    val src = scala.io.Source.fromFile("../data/StudentData.csv")
    val iter = src.getLines().map(_.split(",")).head.map(_.split(" ")).head
}