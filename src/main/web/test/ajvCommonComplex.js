// ajvCommonComplex.js

var data = require('../../../../data/Common/WebType.json');
var schema = require('../../resources/Common/json/complex.json');

console.log('\tSchema: ' + schema.title );
console.log('\t ' + schema.description + '\n');

var Ajv = require('ajv');
var ajv = Ajv(); // options can be passed


if (ajv.validateSchema(schema)) console.log('Schema is valid.');
var validate = ajv.compile(schema);
var valid = validate(data);
if (!valid) console.log(validate.errors);
console.log('Done.');

var data1 = require('../../../../data/Common/base/testBaseTypeTestObject_01.json');
var valid1 = validate(data1);
if (!valid1) console.log(validate.errors);
console.log('Done? ' + data1.numberType);
