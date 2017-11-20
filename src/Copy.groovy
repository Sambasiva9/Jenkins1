class Copy{
	static void main(String[] args){
	
def sourceDir = "C:\\Users\\samba\\Google Drive\\Groovy"
def destinationDir = "C:\\Users\\samba\\Desktop\\med"

def directory = new File("${sourceDir}");


//Clousre
def write = {data, lenth ->
output.write(data, 0, lenth)
}

//Closure 
def fileCopyClosure = {
    if(it.canRead()) { //make sure whether you can read it
       def destFolder = new File("${destinationDir}");
        
        def desti = new File("${destinationDir}\\${it.name}") ;


         //create output stream
         output = desti.newOutputStream();
         it.eachByte(1024, write);
         output.close();


         println "Copy completed${desti.name}";
     }
}
directory.eachFileRecurse(fileCopyClosure) 

 stage('configFile Plugin') {
	  checkout scm

	def mycfg_file = 'src/constants.properties'
	
	
configFileProvider(
        [configFile(fileId: 'global-settings', targetLocation: 'src/constants.properties', variable: 'PACKER_OPTIONS')]) {
		sh "cat ${env.PACKER_OPTIONS}"
       
		}
		}
		
		echo "Service url is after - 1"
		
def props = readProperties  file:'src/constants.properties'
def Var1= props['pfdc_epam_service_rul']
echo "Var1 in property file is=${Var1}"

}
}