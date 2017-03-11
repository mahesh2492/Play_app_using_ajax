package controllers

import javax.inject._
import Models.{User, UserSignIn, Operations}
import play.api._
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import services.CacheTrait

@Singleton
class Login @Inject()(cacheService: CacheTrait) extends Controller{

  val userForm: Form[UserSignIn] = Form {
    mapping(
      "username" -> nonEmptyText,
      "password" -> nonEmptyText


    )(UserSignIn.apply)(UserSignIn.unapply)
  }
  val users = Operations.getUsers

  def showProfile(name:String) = Action {implicit request =>
    val data: Option[User] =cacheService.getFromCache(name)
    data match {
      case Some(x) => Ok(views.html.userinfo(x))

    }
  }



  def showForm() = Action { implicit request =>
    Ok(views.html.login()).flashing("a" ->"a")
  }


  def processForm(uname:String,pass:String) = Action { implicit request =>

    val data = cacheService.getFromCache(uname)

    val result = data.map(x =>

      if (x.uname == uname && x.password == pass) true
      else false
    )

    if (result.contains(true)) {
      Redirect(routes.Login.showProfile(uname)).withSession("currentUser" ->uname).flashing("msg" -> "Login Successful")
    }
    else
      Redirect(routes.Login.showForm()).flashing("msg" -> "Incorrect username or password")
  }


}
