 $(document).ready(function(){

 $('#a').on("click",function(){

          jsRoutes.controllers.Signup.showForm().ajax({
                       success: function(data){
                         $('body').html(data);
                       },
                       error: function(){
                       $('#body').html("hello");
                       alert("fail")
                     }

           })



       });

       $('#b').on("click",function(){
                 jsRoutes.controllers.Login.showForm().ajax({
                             success: function(data){
                               $('body').html(data);
                             },
                             error: function(){
                             $('#body').html("hello");
                             alert("fail")
                           }

                 })


             });


 $('#submit').unbind().on("click",function(){
               jsRoutes.controllers.Signup.addPerson(
                                $('#fname').val(),
                                $('#mname').val(),
                                $('#lname').val(),
                                $('#uname').val(),
                                $('#pass').val(),
                                $('#repass').val(),
                                $('#mobile').val(),
                                $('input[name = gender]:checked','#signup').val(),
                                $('#age').val(),
                                 $('input[name = hobbies]:checked','#signup').val()
                ).ajax({
                            success: function(data){
                              $('body').html(data);
                            },
                            error: function(){
                            alert("Oops! Something went wrong");
                          }

                })

                     return false;
            });


 $('#submit2').unbind().on("click",function(){
               jsRoutes.controllers.Login.processForm(
                                $('#uname').val(),
                                $('#pass').val()
                ).ajax({
                            success: function(data){
                              $('body').html(data);
                            },
                            error: function(){
                            alert("Oops! Something went wrong");
                          }

                })

                     return false;
            });

 });