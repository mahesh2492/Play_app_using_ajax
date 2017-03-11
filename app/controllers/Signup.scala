package controllers
import play.api.Logger
import javax.inject._
import Models.{Operations, User}
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import services.CacheTrait

@Singleton
class Signup @Inject()(cacheService: CacheTrait) extends Controller{

//  val userForm: Form[User] = Form {
//    mapping(
//      "fname" -> nonEmptyText,
//      "mname" -> text,
//      "lname" -> nonEmptyText,
//      "uname" -> nonEmptyText,
//      "password" -> nonEmptyText,
//      "repassword" -> nonEmptyText,
//      "mobile" -> nonEmptyText,
//      "gender" ->nonEmptyText,
//      "age" -> number(min = 18, max = 75),
//      "hobbies" -> nonEmptyText
//
//    )(User.apply)(User.unapply)
//  }



  def showForm() = Action { implicit request =>
    Ok(views.html.signup()).flashing("a" ->"a")
  }


  def addPerson(fname:String,mname:String,lname:String,uname:String,pass:String,repass:String,mobile:String,gender:String,age:String,hobbies: String)= Action { implicit request =>


    val user = User(fname, mname, lname, uname, pass, repass, mobile, gender, age.toInt, hobbies)
    if (cacheService.getFromCache(uname) == None) {

      if (pass == repass) {

        if (mobile.length == 10) {
          cacheService.addToCache(uname, user)
          Redirect(routes.Login.showProfile(uname)).withSession("currentUser" -> uname)
        }
        else {
          println("mobile")
          Redirect(routes.Signup.showForm()).flashing("mobile" -> "Invalid Mobile Number")
        }
      }
      else { println("pswd")
        Redirect(routes.Signup.showForm()).flashing("PasswordMismatch" -> "Pasword dosent Match")
      }
    }
    else {
      println("uname")
      Redirect(routes.Signup.showForm()).flashing("alreadyExist" -> "Username Already Taken")

    }
  }


}