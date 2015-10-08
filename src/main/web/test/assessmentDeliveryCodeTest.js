var test = require('tape');
var tv4 = require('../js/tv4.js');
var data = require('../../../../data/Assessments/components/AssessmentDeliveryCodeTest_01.json');
var schema = require('../../resources/Assessments/json/AssessmentDeliveryCodeType.json');

test('Test AssessmentDeliveryCodeType schema.', function (t) {
    t.plan(1);

	t.ok(tv4.validate(data, schema), "worked!!!");
	t.end();

});