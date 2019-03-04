package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ RestoreSummary => JavaRestoreSummary }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ RestoreSummary => ScalaRestoreSummary }

object RestoreSummaryOps {

  implicit class ScalaRestoreSummaryOps(val self: ScalaRestoreSummary) extends AnyVal {

    def toJava: JavaRestoreSummary = {
      val result = new JavaRestoreSummary()
      self.sourceBackupArn.foreach(result.setSourceTableArn)
      self.sourceTableArn.foreach(result.setSourceTableArn)
      self.restoreDateTime.map(Date.from).foreach(result.setRestoreDateTime)
      self.restoreInProgress.foreach(v => result.setRestoreInProgress(v))
      result
    }

  }

  implicit class JavaRestoreSummaryOps(val self: JavaRestoreSummary) extends AnyVal {

    def toScala: ScalaRestoreSummary = {
      ScalaRestoreSummary()
        .withSourceBackupArn(Option(self.getSourceBackupArn))
        .withSourceTableArn(Option(self.getSourceTableArn))
        .withRestoreDateTime(Option(self.getRestoreDateTime).map(_.toInstant))
        .withRestoreInProgress(Option(self.getRestoreInProgress))
    }

  }

}
