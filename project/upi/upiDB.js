const cardDB={
    mongo : {
        url : 'mongodb://localhost:27017',
        db : 'food_smart_payment',
        collections : {
            gPayLinked : 'existing',
            gPayNewLink : 'newLink'
        }
    }
}

module.exports = {
    upiDB
}