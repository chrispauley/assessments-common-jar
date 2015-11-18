// To run this:
//
//     node tv4AssessmentOrderTest.js
//
var test = require('tape');
var tv4 = require('../js/tv4.js');
var data = require('../../../../data/Assessments/UseCase02/Step_01_UC2_ShowShowAssessmentCatalog.json');
var schema = require('../../resources/Assessments/json/AssessmentOrder.json');

console.log('\nSchema: ' + schema.title + '\n');

test('Test AssessmentOrder schema.', function (t) {
    t.plan(1);

	t.ok(tv4.validate(data, schema), "worked!!!");
	t.end();

});