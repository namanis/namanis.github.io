
jQuery("document").ready(function($){
	
	var nav = $(".cabecalho"); 
 


	
	/*var nav1=$('.banner');*/
	$(window).scroll(function () {
		if ($(this).scrollTop() > 0) {
			nav.addClass("f-nav");
			/*nav1.addClass("f-nav1");*/
		} else {
			nav.removeClass("f-nav");
			/*nav1.removeClass("f-nav1");*/
		}
	});});
	