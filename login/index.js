const express = require('express');
const server = express();
const validate = require('./services/security.service').validate;
const parser = require('body-parser');


server.use(parser.json());

server.get('/unauthorize',(rq,rs)=>{
    rs.status(401).json({
        message : 'Unauthorized Access'
    });
});


server.use('/confirm',(rq,rs,next)=>{
   validate(rq,rs,next);
});

server.post('/login/:id/:pass',(rq,rs,next)=>{
    
    if(validate(rq,rs,next) == 1)
    {
        rs.status(200).json({
            message : 'token generation successfull'
        })
    }
});

const port = 5300;

server.listen(port,()=>{
    console.log('sever started');
})