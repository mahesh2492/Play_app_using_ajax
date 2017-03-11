
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/css/bootstrap.min.css")),format.raw/*3.106*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(/*4.51*/routes/*4.57*/.Assets.versioned("images/favicon.png")),format.raw/*4.96*/("""">
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/js/jquery.min.js")),format.raw/*5.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*6.19*/routes/*6.25*/.Assets.versioned("javascripts/js/bootstrap.min.js")),format.raw/*6.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/app.js")),format.raw/*7.60*/("""" type="text/javascript"></script>

<nav class="navbar navbar-inverse" >
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand"><img src=""""),_display_(/*12.48*/routes/*12.54*/.Assets.versioned("images/Knoldus.jpg")),format.raw/*12.93*/("""" height="35" width="100" id="audi" ></a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a id="front">Home</a></li>
            <li><a id="signin">Sign In</a></li>
            <li><a id="signup">Sign Up</a></li>
        </ul>
    </div>
</nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 09:37:07 IST 2017
                  SOURCE: /home/knoldus/Desktop/mahesh/Ajax-Play-Assignment/Play/app/views/header.scala.html
                  HASH: cc2ffb5591e918da640909a8ff489c3c8756165a
                  MATRIX: 522->1|618->3|646->5|717->50|731->56|806->110|885->163|899->169|958->208|1001->225|1015->231|1084->280|1163->333|1177->339|1249->391|1324->440|1338->446|1397->485|1614->675|1629->681|1689->720
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|36->12|36->12|36->12
                  -- GENERATED --
              */
          