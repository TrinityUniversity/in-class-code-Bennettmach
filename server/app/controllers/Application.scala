package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import models.NBATeams
//import models.Users

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
    Ok(views.html.favCol("test","test"))
  }

  def color(name: String, color: String) = Action {
      Ok(views.html.favCol(name,color))
  }

  // def postColor = Action { request =>
  //   val postvals = request.body.asFormUrlEncoded
  //   print(Users.iter)
  //   postvals.map { args => 
  //     val name = args("name").head
  //     val color = args("color").head
  //     Ok(views.html.favCol(name, color))
  //   }.getOrElse(Ok("something went wrong"))
  // }

  def load = Action { implicit request =>
    Ok(views.html.react())  
  }

}

