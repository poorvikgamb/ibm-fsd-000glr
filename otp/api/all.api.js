const server = require('express').Router();
const parser = require('body-parser');
const database = require('../service/database.service').database;
const data = new database();
const email = require('../service/email.service').email;
const mail = new email();

server.use(parser.json());

server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : 'service running',
        tasks : 'go to post and give details if not done'
    });
});

server.post('/register',(rq,rs)=>{
    data.addUser(rq.body,(err,response)=>{
         if(err){
             rs.status(400).json({
                 message : 'cannot add user'
             });
         }else{
             rs.status(200).json({
                 message : 'user added successfully'
             });
         } 
    });
})


server.post('/send',(rq,rs)=>{
    data.addOTP(rq.body,(err,response)=>{
        if(err){
            rs.status(400).json({
                message : 'otp not added'
            });
        }else{
            mail.sendMail(rq.body);
            rs.status(200).json({
                message : 'otp added'
            });
        }
    });

})


module.exports = {
    server
}