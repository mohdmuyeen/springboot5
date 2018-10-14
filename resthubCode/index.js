// FileName: index.js
// Import express
let express = require('express');

// Import Body parser
let bodyParser = require('body-parser');

// Import Mongoose
let mongose = require('mongoose');

// Initialize the application
let app = express();

// Import api routes
let apiRoutes = require("./api-routes");

// Configure bodyparser to handle post requests
app.use(bodyParser.urlencoded({
    extended: true
}));
app.use(bodyParser.json());

// Connect to Mongoose and set connection variable
mongose.connect('mongodb://localhost:27017/dbSelf',{ useNewUrlParser : true });
var db = mongose.connection;

// set up server port
var port = process.env.port || 8082;

// send message for defual url
app.get('/', (req, res) => res.send('Hello Mohammed Muyeen'));

// Use Api routes in the App
app.use('/api', apiRoutes);

// launch the app to specific port
app.listen(port, function () {
    console.log("Running RestHub on port: " + port);
});

