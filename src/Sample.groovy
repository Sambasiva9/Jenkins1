def loadSample(){
echo " you are in groovy"

def valueMap = [:]
def envFile = readFile encoding: 'UTF-8', file: "meta/env.json"
def envText = new groovy.json.JsonSlurper().parseText(envFile)

valueMap.put("url", envText.PFDC_EPM_SERVICE_UTL)

echo "Service url is : Values inserted in map"+envText.PFDC_EPM_SERVICE_UTL


	echo "Service url is after"
	
	Properties props = new Properties();
props.putAll(map);

	File propsFile = new File('src/constants.properties')
        propsFile.withInputStream {
            props.load it
        }
        props."$url"
	
}

return this;