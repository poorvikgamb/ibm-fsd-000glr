const server = require('express').Router();
const parser = require('body-parser');
const newCard = require('../service/new.service').newCard;

const card = new newCard();

server.use(parser.json());

server.post('/newCard',(rq,rs)=>{
    card.addCard(rq.body,(error,response)=>{
       if(error) {
           rs.status(200).json({
               message: "Couldn't save your details"
           })
       }
       else{
        rs.status(200).json({
            message : response,
            status : 'added into database'
        });
       }
        
    });
});


server.post('/saveCard',(rq,rs)=>{
    card.saveCard(rq.body,(error,response)=>{
       if(error) {
           rs.status(200).json({
               message: "Couldn't save your details"
           })
       }
       else{
        rs.status(200).json({
            message : response,
            status : 'added into database'
        });
       }
        
    });
})

module.exports = {
    server
}