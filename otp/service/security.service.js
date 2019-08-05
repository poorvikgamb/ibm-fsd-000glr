const otpGenerator = require('otp-generator');
const otp = otpGenerator.generate(6, { upperCase: false, specialChars: false });
const d = new Date()


class security{
    generateOTP(callback){
        this.otp = otpGenerator.generate(6, { upperCase: false, specialChars: false });
        this.validity = d.getTime()+600000
        return {otp: this.otp, validity: this.validity};
  }

}

module.exports = {
    security
}