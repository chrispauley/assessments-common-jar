var test = require('tape');
// var tv4 = require('../js/tv4.js');
var should = require("should");
var validator = require('../js/tv4.js');

var barSchema = {
    "id": "bar",
    "type" : "object",
    "properties": {
        "one": {
            "type": "string"
        }
    },
    "required": ["one"],
    "additionalProperties": false
}

var fooSchema = {
    "id" : "foo",
    "title": "foo",
    "type": "object",
    "properties": {
        "foo" : {
            "type:" : "array",
            "items": {"$ref":"bar"}
        }
    },
    "required": [
        "foo"
    ]
}

test('Test tv4 schema.', function (t) {
    t.plan(1);
            var json = {
            "foo" : 2
        }
    validator.addSchema(barSchema);
    validator.addSchema(fooSchema);
    t.ok(validator.validate(json, fooSchema), "worked!!!");
var result = validator.validate(json, fooSchema);
    
    t.end();

});
// describe("foo with integer", function() {
//     it("should result in an error message", function(){
//         var json = {
//             "foo" : 2
//         }
//         validator.addSchema(barSchema);
//         var result = validator.validate(json, fooSchema);

//         // above should fail but it passes
//     });
// }); 
