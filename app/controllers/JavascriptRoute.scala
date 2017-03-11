package controllers

import play.api.data
import play.api.mvc.{Action, Controller}
import play.api.routing.JavaScriptReverseRouter

class JavascriptRoute extends Controller {

  def javascriptRoutes = Action {implicit request =>

    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        //routes.javascript.AjaxController.front,
        routes.javascript.AjaxController.signin,
        routes.javascript.AjaxController.signup

      )
    ).as("text/javascript")
  }
}