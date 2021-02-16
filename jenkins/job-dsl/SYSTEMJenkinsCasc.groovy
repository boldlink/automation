job('SYSTEM.Data-Jenkins-jcasc') {
        triggers {
            // Run every 5 minutes
            cron('*/5 * * * *')
        }
        steps {
            // Pull specific files from the repo where you keep the jcasc scripts
            shell("git archive --remote=ssh://git@<REPO_URL>/<REPO_NAME>.git master <DIR> | tar -x")
            // Extract and copy the pulled the files to the jenkins folder (assuming it matches)
            shell("cp ./jcasc/extra/*.yml /var/lib/jenkins/casc_configs")
        }
        publishers {
            wsCleanup()
        }
    }
