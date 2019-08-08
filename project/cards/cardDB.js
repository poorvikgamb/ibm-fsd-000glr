const cardDB={
    mongo : {
        url : 'mongodb://localhost:27017',
        db : 'food_smart_payment',
        collections : {
            cardExisting : 'existing',
            cardNew : 'new'
        }
    }
}

module.exports = {
    cardDB
}