const express = require('express')
const path = require('path')
const parser=require('body-parser')
const app = express()
const port = 3000

app.use(express.static(path.join(__dirname,'public')))
app.set('view engine', 'ejs')
app.use(parser.json()) // for parsing application/json
app.use(parser.urlencoded({ extended: true })) // for parsing application/x-www-form-urlencoded

app.use('/',require('./routes/homeController'));
app.use('/dept/',require('./routes/deptController'));


app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})