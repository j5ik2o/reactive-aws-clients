package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupDetails => ScalaBackupDetails, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupDetails => JavaBackupDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupDetailsOps {

  implicit class ScalaBackupDetailsOps(val self: ScalaBackupDetails) extends AnyVal {

    def toJava: JavaBackupDetails = {
      val result = JavaBackupDetails.builder()
                                                          self.backupArn.filter(_.nonEmpty).foreach(v => result.backupArn(v)) // String, case String
                      self.backupName.filter(_.nonEmpty).foreach(v => result.backupName(v)) // String, case String
                      self.backupSizeBytes.map(_.longValue).foreach(v => result.backupSizeBytes(v)) // Long, case Long
                      self.backupStatus.foreach{ v => import BackupStatusOps._; result.backupStatus(v.toJava) } // String, case Other
                      self.backupType.foreach{ v => import BackupTypeOps._; result.backupType(v.toJava) } // String, case Other
                      self.backupCreationDateTime.foreach(v => result.backupCreationDateTime(v)) // Instant, case java.time.Instant
                      self.backupExpiryDateTime.foreach(v => result.backupExpiryDateTime(v)) // Instant, case java.time.Instant

      result.build()
    }

  }

  implicit class JavaBackupDetailsOps(val self: JavaBackupDetails) extends AnyVal {

     def toScala: ScalaBackupDetails = {
       ScalaBackupDetails()
            .withBackupArn(Option(self.backupArn)) // String
            .withBackupName(Option(self.backupName)) // String
            .withBackupSizeBytes(Option(self.backupSizeBytes).map(_.longValue)) // Long
            .withBackupStatus(Option(self.backupStatus).map{ v => import BackupStatusOps._; v.toScala}) // String, Map-12
            .withBackupType(Option(self.backupType).map{ v => import BackupTypeOps._; v.toScala}) // String, Map-12
            .withBackupCreationDateTime(Option(self.backupCreationDateTime)) // Instant, Map-11
            .withBackupExpiryDateTime(Option(self.backupExpiryDateTime)) // Instant, Map-11
     }

   }

}