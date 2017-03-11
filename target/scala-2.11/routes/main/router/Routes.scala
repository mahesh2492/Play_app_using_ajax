
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Desktop/mahesh/Ajax-Play-Assignment/Play/conf/routes
// @DATE:Sat Mar 11 09:37:07 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  FrontController_0: controllers.FrontController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_4: controllers.AsyncController,
  // @LINE:13
  Assets_7: controllers.Assets,
  // @LINE:15
  SignupController_3: controllers.SignupController,
  // @LINE:19
  SigninController_8: controllers.SigninController,
  // @LINE:23
  ProfileController_6: controllers.ProfileController,
  // @LINE:25
  JavascriptRoute_5: controllers.JavascriptRoute,
  // @LINE:31
  DetailController_2: controllers.DetailController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    FrontController_0: controllers.FrontController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_4: controllers.AsyncController,
    // @LINE:13
    Assets_7: controllers.Assets,
    // @LINE:15
    SignupController_3: controllers.SignupController,
    // @LINE:19
    SigninController_8: controllers.SigninController,
    // @LINE:23
    ProfileController_6: controllers.ProfileController,
    // @LINE:25
    JavascriptRoute_5: controllers.JavascriptRoute,
    // @LINE:31
    DetailController_2: controllers.DetailController
  ) = this(errorHandler, FrontController_0, CountController_1, AsyncController_4, Assets_7, SignupController_3, SigninController_8, ProfileController_6, JavascriptRoute_5, DetailController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FrontController_0, CountController_1, AsyncController_4, Assets_7, SignupController_3, SigninController_8, ProfileController_6, JavascriptRoute_5, DetailController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.FrontController.front"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignupController.default"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignupController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.SigninController.default"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.SigninController.check"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.default"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """javascriptRoutes""", """controllers.JavascriptRoute.javascriptRoutes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.FrontController.signin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.FrontController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """details""", """controllers.DetailController.detail"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_FrontController_front0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_FrontController_front0_invoker = createInvoker(
    FrontController_0.front,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontController",
      "front",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_4.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_SignupController_default4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignupController_default4_invoker = createInvoker(
    SignupController_3.default,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignupController",
      "default",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_SignupController_store5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignupController_store5_invoker = createInvoker(
    SignupController_3.store,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignupController",
      "store",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_SigninController_default6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_SigninController_default6_invoker = createInvoker(
    SigninController_8.default,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SigninController",
      "default",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_SigninController_check7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_SigninController_check7_invoker = createInvoker(
    SigninController_8.check,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SigninController",
      "check",
      Nil,
      "POST",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ProfileController_default8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_default8_invoker = createInvoker(
    ProfileController_6.default,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "default",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_JavascriptRoute_javascriptRoutes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascriptRoutes")))
  )
  private[this] lazy val controllers_JavascriptRoute_javascriptRoutes9_invoker = createInvoker(
    JavascriptRoute_5.javascriptRoutes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JavascriptRoute",
      "javascriptRoutes",
      Nil,
      "GET",
      """""",
      this.prefix + """javascriptRoutes"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_FrontController_signin10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_FrontController_signin10_invoker = createInvoker(
    FrontController_0.signin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontController",
      "signin",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_FrontController_signup11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_FrontController_signup11_invoker = createInvoker(
    FrontController_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_DetailController_detail12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("details")))
  )
  private[this] lazy val controllers_DetailController_detail12_invoker = createInvoker(
    DetailController_2.detail,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DetailController",
      "detail",
      Nil,
      "GET",
      """""",
      this.prefix + """details"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_FrontController_front0_route(params) =>
      call { 
        controllers_FrontController_front0_invoker.call(FrontController_0.front)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_SignupController_default4_route(params) =>
      call { 
        controllers_SignupController_default4_invoker.call(SignupController_3.default)
      }
  
    // @LINE:17
    case controllers_SignupController_store5_route(params) =>
      call { 
        controllers_SignupController_store5_invoker.call(SignupController_3.store)
      }
  
    // @LINE:19
    case controllers_SigninController_default6_route(params) =>
      call { 
        controllers_SigninController_default6_invoker.call(SigninController_8.default)
      }
  
    // @LINE:21
    case controllers_SigninController_check7_route(params) =>
      call { 
        controllers_SigninController_check7_invoker.call(SigninController_8.check)
      }
  
    // @LINE:23
    case controllers_ProfileController_default8_route(params) =>
      call { 
        controllers_ProfileController_default8_invoker.call(ProfileController_6.default)
      }
  
    // @LINE:25
    case controllers_JavascriptRoute_javascriptRoutes9_route(params) =>
      call { 
        controllers_JavascriptRoute_javascriptRoutes9_invoker.call(JavascriptRoute_5.javascriptRoutes)
      }
  
    // @LINE:27
    case controllers_FrontController_signin10_route(params) =>
      call { 
        controllers_FrontController_signin10_invoker.call(FrontController_0.signin)
      }
  
    // @LINE:29
    case controllers_FrontController_signup11_route(params) =>
      call { 
        controllers_FrontController_signup11_invoker.call(FrontController_0.signup)
      }
  
    // @LINE:31
    case controllers_DetailController_detail12_route(params) =>
      call { 
        controllers_DetailController_detail12_invoker.call(DetailController_2.detail)
      }
  }
}
