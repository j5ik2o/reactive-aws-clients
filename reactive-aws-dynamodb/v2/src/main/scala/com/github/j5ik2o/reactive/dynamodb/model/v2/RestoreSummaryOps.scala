package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ RestoreSummary => ScalaRestoreSummary }
import software.amazon.awssdk.services.dynamodb.model.{ RestoreSummary => JavaRestoreSummary }

object RestoreSummaryOps {

  implicit class ScalaRestoreSummaryOps(val self: ScalaRestoreSummary) extends AnyVal {

    def toJava: JavaRestoreSummary = {
      val result = JavaRestoreSummary.builder()
      self.sourceBackupArn.foreach(result.sourceTableArn)
      self.sourceTableArn.foreach(result.sourceTableArn)
      self.restoreDateTime.foreach(result.restoreDateTime)
      self.restoreInProgress.foreach(v => result.restoreInProgress(v))
      result.build()
    }

  }

  implicit class JavaRestoreSummaryOps(val self: JavaRestoreSummary) extends AnyVal {

    def toScala: ScalaRestoreSummary = {
      ScalaRestoreSummary()
        .withSourceBackupArn(Option(self.sourceBackupArn))
        .withSourceTableArn(Option(self.sourceTableArn))
        .withRestoreDateTime(Option(self.restoreDateTime))
        .withRestoreInProgress(Option(self.restoreInProgress))
    }

  }

}
