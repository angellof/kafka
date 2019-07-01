var express = require('express');
var router = express.Router();
var consumerService = require('../service/consumerAvgService');

/* GET home page. */
router.get('/', function(req, res, next) {
  
 var data = consumerService().callConsumer();
  res.render('index', { title: 'Express', user: data });
});

module.exports = router;