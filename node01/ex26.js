const { createServer } = require('http');
const url = require('url');
const query=require('querystring');

const hostname = '127.0.0.1';
const port = 3000;

const server = createServer((req, res) => {
  console.log(req.url,req.method);
  let result=url.parse(req.url);
  if(result.pathname=='/'){
      res.statusCode = 200;
      res.setHeader('Content-Type', 'text/html;charset=utf-8');
      res.end('<h1>index page</h1>');

  }else if(result.pathname=='/intro'){
    let id='guest';
    if(req.url.split('?').length>1) {
        let msg = req.url.split('?')[1];
        id=query.parse(msg).id;
    }
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/html;charset=utf-8');
    res.end('<h1>intro page</h1><p>id:'+id+'</p>');
  }else{
    res.statusCode = 404;
    res.setHeader('Content-Type', 'text/html;charset=utf-8');
    res.end('<h1>err page</h1>');
  }
});

server.listen(3000, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
