#!/usr/bin/env groovy
node{
echo "Hello Jenkins"
echo "sambasiva"
echo "sambasiva Narne"
checkout scm

sh '''
        ls -lhrt
    '''
	
def rootDir = pwd()
    println("Current Directory: " + rootDir)
	
def pipe = load 'src/Sample.groovy'
pipe.loadSample()
}
