var test = require('tape');
var tv4 = require('../js/tv4.js');

test('Test tv4.js', function (t) {
    t.plan(2);

	var schema = {
	    "items": {
	        "type": "boolean"
	    }
	};
	var data1 = [true, false];
	var data2 = [true, 123];
	
	//t.equal(data1, data1);
    t.equal(data1, data1);

	t.ok(tv4.validate(data1, schema), "worked!!!");
	t.end();

})