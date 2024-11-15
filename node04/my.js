// mysql ~ 5.x
const mysql = require('mysql2')
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'scott',
  password: 'tiger',
  database: 'xe'
})

connection.connect()

connection.query('SELECT 1 + 1 AS solution', (err, rows, fields) => {
  if (err) throw err

  console.log('The solution is: ', rows[0].solution)
})

connection.end()