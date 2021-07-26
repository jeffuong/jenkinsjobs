pipelineJob("Test Unity") {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/jeffuong/testUnity.git')
          }
          extensions {
            gitLFSPull()
          }
        }
      }
    }
  }
}
