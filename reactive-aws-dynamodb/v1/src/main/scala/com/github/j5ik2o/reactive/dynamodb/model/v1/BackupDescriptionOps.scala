package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ BackupDescription => JavaBackupDescription }
import com.github.j5ik2o.reactive.dynamodb.model.{ BackupDescription => ScalaBackupDescription }

object BackupDescriptionOps {

  import BackupDetailsOps._
  import SourceTableDetailsOps._
  import SourceTableFeatureDetailsOps._

  implicit class ScalaBackupDescriptionOps(val self: ScalaBackupDescription) extends AnyVal {

    def toJava: JavaBackupDescription = {
      val result = new JavaBackupDescription()
      self.backupDetails.map(_.toJava).foreach(result.setBackupDetails)
      self.sourceTableDetails.map(_.toJava).foreach(result.setSourceTableDetails)
      self.sourceTableFeatureDetails.map(_.toJava).foreach(result.setSourceTableFeatureDetails)
      result
    }

  }

  implicit class JavaBackupDescriptionOps(val self: JavaBackupDescription) extends AnyVal {

    def toScala: ScalaBackupDescription = {
      ScalaBackupDescription()
        .withBackupDetails(Option(self.getBackupDetails).map(_.toScala))
        .withSourceTableDetails(Option(self.getSourceTableDetails).map(_.toScala))
        .withSourceTableFeatureDetails(Option(self.getSourceTableFeatureDetails).map(_.toScala))
    }

  }

}
