
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

class userinfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:Models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
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

<div class="row container"  >
    <table class="table table-bordered" style="text-align:center">
        <div style="text-align:center">
            <strong>
       <h>"""),_display_(/*22.12*/user/*22.16*/.fname),format.raw/*22.22*/("""</h>
        <h>"""),_display_(/*23.13*/user/*23.17*/.mname),format.raw/*23.23*/("""</h>
        <h>"""),_display_(/*24.13*/user/*24.17*/.lname),format.raw/*24.23*/("""</h>
            </strong>
        </div>
        <tbody>
        <tr class="success">
            <td>User Name</td>
            <td>"""),_display_(/*30.18*/user/*30.22*/.uname),format.raw/*30.28*/("""</td>
        </tr >
        <tr class="danger">
            <td>First Name</td>
            <td>"""),_display_(/*34.18*/user/*34.22*/.fname),format.raw/*34.28*/("""</td>
        </tr>
        <tr class="info">
            <td>Middle Name</td>
            <td>"""),_display_(/*38.18*/user/*38.22*/.mname),format.raw/*38.28*/("""</td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*42.18*/user/*42.22*/.lname),format.raw/*42.28*/("""</td>
        </tr>

        <tr class="warning">
            <td>Mobile</td>
            <td>"""),_display_(/*47.18*/user/*47.22*/.mobile),format.raw/*47.29*/("""</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>"""),_display_(/*51.18*/user/*51.22*/.gender),format.raw/*51.29*/("""</td>
        </tr>
        <tr class="active">
            <td>Age</td>
            <td>"""),_display_(/*55.18*/user/*55.22*/.age),format.raw/*55.26*/("""</td>
        </tr>
        <tr class="success">
            <td>Gender</td>
            <td>"""),_display_(/*59.18*/user/*59.22*/.gender),format.raw/*59.29*/("""</td>
        </tr>

        <tr class="info">
            <td>Hobbies</td>
            <td>"""),_display_(/*64.18*/user/*64.22*/.hobbies),format.raw/*64.30*/("""</td>
        </tr>


        </tbody>
    </table>

</div>
""")))}))
      }
    }
  }

  def render(user:Models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((Models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object userinfo extends userinfo_Scope0.userinfo
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 10:03:02 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/userinfo.scala.html
                  HASH: daf2206d79d1772ca445c3e7115cc9bd9c620d21
                  MATRIX: 538->1|651->19|678->21|691->27|730->29|757->30|997->243|1012->249|1054->270|1400->589|1413->593|1440->599|1484->616|1497->620|1524->626|1568->643|1581->647|1608->653|1770->788|1783->792|1810->798|1935->896|1948->900|1975->906|2098->1002|2111->1006|2138->1012|2246->1093|2259->1097|2286->1103|2408->1198|2421->1202|2449->1209|2554->1287|2567->1291|2595->1298|2712->1388|2725->1392|2750->1396|2871->1490|2884->1494|2912->1501|3032->1594|3045->1598|3074->1606
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|34->10|34->10|34->10|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|54->30|54->30|54->30|58->34|58->34|58->34|62->38|62->38|62->38|66->42|66->42|66->42|71->47|71->47|71->47|75->51|75->51|75->51|79->55|79->55|79->55|83->59|83->59|83->59|88->64|88->64|88->64
                  -- GENERATED --
              */
          