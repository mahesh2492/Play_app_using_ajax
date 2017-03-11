
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Desktop/fuck/conf/routes
// @DATE:Sat Mar 11 18:00:05 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:15
  Login_4: controllers.Login,
  // @LINE:17
  Signup_3: controllers.Signup,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:15
    Login_4: controllers.Login,
    // @LINE:17
    Signup_3: controllers.Signup
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_5, Login_4, Signup_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_5, Login_4, Signup_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login.scala.html""", """controllers.Login.showForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup.scala.html""", """controllers.Signup.showForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPeople""", """controllers.Signup.addPerson(fname:String, mname:String, lname:String, uname:String, pass:String, repass:String, mobile:String, gender:String, age:String, hobbies:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showProfile""", """controllers.Login.processForm(uname:String, pass:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Login.showProfile(username:String)"""),
    ("""POST""", this.prefix, """controllers.HomeController.index"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
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
    CountController_0.count,
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
    AsyncController_2.message,
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
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_Login_showForm4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login.scala.html")))
  )
  private[this] lazy val controllers_Login_showForm4_invoker = createInvoker(
    Login_4.showForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "showForm",
      Nil,
      "GET",
      """""",
      this.prefix + """login.scala.html"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Signup_showForm5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup.scala.html")))
  )
  private[this] lazy val controllers_Signup_showForm5_invoker = createInvoker(
    Signup_3.showForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "showForm",
      Nil,
      "GET",
      """""",
      this.prefix + """signup.scala.html"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Signup_addPerson6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPeople")))
  )
  private[this] lazy val controllers_Signup_addPerson6_invoker = createInvoker(
    Signup_3.addPerson(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "addPerson",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """addPeople"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Login_processForm7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showProfile")))
  )
  private[this] lazy val controllers_Login_processForm7_invoker = createInvoker(
    Login_4.processForm(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "processForm",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """showProfile"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Login_showProfile8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Login_showProfile8_invoker = createInvoker(
    Login_4.showProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "showProfile",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_index9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index9_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "POST",
      """""",
      this.prefix + """"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_Login_showForm4_route(params) =>
      call { 
        controllers_Login_showForm4_invoker.call(Login_4.showForm)
      }
  
    // @LINE:17
    case controllers_Signup_showForm5_route(params) =>
      call { 
        controllers_Signup_showForm5_invoker.call(Signup_3.showForm)
      }
  
    // @LINE:19
    case controllers_Signup_addPerson6_route(params) =>
      call(params.fromQuery[String]("fname", None), params.fromQuery[String]("mname", None), params.fromQuery[String]("lname", None), params.fromQuery[String]("uname", None), params.fromQuery[String]("pass", None), params.fromQuery[String]("repass", None), params.fromQuery[String]("mobile", None), params.fromQuery[String]("gender", None), params.fromQuery[String]("age", None), params.fromQuery[String]("hobbies", None)) { (fname, mname, lname, uname, pass, repass, mobile, gender, age, hobbies) =>
        controllers_Signup_addPerson6_invoker.call(Signup_3.addPerson(fname, mname, lname, uname, pass, repass, mobile, gender, age, hobbies))
      }
  
    // @LINE:21
    case controllers_Login_processForm7_route(params) =>
      call(params.fromQuery[String]("uname", None), params.fromQuery[String]("pass", None)) { (uname, pass) =>
        controllers_Login_processForm7_invoker.call(Login_4.processForm(uname, pass))
      }
  
    // @LINE:23
    case controllers_Login_showProfile8_route(params) =>
      call(params.fromQuery[String]("username", None)) { (username) =>
        controllers_Login_showProfile8_invoker.call(Login_4.showProfile(username))
      }
  
    // @LINE:25
    case controllers_HomeController_index9_route(params) =>
      call { 
        controllers_HomeController_index9_invoker.call(HomeController_1.index)
      }
  }
}
