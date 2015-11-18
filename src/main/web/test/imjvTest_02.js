// imjvTest_02

var validator = require('is-my-json-valid');
var https = require('https'),
    // use the is-my-json-valid module.
    // ensure you have installed it.
    validate = require('is-my-json-valid');
 
// this is our sample input (blank) JSON.
var input = {
    /* JSON of a collection V1 */
};
 
// we fetch the schema from server and when it is received, 
// validate our input JSON against it.
https.get('https://schema.getpostman.com/json/collection/v1/', function (response) {
    var body = '';
 
    response.on('data', function (d) {
        body += d;
    });
 
    response.on('end', function () {
        var validate = validator(JSON.parse(body));
        console.log(validate(input) ? 'It is valid!' : 'It is invalid!');
    });
});