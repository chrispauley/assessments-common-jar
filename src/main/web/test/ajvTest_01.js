// node ajvTest_01.js

var data = require('../../../../data/Assessments/Step_03_ShowAssessmentReportStatus_.json');
var schema = require('../../resources/Assessments/json/AssessmentReport.json');

console.log('\tSchema: ' + schema.title );
console.log('\t ' + schema.description + '\n');

var Ajv = require('ajv');
var ajv = Ajv(); // options can be passed
var validate = ajv.compile(schema);
var valid = validate(data);
if (!valid) console.log(validate.errors);