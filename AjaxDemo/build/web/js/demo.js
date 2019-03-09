/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {

var formData=$('#demo');

    $('#submit').click(function () {
        var id = $('#id').val();
        var name = $('#name').val();
        var city = $('#city').val();

        $.ajax({
            type: formData.attr('method'),
            url: formData.attr('action'),
            data: {id: id, name: name, city: city}
           
        });


    });


});
        