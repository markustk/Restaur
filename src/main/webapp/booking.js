/**
 * Created by markusthomassenkoteng on 04.10.2017.
 */
$(document.activeElement).ready(function() {
    $.ajax({
        url: 'rest/services',
        type: 'POST',
        success: function () {
        }
    });

    $("#leggTil").click(function () {
        alert("POST booking");
        var forrettListe = [];
        var hovedrettListe = [];
        var dessertListe = [];
        var drikkeListe = [];

        $(".forretter").each(function () {
            var selected = $(this).val();
            forrettListe.push(selected);
        });
        $(".hovedretter").each(function () {
            var selected = $(this).val();
            hovedrettListe.push(selected);
        });
        $(".desserter").each(function () {
            var selected = $(this).val();
            dessertListe.push(selected);
        });
        $(".drikker").each(function () {
            var selected = $(this).val();
            drikkeListe.push(selected);
        });
        console.log(forrettListe);
        console.log(hovedrettListe);
        console.log(dessertListe);
        console.log(drikkeListe);



        $.ajax({
            url: 'rest/services/bookings',
            type: 'POST',
            data: JSON.stringify({
                bookingId: $("#kundenavn").val(),
                bookingTidspunkt: new Date($("#bookingstidspunkt").val()).toJSON(),
                antallGjester: $("#antallpersoner").val(),
                forrett: forrettListe,
                hovedrett: hovedrettListe,
                dessert: dessertListe,
                drikke: drikkeListe,
                kredittkort: 123456789,
                utlopsdato: new Date().toJSON(),
                kontrollsiffer: 780
            }),
            contentType: 'application/json',
            dataType: 'json',
            success: function() {
                alert("Bestilling lagt inn")
            }
        });
    });

    $("#add").click(function () {
       var html = "";
       html += "<div>";
        html += "<select class='forretter' id='forrett'>";
        html += "<option value='Nothing'>Forrett</option>";
        html += "<option value='brod'>Brod</option>";
        html += "<option value='salat'>Salat</option>";
        html += "<option value='suppe'>Suppe</option>";
        html += "</select>";
        html += "<select class='hovedretter' id='forrett'>";
        html += "<option value='Nothing'>Hovedrett</option>";
        html += "<option value='biff'>Biff</option>";
        html += "<option value='laks'>Laks</option>";
        html += "</select>";
        html += "<select class='desserter' id='dessert'>";
        html += "<option value='Nothing'>Dessert</option>";
        html += "<option value='is'>Is</option>";
        html += "<option value='kake'>Kake</option>";
        html += "<option value='pudding'>Pudding</option>";
        html += "</select>";
        html += "<select class='drikker' id='drikke'>";
        html += "<option value='Nothing'>Drikke</option>";
        html += "<option value='brus'>Brus</option>";
        html += "<option value='ol'>Ol</option>";
        html += "<option value='vin'>Vin</option>";
        html += "</select>";
        html += "</div>";
       $("#retter").append(html);
    });
});