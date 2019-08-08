const express = require('express');
const server = new express();
const parser = require('body-parser');
const cors = require('cors');
const card = require('./cards/api/new.api').server;

server.use('/card',card);

const port = 6500;
server.listen(port,()=>{
    console.log('server started');
})
