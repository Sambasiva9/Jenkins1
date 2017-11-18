#!/usr/bin/env groovy
node{
echo "Hello Jenkins"
echo "sambasiva"

def rootDir = pwd()
    println("Current Directory: " + rootDir)
checkout scm

echo "sambasiva Narne"	

	
def pipe = load 'src/Sample.groovy'
pipe.loadSample()
}
