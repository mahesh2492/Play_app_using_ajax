package controllers

import play.api.data
import play.api.mvc.{Action, Controller}
import play.api.routing.JavaScriptReverseRouter

class JavascriptRoute extends Controller {

  def javascriptRoutes = Action {implicit request =>

    Ok(
      JavaScriptReverseRouter("jsRoutes")(
       // routes.javascript.AjaxController.front,
        routes.javascript.AjaxController.ajaxCall,
        routes.javascript.AjaxController.ajaxCall1

      )
    ).as("text/javascript")
  }
}