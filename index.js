const express = require ('express');
const server = express();
const items = require('./database/items').items;
const cors = require('cors');
const parser = require('body-parser');

server.use(cors());
server.use(parser.json());
server.get('/menu',(rq,res)=>{
    res.status(200).json({
        message : "menu is open"
    });
});


server.use('/items',(type,brand,price,quantity,currentquant)=>{
    type = items.ty
    brand = items.brand,
    price = items.price,
    quantity = items.quantity,
    currentquant = items.currentquant
});

console.log(JSON.stringify(items));

server.get('/items',(rq,rs)=>{
    rs.status(200).json({
        items
    });
});

server.post('/itemadd/:type/:brand',(rq,rs)=>{
    items.forEach(u=>{
        if(rq.body.type == u.type && rq.body.brand == u.brand){
            u.currentquant +=1;
            u.quantity -=1;
        }
       
    });
    rs.status(200).json({
        now : items.currentquant
     });
    
});


const port = 5500;

server.listen(port,()=>{
    console.log('server started');
});


