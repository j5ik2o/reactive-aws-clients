// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ RestoreSummary => ScalaRestoreSummary, _ }
import software.amazon.awssdk.services.dynamodb.model.{ RestoreSummary => JavaRestoreSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreSummaryOps {

  implicit class ScalaRestoreSummaryOps(val self: ScalaRestoreSummary) extends AnyVal {

    def toJava: JavaRestoreSummary = {
      val result = JavaRestoreSummary.builder()
      self.sourceBackupArn.filter(_.nonEmpty).foreach(v => result.sourceBackupArn(v))      // String
      self.sourceTableArn.filter(_.nonEmpty).foreach(v => result.sourceTableArn(v))        // String
      self.restoreDateTime.foreach(v => result.restoreDateTime(v))                         // Instant
      self.restoreInProgress.map(_.booleanValue).foreach(v => result.restoreInProgress(v)) // Boolean

      result.build()
    }

  }

  implicit class JavaRestoreSummaryOps(val self: JavaRestoreSummary) extends AnyVal {

    def toScala: ScalaRestoreSummary = {
      ScalaRestoreSummary()
        .withSourceBackupArn(Option(self.sourceBackupArn)) // String
        .withSourceTableArn(Option(self.sourceTableArn)) // String
        .withRestoreDateTime(Option(self.restoreDateTime)) // Instant
        .withRestoreInProgress(Option(self.restoreInProgress).map(_.booleanValue)) // Boolean
    }

  }

}
