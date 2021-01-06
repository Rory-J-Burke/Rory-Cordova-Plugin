var exec = require('cordova/exec');

exports.rory = function (arg0, success, error) {
    exec(success, error, 'NewRoryPlugin', 'rory', [arg0]);
};
