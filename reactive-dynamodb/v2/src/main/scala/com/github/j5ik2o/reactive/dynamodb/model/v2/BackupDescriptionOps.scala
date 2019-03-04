package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ BackupDescription => ScalaBackupDescription }
import software.amazon.awssdk.services.dynamodb.model.{ BackupDescription => JavaBackupDescription }

object BackupDescriptionOps {

  import BackupDetailsOps._
  import SourceTableDetailsOps._
  import SourceTableFeatureDetailsOps._

  implicit class ScalaBackupDescriptionOps(val self: ScalaBackupDescription) extends AnyVal {

    def toJava: JavaBackupDescription = {
      val result = JavaBackupDescription.builder()
      self.backupDetails.map(_.toJava).foreach(result.backupDetails)
      self.sourceTableDetails.map(_.toJava).foreach(result.sourceTableDetails)
      self.sourceTableFeatureDetails.map(_.toJava).foreach(result.sourceTableFeatureDetails)
      result.build()
    }

  }

  implicit class JavaBackupDescriptionOps(val self: JavaBackupDescription) extends AnyVal {

    def toScala: ScalaBackupDescription = {
      ScalaBackupDescription()
        .withBackupDetails(Option(self.backupDetails).map(_.toScala))
        .withSourceTableDetails(Option(self.sourceTableDetails).map(_.toScala))
        .withSourceTableFeatureDetails(Option(self.sourceTableFeatureDetails).map(_.toScala))
    }

  }

}
