const express = require('express');
const router = new express();
const api = require('./api/all.api').server;

router.use('/otp',api);

port = 3000;

router.listen(port,()=>{
    console.log('server started');
})