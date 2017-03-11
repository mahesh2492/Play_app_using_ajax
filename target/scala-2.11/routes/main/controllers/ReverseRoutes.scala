
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Desktop/fuck/conf/routes
// @DATE:Sat Mar 11 18:00:05 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:15
  class ReverseLogin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def showForm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login.scala.html")
    }
  
    // @LINE:23
    def showProfile(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)))))
    }
  
    // @LINE:21
    def processForm(uname:String, pass:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "showProfile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("uname", uname)), Some(implicitly[QueryStringBindable[String]].unbind("pass", pass)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:17
  class ReverseSignup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def showForm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup.scala.html")
    }
  
    // @LINE:19
    def addPerson(fname:String, mname:String, lname:String, uname:String, pass:String, repass:String, mobile:String, gender:String, age:String, hobbies:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addPeople" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("fname", fname)), Some(implicitly[QueryStringBindable[String]].unbind("mname", mname)), Some(implicitly[QueryStringBindable[String]].unbind("lname", lname)), Some(implicitly[QueryStringBindable[String]].unbind("uname", uname)), Some(implicitly[QueryStringBindable[String]].unbind("pass", pass)), Some(implicitly[QueryStringBindable[String]].unbind("repass", repass)), Some(implicitly[QueryStringBindable[String]].unbind("mobile", mobile)), Some(implicitly[QueryStringBindable[String]].unbind("gender", gender)), Some(implicitly[QueryStringBindable[String]].unbind("age", age)), Some(implicitly[QueryStringBindable[String]].unbind("hobbies", hobbies)))))
    }
  
  }


}
