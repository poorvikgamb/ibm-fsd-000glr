const MongoClient = require('mongodb').MongoClient;
const UserConstants = require('../utils/utils').UserConstants; 
class UserService {

    fetchUsers(callback){
        MongoClient.connect(UserConstants.mongo.url,(err,conn)=>{
            conn.db(UserConstants.mongo.db).collection('users').find({}).toArray((error,users)=>{
                if(!error){
                    console.log(users);
                    callback(users);
                }
            });
        });
    }
    
    add(_user,callback){
        MongoClient.connect(UserConstants.mongo.url,(err,conn)=>{
            conn.db(UserConstants.mongo.db).collection('users').insert(_user,(err,response)=>{
                callback(err,response);
            });
        });
    }

    update(_user,callback) {
        const id = _user._id;
        //const _name = name;
        MongoClient.connect(UserConstants.mongo.url,(err,conn)=>{
            conn.db(UserConstants.mongo.db).collection('users').update({
                //_id : id
                name : "poorvik"
            },{
             name : "poorudk"
            },(err,response)=>{
                callback(err,response);
            });
        });
    } 
    
     deleteById(_user,callback){
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(_db).collection('employees').deleteOne({_id : "1"},(err)=>{
                callback(err)
            })
            // close the connection
            conn.close()
        })
    }
}

module.exports = {
    UserService
}