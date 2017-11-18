#!/usr/bin/env groovy
node{
echo "Hello Jenkins"
echo "sambasiva"
echo "sambasiva Narne"
stash includes: '**/src/*' name: 'groovy_scripts'
def pipe = load 'src/Sample.groovy'
pipe.loadSample()
}
