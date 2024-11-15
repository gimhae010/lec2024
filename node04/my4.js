const mysql=require('mysql2');

async function func01(){
    const conn= await mysql.createConnection({
        host: "localhost",
        user: "root",
        password: "mysql",
        database: "testdb"
    });

    await conn.connect(function(err) {
        if (err) throw err;
        conn.query("SELECT * FROM test01 where num=5555", function (err, result, fields) {
            if (err) throw err;
            console.log(result);
            conn.end();
        });
    });
}

func01();
