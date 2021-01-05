/*
provide callback to handle styling or other front end processing of the result string
*/

export default rory = function(input, callback) {
    cordova.exec(
        function(callback, output) {
            callback(output);
        },
         function(error) {
            console.log(error);
         },
         "Rory",
         "rory",
         [input]
     );
};