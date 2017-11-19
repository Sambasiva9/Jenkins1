def loadSample(){
echo " you are in groovy"

def valueMap = [:]
def envFile = readFile encoding: 'UTF-8', file: "meta/env.json"
def envText = new groovy.json.JsonSlurper().parseText(envFile)

valueMap.put("url", envText.PFDC_EPM_SERVICE_UTL)

echo "Service url is : Values inserted in map"+envText.PFDC_EPM_SERVICE_UTL


	echo "Service url is after"
	
configFileProvider(
        [configFile(fileId: 'my-managed-file', targetLocation: 'src/constants.properties', variable: 'job_settings')]) {
        load 'src/constants.properties'
		}
		
		echo "Service url is after - 1"
		
def props = readProperties  file:'src/constants.properties'
def Var1= props['pfdc_epam_service_rul']
echo "Var1 in property file is=${Var1}"
}

return this;