
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userinfo_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class userinfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Models.User,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:Models.User)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
"""),_display_(/*2.2*/main()/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
"""),format.raw/*3.1*/("""<nav class="navbar navbar-inverse ">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">User Information</a>
        </div>


        <form action=""""),_display_(/*10.24*/routes/*10.30*/.HomeController.index),format.raw/*10.51*/("""" method="post">
            <button class="btn btn-danger navbar-btn navbar-right ">Logout</button>
        </form>
        </div>
</nav>

<br><br>

<div class="row text-center" style="margin-top:20px; border-radius:5px;">
    <div class="col-md-3" ></div>
    <div class="col-md-6 "style=" background-color:#CD5C5C;border-radius:10px;" ><h2>"""),_display_(/*20.87*/user/*20.91*/.fname),format.raw/*20.97*/(""" """),_display_(/*20.99*/user/*20.103*/.mname),format.raw/*20.109*/(""" """),_display_(/*20.111*/user/*20.115*/.lname),format.raw/*20.121*/(""" """),format.raw/*20.122*/("""</h2></div>
    <div class="col-md-3" ></div>
</div>


<div class="row text-center" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 " style ="background-color:#808080; border-radius:10px;"><h3>"""),_display_(/*27.88*/user/*27.92*/.uname),format.raw/*27.98*/("""</h3></div>
    <div class="col-md-4" ></div>
</div>
<div class="row text-center" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 "style ="background-color:#F08080; border-radius:10px;" ><h3>"""),_display_(/*32.88*/user/*32.92*/.mobile),format.raw/*32.99*/("""</h3></div>
    <div class="col-md-4" ></div>
</div>
<div class="row text-center" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4" style ="background-color:#E9967A; border-radius:10px;" ><h3>"""),_display_(/*37.88*/user/*37.92*/.gender),format.raw/*37.99*/(""" """),format.raw/*37.100*/(""", """),_display_(/*37.103*/user/*37.107*/.age),format.raw/*37.111*/("""</h3></div>
    <div class="col-md-4" ></div>
</div>
<div class="row text-center" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 "style ="background-color:#FFA07A; border-radius:10px;" ><h3>"""),_display_(/*42.88*/user/*42.92*/.hobbies),format.raw/*42.100*/("""</h3></div>
    <div class="col-md-4" ></div>
</div>
""")))}))
      }
    }
  }

  def render(user:Models.User,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(user)(request)

  def f:((Models.User) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request) => apply(user)(request)

  def ref: this.type = this

}


}

/**/
object userinfo extends userinfo_Scope0.userinfo
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 20:13:08 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/userinfo.scala.html
                  HASH: 4caa2471026e3213152342a84cf2d8080966b90c
                  MATRIX: 552->1|698->52|725->54|738->60|777->62|804->63|1044->276|1059->282|1101->303|1472->647|1485->651|1512->657|1541->659|1555->663|1583->669|1613->671|1627->675|1655->681|1685->682|1943->913|1956->917|1983->923|2239->1152|2252->1156|2280->1163|2536->1392|2549->1396|2577->1403|2607->1404|2638->1407|2652->1411|2678->1415|2934->1644|2947->1648|2977->1656
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|34->10|34->10|34->10|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|51->27|51->27|51->27|56->32|56->32|56->32|61->37|61->37|61->37|61->37|61->37|61->37|61->37|66->42|66->42|66->42
                  -- GENERATED --
              */
          