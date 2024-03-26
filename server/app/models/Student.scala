package models

object Student {
    val src = scala.io.Source.fromFile("data/StudentData.csv")
    val iter = src.getLines().map(_.split(",")).toArray.drop(0)

}