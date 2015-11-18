// imjvTest_03.js

var validator = require('is-my-json-valid');
var data = require('../../../../data/Assessments/Step_03_ShowAssessmentReportStatus_.json');
var schema = require('../../resources/Assessments/json/AssessmentSubjectType.json');

console.log('\tSchema: ' + schema.title );
console.log('\t ' + schema.description + '\n');

//var validate = validator(schema);

//console.log('Validate: ' + validate(data));



var validate = validator({
  required: true,
  type: 'object',
  properties: {
    hello: {
      required: true,
      type: 'string'
    }
  }
}, {
  verbose: true
});

validate({hello: 100});
console.log(validate.errors);