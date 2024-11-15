const express = require('express')
const path = require('path')
const parser=require('body-parser')
const session=require('express-session');
const app = express()
const port = 3000

app.use(express.static(path.join(__dirname,'public')))
app.set('view engine', 'ejs')
app.use(parser.json()) // for parsing application/json
app.use(parser.urlencoded({ extended: true })) // for parsing application/x-www-form-urlencoded
app.use(session({ secret: 'keyboard cat', cookie: { maxAge: 60000 }}))

app.use('/',require('./routes/homeController'));
app.use('/dept/',require('./routes/deptController'));
app.use('/login/',require('./routes/loginController'));


app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})