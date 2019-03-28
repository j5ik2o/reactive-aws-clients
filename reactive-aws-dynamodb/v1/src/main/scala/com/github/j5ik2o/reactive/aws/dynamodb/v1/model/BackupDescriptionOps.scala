// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupDescription => ScalaBackupDescription, _ }
import com.amazonaws.services.dynamodbv2.model.{ BackupDescription => JavaBackupDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupDescriptionOps {

  implicit class ScalaBackupDescriptionOps(val self: ScalaBackupDescription) extends AnyVal {

    def toJava: JavaBackupDescription = {
      val result = new JavaBackupDescription()
      self.backupDetails.foreach { v =>
        import BackupDetailsOps._; result.withBackupDetails(v.toJava)
      } // BackupDetails
      self.sourceTableDetails.foreach { v =>
        import SourceTableDetailsOps._; result.withSourceTableDetails(v.toJava)
      } // SourceTableDetails
      self.sourceTableFeatureDetails.foreach { v =>
        import SourceTableFeatureDetailsOps._; result.withSourceTableFeatureDetails(v.toJava)
      } // SourceTableFeatureDetails

      result
    }

  }

  implicit class JavaBackupDescriptionOps(val self: JavaBackupDescription) extends AnyVal {

    def toScala: ScalaBackupDescription = {
      ScalaBackupDescription()
        .withBackupDetails(Option(self.getBackupDetails).map { v =>
          import BackupDetailsOps._; v.toScala
        }) // BackupDetails
        .withSourceTableDetails(Option(self.getSourceTableDetails).map { v =>
          import SourceTableDetailsOps._; v.toScala
        }) // SourceTableDetails
        .withSourceTableFeatureDetails(Option(self.getSourceTableFeatureDetails).map { v =>
          import SourceTableFeatureDetailsOps._; v.toScala
        }) // SourceTableFeatureDetails
    }

  }

}
