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

console.log('\tSchema: ' + reportSchema.title);
console.log('\t ' + reportSchema.description + '');
console.log('\tSchema: ' + baseSchema.title + ' ' + baseSchema.description);
console.log('\tSchema: ' + complexSchema.title + ' '
		+ complexSchema.description);

test('Test tv4 schema.', function(t) {
	t.plan(1);
	tv4.addSchema(baseSchema);
	tv4.addSchema(complexSchema);
	tv4.addSchema(reportSchema);
	t.ok(tv4.validate(data, reportSchema), "worked!!!");
	var result = tv4.validate(data, reportSchema);
	var err = tv4.error;
	if (err == null) {
		console.log('no errors');
	} else {
		while (err != null) {
			console.log(err.message, err.schemaPath, err.dataPath);
			err = err.subErrors;
		}
	}

	// console.log(JSON.stringify(data, null, ' '));
	t.end();

});