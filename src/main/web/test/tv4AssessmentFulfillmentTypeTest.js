// To run this:
//
//     node tv4AssessmentFulfillmentTypeTest.js
//
var test = require('tape');
var tv4 = require('../js/tv4.js');
var data = require('../../../../data/Assessments/components/AssessmentFulfillmentTypeTest_01.json');
var schema = require('../../resources/Assessments/json/assessmentsCommon.json');

console.log('Schema: ' + schema.title + '\n');

test('Test AssessmentFullfillmentType schema.', function (t) {
    t.plan(1);

	t.ok(tv4.validate(data, schema), "worked!!!");
	t.end();

});