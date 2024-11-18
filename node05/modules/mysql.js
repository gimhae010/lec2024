const mysql = require('mysql2');

// Create the connection pool. The pool-specific settings are the defaults
const pool = mysql.createPool({
  host: 'localhost',
  database: 'xe',
  user: 'scott',
  password: 'tiger',
  connectionLimit: 5
});

module.exports=pool;