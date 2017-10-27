$(document).ready(function() {
    // var myRegexp = /^\/([a-zA-Z\-]+)\/.*$/;
    // var match = myRegexp.exec(window.location.pathname);
    // var tabName = match[1];
    //
    // $('li[data-tab-name="' + tabName + '"]').addClass("active");

    $(".dropdown-menu").dropdown({
        constrainWidth: false,
        hover: true,
        belowOrigin: true
    });
    $(".button-collapse").sideNav();
});