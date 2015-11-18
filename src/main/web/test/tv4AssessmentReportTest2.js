// To run this:
//
//     node tv4AssessmentReportTest.js
//
var test = require('tape');
var should = require("should");
var tv4 = require('../js/tv4.js');
var data = require('../../../../data/Assessments/Step_03_ShowAssessmentReportStatus_.json');
var reportSchema = require('../../resources/Assessments/json/AssessmentReport.json');
var baseSchema = require('../../resources/Common/json/complex.json');
var complexSchema = require('../../resources/Common/json/base.json');

console.log('*****\n\tSchema: ' + reportSchema.title);
console.log('\t ' + reportSchema.description + '');
console.log('\tSchema: ' + baseSchema.title + ' ' + baseSchema.description);
console.log('\tSchema: ' + complexSchema.title + ' '
		+ complexSchema.description);

test('Test tv4 schema.', function(t) {
	t.plan(3);
	//tv4.addSchema('../../resources/Common/json/base.json', baseSchema);
	//tv4.addSchema('../../resources/Common/json/complex.json', complexSchema);
	//tv4.addSchema(reportSchema);
	var map = tv4.getSchemaMap();
	console.log(map);
	//var schema = map[uri];
	
	var result = tv4.validate(data, reportSchema, true, true, function(isValid, err){
		while (err != null) {
			console.log(err.message, err.schemaPath, err.dataPath);
			err = err.subErrors;
		}
	});
    var checkRecursive = true;
	t.ok(tv4.validate(data, baseSchema, true, true), "tv4.validate");
	t.ok(tv4.validateResult(data, reportSchema, true, true), "tv4.validateResult");
	t.ok(tv4.validateMultiple(data, reportSchema, checkRecursive, true), "tv4.validateMultiple");
	// console.log(JSON.stringify(data, null, ' '));
	t.end();

});