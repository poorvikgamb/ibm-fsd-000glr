const mail = require('nodemailer');
const database = require('./database.service').database;
const data = new database();
const utils = require('./utils').utils;

class email{
    constructor(){
        this.smtpSetup = {
            service : utils.smtp.provider,
            auth : {
                user : utils.smtp.address,
                pass : utils.smtp.password
            }
        }
        this.mailer = mail.createTransport(this.smtpSetup);
    }

    sendMail(user){
        data.fetchUser(user,(err,response)=>{ 
            console.log(response)
            for(i=0;i<response.length;i++){
            this.mailer.sendMail({
                from : utils.smtp.email,
                to : response[0].email,
                subject : user.subject,
                html : 'otp is' + response[0].otp
            },(err,res)=>{
                if(err){
                    console.log(err);
                    return 'email not sent';
                }else{
                    console.log('success');
                }
            });
        }            
        });
    }
}

module.exports = {
    email
}