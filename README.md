# api-gateway-modify-body-with-yaml-config

Spring Cloud Gateway with YAML config and modify body with filters.

In this project I've built a filter which can easily modify JSON response from other (external) service.

You can test this project by invoking:

`http://localhost:8080/get/headers`

it will change original body 

`{
"headers": {
"Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
"Accept-Encoding": "gzip, deflate",
"Accept-Language": "en-US,en;q=0.9,pl-PL;q=0.8,pl;q=0.7",
"Host": "httpbin.org",
"Upgrade-Insecure-Requests": "1",
"User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.99 Safari/537.36",
"X-Amzn-Trace-Id": "Root=1-61f7ccd9-6602c8777e0de361354003f9"
}
}`

into 

`{
"headers": {
"Accept": "*/*",
"Accept-Encoding": "gzip,deflate",
"Content-Length": "0",
"Forwarded": "proto=http;host=\"localhost:8080\";for=\"127.0.0.1:56583\""
}
}`

which I filtred by creating reduced Java POJO.

###One thing to consider is to change reading json via objectMapper to **non-blocking method.**