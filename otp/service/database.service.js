const MongoClient = require('mongodb');
const data = require('./utils').dataUtils;
const security = require('./security.service').security;
const sec = new security();

class database{
    addUser(user,callback){
        const _url = data.url
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(data.db).collection(data.collection).insert(user,(err,response)=>{
                callback(err,response)
            });
      });
    }

    addOTP(user,callback){
        const otpGenerated = sec.generateOTP();
        const _url = data.url;
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(data.db).collection(data.collection)
            .update(
                {email : user.email},
                {$set :{otp : otpGenerated.otp,validity: otpGenerated.validity}},
                (err,response)=>{
                    callback(err,response)
                }
            )
        });
    }

    fetchUser(user,callback){
        const _url = data.url;
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(data.db).collection(data.collection)
            .find({email : user.email})
            .toArray((err,response)=>{
                callback(err,response)
            });
        });
    }
}

module.exports = {
    database
}