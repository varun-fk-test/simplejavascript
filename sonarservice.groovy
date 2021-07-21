@Library('jenkins-shared-library') _


stage('Sonar Code Analysis'){
  sonarCodeAnalysisRefactor(
    service: "$SERVICE",
    sonarprojectkey: "$SONARPROJECTKEY",
    giturl: "$GITURL",
    branch: "$GITBRANCH",
    sources: "$SOURCES"
  )
}