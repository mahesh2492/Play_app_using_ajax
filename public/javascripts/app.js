$(document).ready(function() {

     $('#front').click(function(e) {
          frontCall();
    });
    $('#a').click(function(e) {
      ajaxCall();
    });
    $('#b').click(function(e) {
      ajaxCall1();
   });
});

var ajaxCall = function() {
    var ajaxCallBack = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.AjaxController.ajaxCall().ajax(ajaxCallBack);
};

var ajaxCall1 = function() {
    var ajaxCallBack1 = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.AjaxController.ajaxCall1().ajax(ajaxCallBack1);
};

