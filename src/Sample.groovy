def loadSample(){
echo " you are in groovy"

def valueMap = [:]
def envFile = readFile encoding: 'UTF-8', file: "meta/env.json"
def envText = new groovy.json.JsonSlurper().parseText(envFile)

valueMap.put("url", envText.PFDC_EPM_SERVICE_UTL)

echo "Service url is : Values inserted in map"+envText.PFDC_EPM_SERVICE_UTL

//env.Java_home = tool "${envText.jdkVersion}"

echo sh(returnStdout:true, script: 'env')


	echo "Service url is after"
	
	//def config = new ConfigSlurper('pfdc_epam_service_rul').parse('src/constants.properties')
	
//println "PRODUCT_NAME: "+config.pfdc_epam_service_rul
		
	
}

return this;