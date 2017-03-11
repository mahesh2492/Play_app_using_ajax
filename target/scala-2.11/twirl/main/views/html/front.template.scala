
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object front_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class front extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Knoldus Software LLP</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/css/bootstrap.min.css")),format.raw/*8.110*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/js/jquery.min.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("javascripts/js/bootstrap.min.js")),format.raw/*11.77*/("""" type="text/javascript"></script>

    <script type="text/javascript" src=""""),_display_(/*13.42*/routes/*13.48*/.JavascriptRoute.javascriptRoutes),format.raw/*13.81*/(""""></script>

</head>
<body>
"""),_display_(/*17.2*/header()),format.raw/*17.10*/("""
"""),format.raw/*18.1*/("""<div id="data">
    Functional Programming . Reactive Applications . Big Data . Business Solutions<br><br>

    Knoldus is a team of Passionate Technologists, focused on staying at the edge of the curve. We love to build Scalable, Performant, Concurrent systems with Functional Programming to meet the needs of the business. Our big data solutions have won accolades in domains like Social media analytics, Finance, Healthcare, Gaming, Shipping and Media. Our proactive thinking, led by the mission of Authority enables us to deliver Business Innovation & Acceleration to help you succeed.
    <br><br>
    <h4>Technologies</h4><br><br>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-6">
            <img src=""""),_display_(/*26.24*/routes/*26.30*/.Assets.versioned("images/scala.jpg")),format.raw/*26.67*/("""" height="35" width="100">
        </div><br>
        <div class="col-xs-12 col-sm-12 col-md-6">
            <img src=""""),_display_(/*29.24*/routes/*29.30*/.Assets.versioned("images/play.png")),format.raw/*29.66*/("""" height="35" width="100">
        </div><br>
        <div class="col-xs-12 col-sm-12 col-md-6">
            <img src=""""),_display_(/*32.24*/routes/*32.30*/.Assets.versioned("images/akka.png")),format.raw/*32.66*/("""" height="35" width="100">
        </div><br>
        <div class="col-xs-12 col-sm-12 col-md-6">
            <img src=""""),_display_(/*35.24*/routes/*35.30*/.Assets.versioned("images/spark.jpg")),format.raw/*35.67*/("""" height="35" width="100">
        </div><br>
    </div><br><br>
    <strong>and many more...</strong>
</div>
</body>
</html>"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


}

/**/
object front extends front_Scope0.front
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 09:37:07 IST 2017
                  SOURCE: /home/knoldus/Desktop/mahesh/Ajax-Play-Assignment/Play/app/views/front.scala.html
                  HASH: a30b9afb802d91ac42680968720f0560e4a813a1
                  MATRIX: 534->1|662->34|690->36|872->192|886->198|961->252|1044->309|1058->315|1118->354|1166->375|1181->381|1251->430|1331->483|1346->489|1419->541|1523->618|1538->624|1592->657|1647->686|1676->694|1704->695|2464->1428|2479->1434|2537->1471|2684->1591|2699->1597|2756->1633|2903->1753|2918->1759|2975->1795|3122->1915|3137->1921|3195->1958
                  LINES: 20->1|25->1|27->3|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|37->13|37->13|37->13|41->17|41->17|42->18|50->26|50->26|50->26|53->29|53->29|53->29|56->32|56->32|56->32|59->35|59->35|59->35
                  -- GENERATED --
              */
          