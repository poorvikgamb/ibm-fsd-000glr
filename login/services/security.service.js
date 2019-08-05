const uservice = require('./user.service').uservice;
const uservice1 = new uservice();

const validate = (rq,rs,next) =>{
    let isValid = false;
    const token = (rq.body.token);
    if(token){
        isValid = uservice1.validateToken(token)
    }
    if(isValid){
        next();
        return 1;
    }else{
        rs.redirect('/unauthorize');
        return 0;
    }
}

module.exports.validate = validate;