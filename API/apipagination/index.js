/**
 * Simple tests for all DB operations
 *
 * Adds the test data to the Database = vacation Collection = vacations
 */


// The ../db/setting.js uses the environment variable DB_URI
// Copy the connect string for the mongoDB cluster & paste below
// Format =>  mongodb+srv://admin:<password>@cluster0-46e5h.mongodb.net/test?retryWrites=true&w=majority
// const DB_USER = "admin"
// const DB_PASSWORD = "admin123"
// const DB_NAME = "acmetravel"

// process.env.DB_URI = "mongodb+srv://"+DB_USER+":"+DB_PASSWORD+"@cluster0-46e5h.mongodb.net/"+DB_NAME+"?retryWrites=true&w=majority"

const DB_USER = "Theresa"
const DB_PASSWORD = "ust123456"
const DB_NAME = "acmetravel"
const CLUSTER_HOST = "apidemo.ctkna.mongodb.net"

// Setup the DB URI
exports.DB_URI = "mongodb+srv://" + DB_USER + ":" + DB_PASSWORD + "@" + CLUSTER_HOST + "/" + DB_NAME + "?retryWrites=true&w=majority"



var express = require('express')
var bodyParser = require('body-parser')



var router = express.Router();

// setup the vacations api
require('./api/v1/vacations')(router);

// setup the hotels api
require('./api/v1/hotels')(router);

// Create the express app
app = express();

// Setup the body parser
//app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());//{type: '*/*'}));

// Setup the app to use the router
app.use(router);



// Start the listener
app.listen(3000);
console.log('Listening on 3000')

