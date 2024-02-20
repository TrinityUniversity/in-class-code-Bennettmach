package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import models.NBATeams

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def test213 = Action {
    Ok(views.html.test213(SharedMessages.itWorks))
  }

  def getNBATable(col: String) = Action {
    val colNum = NBATeams.tableHeader.indexOf(col)
    println(col)
    Ok(views.html.nbaTable(NBATeams.tableHeader, NBATeams.tableData.sortBy(row => row(colNum))))
  }

  def getInfo = Action {
      Ok(views.html.favCol())
  }

  def color(name: String, color: String) = Action {
      Ok(s"$name's favorite color is $color")
  }

}
