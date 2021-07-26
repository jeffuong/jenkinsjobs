job("Test Unity") {
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
