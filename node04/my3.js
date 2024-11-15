const mysql=require('mysql2');

const conn=mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "mysql",
    database: "testdb"
});

const arr=[
    [7777,'test7'],
    [8888,'test8']
];

conn.connect(function(err) {
    if (err) throw err;
    console.log("Connected!");
    // let sql="create table test01(num integer primary key, name varchar(10))";
    // let sql="insert into test01 values (2222,'test2')";
    let sql="insert into test01 values ?";
    // conn.query(sql,[arr], function (err, result) {
    //   if (err) throw err;
    //   console.log("insert count :",result.affectedRows);
    // });
    conn.query("SELECT * FROM test01 where num=5555", function (err, result, fields) {
        if (err) throw err;
        console.log(result);
        conn.end();
    });
  });

