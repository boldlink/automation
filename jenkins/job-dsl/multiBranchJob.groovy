multibranchPipelineJob('<Name>') {
    displayName '<Display_Name>'
    description('<Description>')
    branchSources {
        configure {
            excludes('tags*')
        }
        // Solve the issue that causes the job to stop
        git {
            id 'super-unique-id'
            remote('git@<Repo_Url>')
                excludes('feature*')
        }
    }
    // Clean up
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(10)
            daysToKeep(20)
        }
    }
    triggers {
        // run every 1 day - can be tweekws
        periodic(1440)
    }
}
