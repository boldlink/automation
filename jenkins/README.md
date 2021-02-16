# Jenkins automation code snippets

## Jenkins job-dsl
* Require job-dsl Jenkins plugin.
### Multi-branch job-dsl script
* Create a job which scans all the branches on a repo.
* The repos which are not being excluded and have a Jenkinsfile will appear after being scanned.
* Ideal for pipelines which the logic remains on the repo not on Jenkins.
* Requires pipeline-as-code Jenkins plugin and it's dependencies.

### SYSTEM* job-dsl scripts
* Examples of Jenkins jobs wit a single step.
* Used on the past to schedule actions on the Jenkins Master.