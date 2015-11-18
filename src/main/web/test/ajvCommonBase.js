// ajvTest_01.js

var data = require('../../../../data/Common/base/testAmountType_01.json');
var schema = require('../../resources/Common/json/base.json');

console.log('\tSchema: ' + schema.title );
console.log('\t ' + schema.description + '\n');

var Ajv = require('ajv');
var ajv = Ajv(); // options can be passed
var validate = ajv.compile(schema);
var valid = validate(data);
if (!valid) console.log(validate.errors);
console.log('Done.');


var data1 = require('../../../../data/Common/base/testBaseTypeTestObject_01.json');
var valid1 = validate(data1);
if (!valid1) console.log(validate.errors);
console.log('Done.');

var data2 = require('../../../../data/Common/base/testPeriodType_YearPeriodType_01.json');
var valid2 = validate(data2);
if (!valid2) console.log(validate.errors);
console.log('Done.');
