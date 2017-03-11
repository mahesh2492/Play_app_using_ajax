
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Desktop/fuck/conf/routes
// @DATE:Sat Mar 11 18:00:05 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseLogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def showForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.showForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login.scala.html"})
        }
      """
    )
  
    // @LINE:23
    def showProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.showProfile",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username0)])})
        }
      """
    )
  
    // @LINE:21
    def processForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.processForm",
      """
        function(uname0,pass1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "showProfile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uname", uname0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pass", pass1)])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def showForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.showForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup.scala.html"})
        }
      """
    )
  
    // @LINE:19
    def addPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.addPerson",
      """
        function(fname0,mname1,lname2,uname3,pass4,repass5,mobile6,gender7,age8,hobbies9) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addPeople" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("fname", fname0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("mname", mname1), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lname", lname2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uname", uname3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pass", pass4), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("repass", repass5), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("mobile", mobile6), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("gender", gender7), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("age", age8), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("hobbies", hobbies9)])})
        }
      """
    )
  
  }


}
