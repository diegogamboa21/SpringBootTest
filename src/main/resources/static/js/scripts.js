$(document).ready(function() {
  "use strict";

  $(".nuestros-servicios div:first").show();
  $(".servicios nav a:first").addClass("activo");

  $(".servicios nav a").on("click", mostrarTabs);

  function mostrarTabs() {
    $(".servicios nav a").removeClass("activo");
    $(this).addClass("activo");
    $(".nuestros-servicios div").fadeOut();
    var enlace = $(this).attr("href");
    $(enlace).fadeIn();
    console.log(enlace);
    return false;
  }
  /*
  $(".logo img").on("click", function() {
    console.log("prueba jQuery");
    $(this.remove());
  });

  $(".logo img").on("mouseenter", function() {
    console.log("Evento hover:antes");
  });

  $(".logo img").on("mouseleave", function() {
    console.log("Evento hover:despues");
  });

  $("#menu").on("click", function() {
    $("#navegacion").show();
  });

  $(".logo img").addClass("activo");
  $(".navegacion").show();
  $(".navegacion nav ul li:first").addClass("activo");
  $("main article:first").addClass("activo");

  $(".navegacion ul li a").on("click", function(e) {
    $(".navegacion ul li a").removeClass("activo");
    e.preventDefault();
    $(this).addClass("activo");
  });

  $("main").on({
    click: function() {
      $(this).addClass("activo fondorojo");
    },
    mouseenter: function() {
      $(this).addClass("fondorojo");
    },
    mouseleave: function() {
      $(this).addClass("activo");
      $(this).removeClass("fondorojo");
    }
  });

  $(".logo img").click(function(e) {
    e.preventDefault();
    $(this).animate({ width: "200px" }, 1000);
  });

  $(".logo img").on("click", cargarAjax);

  function cargarAjax() {
    $.ajax("promociones.txt", {
      type: "GET",
      dataType: "text",
      success: agregarContenido
    });
  }

  function agregarContenido(data, status, jqxhr) {
    $("aside").text(data);
    console.log("status: " + status);
  };
  */
});
