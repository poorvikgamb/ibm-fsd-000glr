const MongoClient = require('mongodb');
const cardDB = require('../cardDB').cardDB;

class existingCard{
    fetchCards(callback){
        const _url = cardDB.mongo.url;
        const _db = cardDB.mongo.db;
        const _collection =cardDB.mongo.collections.existing;
        MongoClient.connect(_url,(err,conn)=>{
            conn.db(_db).collection(_collection).find().toArray((err,response)=>{
                callback(err,response);
            })
        })
    }

} 

module.exports = {
    existingCard
}
