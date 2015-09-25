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
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="js/handlebars-v3.0.3.js"></script>
    <script type="text/javascript" src="js/json2.js"></script>    
    <script type="text/javascript">
        $("document").ready(function() {

            var partyTemplate = $("#displayPartyType").html();
            var packageTemplate = $("#displayPackageTemplate").html();

            var ptRenderer = Handlebars.compile(partyTemplate);
            var pkgRenderer = Handlebars.compile(packageTemplate);
            
            $.getJSON("../../../data/Assessments/UseCase02/Step_01_UC2_ShowShowAssessmentCatalog.json", function(data) {
                console.log("getJSON");
                var ac = data;
                var supplierPartyResult = ptRenderer(ac.AssessmentCatalog.SupplierParty);
                $("#supplierDiv").html(supplierPartyResult);

                // var requestorPartyResult = ptRenderer(ac.AssessmentCatalog.RequesterParty);
                // $("#container3").html(requestorPartyResult);

                // var customerPartyResult = ptRenderer(ac.AssessmentCatalog.CustomerParty);
                // $("#container4").html(customerPartyResult);

                console.log(ac.AssessmentCatalog);
                var packageResult = pkgRenderer(ac.AssessmentCatalog);
                $("#packageContainerDiv").html(packageResult);

                $('#btnShow').click(function() {
                    var str = JSON.stringify(ac.AssessmentCatalog, undefined, 4);
                    console.log(ac.AssessmentCatalog);
                $("#jsonContainer").html(str);
            });
            });
        });
    </script>
    </head>
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

    <script type="text/x-handlebars-template" id="displayPackageTemplate">
        <div class="table col-lg-8">
            <table class="table table-striped table-bordered">
                <caption>Packages to Choose From</caption>
                <thead>
                <tr> <td>Name</td><td>ID</td><td>Description</td><td>Cost</td><td>Comptetency</td>
                </tr>
                </thead>
                <tbody>
                {{#each AssessmentPackage}}
                 <tr> 
                   <td>{{Name}}</td>
                   <td>{{ID}}</td>
                   <td>{{Description}}</td>
                   <td>{{PackageCost}}</td>
                   <td>{{#with AssessmentApplicability}}
                         {{#each AssessedCompetency}}{{competencyName}}{{/each}}
                        {{/with}}
                   </td>
                {{/each}} 
                </tr>
                </tbody>

            </table>
        </div> 

    </script>          
        
	<section class="container">
		<div class="content row">
		// <?php include "incl/header.php"; ?>
			<section class="main col col-lg-8">
				<h2>AssessmentCatalog</h2>
				<p>Main text</p>

                <div id="supplierDiv">supplierDiv here...</div>

                <div id="packageContainerDiv">packageContainerDiv here...</div>

				<div id="container1"></div>
				<button id="btnShow">Show JSON</button>
				<button id="nextPage">Next</button>
			</section><!-- main col col-lg-8 -->

			<section class="sidebar">
				<h2>Sidebar</h2>
				<p></p>
			</section><!-- sidebar col col-lg-4 -->
		</div>
	</section>
    <section class="container">
        <div class="content row">
            <section class="main col col-lg-8">
                <h3>json string</h3>
                <div id="jsonContainer">Content Goes Here</div>
            </section>
        </div>
    </section>


    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/myscript.js"></script>
    <script type="text/javascript">

    </script>
  </body>
</html>