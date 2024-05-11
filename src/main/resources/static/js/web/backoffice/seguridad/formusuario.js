$(document).on("click", "#btnagregar", function(){
    $("#txtnombre").val("");
    $("#txtapellido").val("");
    $("#txtemail").val("");
    $("#txtemail").prop('readonly', false);
    $("#txtusuario").val("");
    $("#txtusuario").prop('readonly', false);
    $("#hddidadmin").val("0");
    $("#switchusuario").hide();
    $("#cbactivo").prop("checked", false);
    $("#divmsgpassword").show();
    $("#btnenviar").hide();
    $("#modalusuario").modal("show");
});
$(document).on("click", ".btnactualizar", function(){
    $.ajax({
        type: "GET",
        url: "/seguridad/usuario/"+$(this).attr("data-usuid"),
        dataType: "json",
        success: function(resultado){
           $("#txtnombre").val(resultado.nombres);
           $("#txtapellido").val(resultado.apellidos);
           $("#txtemail").val(resultado.email);
           $("#txtemail").prop('readonly', true);
           $("#txtusuario").val(resultado.nomadmin);
           $("#txtusuario").prop('readonly', true);
           $("#hddidadmin").val(resultado.idadmin);
           $("#switchusuario").show();
           $("#divmsgpassword").hide();
           $("#btnenviar").show();
           if(resultado.activo)
              $("#cbactivo").prop("checked", true);
           else
              $("#cbactivo").prop("checked", false);
        }
    })
    $("#modalusuario").modal("show");
})

$(document).on("click", "#btnguardar", function(){
    $.ajax({
        type: "POST",
        url: "/seguridad/usuario/registrar",
        contentType: "application/json",
        data: JSON.stringify({
            idadmin: $("#hddidadmin").val(),
            nomadmin: $("#txtusuario").val(),
            nombres: $("#txtnombre").val(),
            apellidos: $("#txtapellido").val(),
            email: $("#txtemail").val(),
            activo: $("#cbactivo").prop("checked")
        }),
        success: function(resultado){
            if(resultado.respuesta){
                listarUsuarios()
            }
            alert(resultado.mensaje);
        }
    });
    $("#modalusuario").modal("hide");
});

function listarUsuarios(){
    $.ajax({
        type: "GET",
        url: "/seguridad/usuario/lista",
        dataType: "json",
        success: function(resultado){
            $("#tblusuario > tbody").html("");
            $.each(resultado, function(index, value){
                $("#tblusuario > tbody").append(`<tr>`+
                `<td>${value.nombres}</td>`+
                `<td>${value.apellidos}</td>`+
                `<td>${value.nomadmin}</td>`+
                `<td>${value.email}</td>`+
                `<td>${value.activo}</td>`+
                `<td><button type='button' class='btn btn-primary btnactualizar' `+
                    `data-usuid="${value.idadmin}">Actualizar`+
                `</button></td>`+
                `</tr>`);
            });
        }
    });
}

