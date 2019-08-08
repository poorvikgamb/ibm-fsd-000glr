const MongoClient = require('mongodb');
const upiDB = require('../upiDB').upiDB;

class gPay{
    link(_user,mbNo,callback){
        const _url = upiDB.mongo.url;
        const _db = upiDB.mongo.db;
        const _collection = upiDB.mongo.collections.gPayNewLink;
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(_db).collection(_collection).insert()
        })
    }
}