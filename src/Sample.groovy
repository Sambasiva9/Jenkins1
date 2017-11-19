def loadSample(){
echo " you are in groovy"

def valueMap = [:]
def envFile = readFile encoding: 'UTF-8', file: "meta/env.json"
def envText = new groovy.json.JsonSlurper().parseText(envFile)

valueMap.put("url", envText.PFDC_EPM_SERVICE_UTL)

echo "Service url is : Values inserted in map"
}

return this;