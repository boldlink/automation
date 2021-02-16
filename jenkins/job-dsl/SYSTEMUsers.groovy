job('SYSTEM.Data-Jenkins-Users') {
        triggers {
            cron('*/5 * * * *')
        }
        // Backup users created the 
        steps {
            shell("aws s3 sync /var/lib/jenkins/users/ s3://<BUCKET_NAME>/jenkins/users/ --region eu-central-1 --sse aws:kms --delete")
        }
    }
