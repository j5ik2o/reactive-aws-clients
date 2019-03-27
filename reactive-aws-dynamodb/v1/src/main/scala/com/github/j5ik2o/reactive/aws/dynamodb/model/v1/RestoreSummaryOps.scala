// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ RestoreSummary => ScalaRestoreSummary, _ }
import com.amazonaws.services.dynamodbv2.model.{ RestoreSummary => JavaRestoreSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreSummaryOps {

  implicit class ScalaRestoreSummaryOps(val self: ScalaRestoreSummary) extends AnyVal {

    def toJava: JavaRestoreSummary = {
      val result = new JavaRestoreSummary()
      self.sourceBackupArn.filter(_.nonEmpty).foreach(v => result.withSourceBackupArn(v))       // String
      self.sourceTableArn.filter(_.nonEmpty).foreach(v => result.withSourceTableArn(v))         // String
      self.restoreDateTime.map(java.util.Date.from).foreach(v => result.withRestoreDateTime(v)) // Instant
      self.restoreInProgress.map(_.booleanValue).foreach(v => result.withRestoreInProgress(v))  // Boolean

      result
    }

  }

  implicit class JavaRestoreSummaryOps(val self: JavaRestoreSummary) extends AnyVal {

    def toScala: ScalaRestoreSummary = {
      ScalaRestoreSummary()
        .withSourceBackupArn(Option(self.getSourceBackupArn)) // String
        .withSourceTableArn(Option(self.getSourceTableArn)) // String
        .withRestoreDateTime(Option(self.getRestoreDateTime).map(_.toInstant)) // Instant
        .withRestoreInProgress(Option(self.getRestoreInProgress).map(_.booleanValue)) // Boolean
    }

  }

}
