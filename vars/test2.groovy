def contdownload(jobname)
{
  git "https://github.com/Sanathhub/${jobname}.git"
}
def contbuild()
{
  sh "mvn package"
}
def contdeploy()
{
  deploy adapters: [tomcat9(credentialsId: '5242c1fb-e4fd-448e-abe1-dc9187894af3', path: '', url: 'http://172.31.90.66:8080')], contextPath: 'testingapp', war: '**/*.war'
}
