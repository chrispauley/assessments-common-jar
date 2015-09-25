<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ShowCatalog_LongList</title>
    <link href="css/bootstrap.css" rel="stylesheet" media="screen">
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="js/handlebars-v3.0.3.js"></script>
        <script type="text/javascript">
            $("document").ready(function() {

                var partyTemplate = $("#displayPartyType").html();

                var ptRenderer = Handlebars.compile(partyTemplate);
                $.getJSON("../../../data/Assessments/Step_01_ShowShowAssessmentCatalog.json", function(data) {
                    console.log("getJSON");
                    var ac = data;
                    var supplierPartyResult = ptRenderer(ac.AssessmentCatalog.SupplierParty);
                    $("#container2").html(supplierPartyResult);

                    console.log(ac.AssessmentCatalog);
                    var packageResult = pkgRenderer(ac.AssessmentCatalog);
                    $("#packageContainer").html(packageResult);
                });
            });
        </script>

  <body id="ShowAssessmentCatalog">
        <script type="text/x-handlebars-template" id="displayPartyType">
            <div class="col-xs-4">
            <div><span>TypeParty: </span><span>{{PartyName}}</span></div>
            <div><span>taxId: </span><span>{{taxID.value}}</span></div>
            {{#each PersonContact}}
            <div><span>PersonContact: </span><span>{{PersonName.FormattedName}}</span></div>
            {{/each}}
            {{#each Communication}}
            <div><span>{{ChannelCode}}: </span><span>{{DialNumber}}</span></div>
            {{/each}}
            </div> <!-- col-xs-4 -->

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