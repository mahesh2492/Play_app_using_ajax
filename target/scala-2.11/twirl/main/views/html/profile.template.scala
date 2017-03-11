
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[String,String,String,String,String,Long,String,Int,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String,firstname:String,middlename:String,lastname:String,username:String,mobile:Long,gender:String,age:Int,hobbies:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.134*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("stylesheets/css/bootstrap.min.css")),format.raw/*7.110*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("javascripts/js/jquery.min.js")),format.raw/*9.74*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/js/bootstrap.min.js")),format.raw/*10.77*/("""" type="text/javascript"></script>
</head>
<body>
<nav class="navbar navbar-inverse" >
    <div class="container-fluid" align="right">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"><img src=""""),_display_(/*16.57*/routes/*16.63*/.Assets.versioned("images/Knoldus.jpg")),format.raw/*16.102*/("""" height="35" width="100" id="audi" ></a>
        </div>
        <div align="right" style="color:white;">
Welcome """),_display_(/*19.10*/username),format.raw/*19.18*/(""" """),format.raw/*19.19*/("""&nbsp;<a href=""""),_display_(/*19.35*/routes/*19.41*/.FrontController.front()),format.raw/*19.65*/(""""><button>Logout</button></a>
        </div>

    </div>
</nav>
"""),_display_(/*24.2*/message),format.raw/*24.9*/("""<br>
<h1>User Details</h1>
<br>
First Name :&nbsp;&nbsp;&nbsp;&nbsp; <label>"""),_display_(/*27.46*/firstname),format.raw/*27.55*/("""</label><br><br>
Middle Name :&nbsp;&nbsp;&nbsp;&nbsp; <label>"""),_display_(/*28.47*/middlename),format.raw/*28.57*/("""</label><br><br>
Last Name :&nbsp;&nbsp;&nbsp;&nbsp; <label>"""),_display_(/*29.45*/lastname),format.raw/*29.53*/("""</label><br><br>
User Name :&nbsp;&nbsp;&nbsp;&nbsp; <label>"""),_display_(/*30.45*/username),format.raw/*30.53*/("""</label><br><br>
Mobile :&nbsp;&nbsp;&nbsp;&nbsp; <label>"""),_display_(/*31.42*/mobile),format.raw/*31.48*/("""</label><br><br>
Gender :&nbsp;&nbsp;&nbsp;&nbsp; <label>"""),_display_(/*32.42*/gender),format.raw/*32.48*/("""</label><br><br>
Age :&nbsp;&nbsp;&nbsp;&nbsp;    <label>"""),_display_(/*33.42*/age),format.raw/*33.45*/("""</label><br><br>
Hobbies :&nbsp;&nbsp;&nbsp;&nbsp; <label>"""),_display_(/*34.43*/hobbies),format.raw/*34.50*/("""</label><br><br>
</body>
</html>"""))
      }
    }
  }

  def render(message:String,firstname:String,middlename:String,lastname:String,username:String,mobile:Long,gender:String,age:Int,hobbies:String): play.twirl.api.HtmlFormat.Appendable = apply(message,firstname,middlename,lastname,username,mobile,gender,age,hobbies)

  def f:((String,String,String,String,String,Long,String,Int,String) => play.twirl.api.HtmlFormat.Appendable) = (message,firstname,middlename,lastname,username,mobile,gender,age,hobbies) => apply(message,firstname,middlename,lastname,username,mobile,gender,age,hobbies)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 09:37:07 IST 2017
                  SOURCE: /home/knoldus/Desktop/mahesh/Ajax-Play-Assignment/Play/app/views/profile.scala.html
                  HASH: 9a7b7c216f3deb2d2ac19b2ee3e82445d6a48321
                  MATRIX: 582->1|810->133|837->134|1004->275|1018->281|1093->335|1176->392|1190->398|1250->437|1297->458|1311->464|1380->513|1460->566|1475->572|1548->624|1802->851|1817->857|1878->896|2020->1011|2049->1019|2078->1020|2121->1036|2136->1042|2181->1066|2272->1131|2299->1138|2403->1215|2433->1224|2523->1287|2554->1297|2642->1358|2671->1366|2759->1427|2788->1435|2873->1493|2900->1499|2985->1557|3012->1563|3097->1621|3121->1624|3207->1683|3235->1690
                  LINES: 20->1|25->1|26->2|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|40->16|40->16|40->16|43->19|43->19|43->19|43->19|43->19|43->19|48->24|48->24|51->27|51->27|52->28|52->28|53->29|53->29|54->30|54->30|55->31|55->31|56->32|56->32|57->33|57->33|58->34|58->34
                  -- GENERATED --
              */
          