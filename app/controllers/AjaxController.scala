package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}
import play.twirl.api.Html

/**
  * Created by knoldus on 4/3/17.
  */
class AjaxController @Inject() extends Controller {

  def front = Action {implicit request=>

    Ok(views.html.front(request)).withNewSession
  }
  def ajaxCall = Action { implicit request =>
    Ok(views.html.signup())
  }

  def ajaxCall1 = Action { implicit request =>
    Ok(views.html.login())
  }

}