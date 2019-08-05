const users = require('../database/users').users;
const key = require('../database/key').private_key;
const jwt = require('jsonwebtoken');


class uservice{
    constructor(){
        this.users = users;
    }

    call(){
        return this.users;
    }

    confirm(id,pass){
        for(let i=0;i<users.length;i++){
            if(id==users[i].id && pass==users[i].pass){
            return 1;
           }
        }
    }

    generateToken(users){
        let id,pass,data;
        if(this.confirm(id,pass)==1){
             data = {
                id : users.id,
                pass : users.pass
             }        
        }else{
            console.log('invalid');
        }

        const token = jwt.sign(data,key,{
            expiresIn : '10m'
        });
        return token;        
    }

    validateToken(token){
        let isValid = false;
        try{
            isValid = jwt.verify(token,key)
        }catch(error){
            console.error(error);
        }
        return isValid;
    }
}

module.exports.uservice = uservice;