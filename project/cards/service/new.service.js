const MongoClient = require('mongodb');
const cardDB = require('../cardDB').cardDB;

class newCard{
    addCard(_new,callback){
        //for adding new card
        const _url = cardDB.mongo.url;
        const _db = cardDB.mongo.db;
        const _collection =cardDB.mongo.collections.cardNew;
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(_db).collection(_collection).find({ cNumber : _new.cNumber}).toArray((err,response) => {
            if(response!=undefined && response.length == 0){
                conn.db(_db).collection(_collection).insert(_new,(err,response)=>{
                    callback(err,response);
                });
            }else{
                console.log('already exists');
            }
        });

    });

  }

    saveCard(_new,callback){
        //for saving new card by pushing it into existing card
        const _url = cardDB.mongo.url;
        const _db = cardDB.mongo.db;
        const _collection =cardDB.mongo.collections.cardExisting;
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(_db).collection(_collection).insert(_new,(err,response)=>{
                callback(err,response);
            });
        });   
    }
}

module.exports = {
    newCard
} 