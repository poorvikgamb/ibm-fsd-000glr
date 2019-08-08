const server = require('express').Router();
const parser = require('body-parser');
const existingCard = require('../service/existing.service').existingCard;
const card = new existingCard();

server.post('/exstiningCard',(rq,rs)=>{
    card.fetchCards((err,Response)=>{
        if(rq.body == )
    })
})