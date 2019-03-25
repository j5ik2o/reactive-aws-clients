package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupDescription => ScalaBackupDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupDescription => JavaBackupDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupDescriptionOps {

  implicit class ScalaBackupDescriptionOps(val self: ScalaBackupDescription) extends AnyVal {

    def toJava: JavaBackupDescription = {
      val result = JavaBackupDescription.builder()
                                          self.backupDetails.foreach{ v => import BackupDetailsOps._; result.backupDetails(v.toJava) } // BackupDetails, case Other
                      self.sourceTableDetails.foreach{ v => import SourceTableDetailsOps._; result.sourceTableDetails(v.toJava) } // SourceTableDetails, case Other
                      self.sourceTableFeatureDetails.foreach{ v => import SourceTableFeatureDetailsOps._; result.sourceTableFeatureDetails(v.toJava) } // SourceTableFeatureDetails, case Other

      result.build()
    }

  }

  implicit class JavaBackupDescriptionOps(val self: JavaBackupDescription) extends AnyVal {

     def toScala: ScalaBackupDescription = {
       ScalaBackupDescription()
            .withBackupDetails(Option(self.backupDetails).map{ v => import BackupDetailsOps._; v.toScala}) // BackupDetails, Map-12
            .withSourceTableDetails(Option(self.sourceTableDetails).map{ v => import SourceTableDetailsOps._; v.toScala}) // SourceTableDetails, Map-12
            .withSourceTableFeatureDetails(Option(self.sourceTableFeatureDetails).map{ v => import SourceTableFeatureDetailsOps._; v.toScala}) // SourceTableFeatureDetails, Map-12
     }

   }

}