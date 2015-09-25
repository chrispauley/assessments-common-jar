<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>HROS Assessments Catalog</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet" media="screen">
    <link  href="css/main.css" rel="stylesheet" media="screen">
    <link  type="text/javascript" src="js/jquery-1.11.3.min.js"/>
    <link  type="text/javascript" src="js/jquery.loadTemplate-1.4.5.js"/>
    <script type="text/javascript">
    	 var curPage = 1;
         var templateData = null;

         function getData() {
            $.getJSON("../../../data/Assessments/Step_01_ShowShowAssessmentCatalog.json", function(data) {
                templateData = data;
                console.log(templateData);
                //renderTemplates(templateData, curPage);
            });
         }         

         function renderTemplates(data, pageNo) {
            $("#container1").loadTemplate($("#itemTemplate"), data["employees"], 
                    {paged: true, pageNo: pageNo, elemPerPage: 1});
         }

         window.addEventListener("load", function(e) {
            
             
             document.querySelector("#prevPage").addEventListener("click", function (evt) {
                 if (curPage > 1) {
                    renderTemplates(templateData, --curPage);
                 }
             });
             document.querySelector("#nextPage").addEventListener("click", function (evt) {
                 if (curPage < 4) {
                    renderTemplates(templateData, ++curPage);
                 }
             });

             getData();
         });
    </script>

  <body id="ShowAssessmentCatalog">
 
         <script type="text/html" id="itemTemplate">
            <div class="itemTemplateWrapper">
                <div data-content="name"></div>
                <div data-content="title"></div>
                <div data-content="email" data-link="email" data-format="EmailLink" data-format-target="link"></div>
                <div data-content="phone"></div>
            </div>
        </script>
        
	<section class="container">
		<div class="content row">
		// <?php include "incl/header.php"; ?>
			<section class="main col col-lg-8">
				<h2>About</h2>
				<p>Main text</p>
				<div id="container1"></div>
				<button id="prevPage">Previous</button>
				<button id="nextPage">Next</button>
			</section><!-- main col col-lg-8 -->

			<section class="sidebar">
				<h2>Sidebar</h2>
				<p></p>
			</section><!-- sidebar col col-lg-4 -->
		</div>
	</section>

    <script src="js/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/myscript.js"></script>
    <script type="text/javascript" charset="utf-8">
        
    </script>
  </body>
</html>