// tv4AdditionalItemType.js
var test = require('tape');
var tv4 = require('../js/tv4.js');
var data = require('../../../../data/Assessments/components/AdditionalItemTest_01.json');
var schema = require('../../resources/Assessments/json/assessmentsCommon.json');

console.log('Schema: ' + schema.title);

test('Test AdditionalItemType schema.', function (t) {
    t.plan(1);
	t.ok(tv4.validate(data, schema), "worked!!!");
	t.end();

});