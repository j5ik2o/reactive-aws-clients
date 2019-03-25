package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupSummary => ScalaBackupSummary, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupSummary => JavaBackupSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupSummaryOps {

  implicit class ScalaBackupSummaryOps(val self: ScalaBackupSummary) extends AnyVal {

    def toJava: JavaBackupSummary = {
      val result = JavaBackupSummary.builder()
                                                                      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
                      self.tableId.filter(_.nonEmpty).foreach(v => result.tableId(v)) // String, case String
                      self.tableArn.filter(_.nonEmpty).foreach(v => result.tableArn(v)) // String, case String
                      self.backupArn.filter(_.nonEmpty).foreach(v => result.backupArn(v)) // String, case String
                      self.backupName.filter(_.nonEmpty).foreach(v => result.backupName(v)) // String, case String
                      self.backupCreationDateTime.foreach(v => result.backupCreationDateTime(v)) // Instant, case java.time.Instant
                      self.backupExpiryDateTime.foreach(v => result.backupExpiryDateTime(v)) // Instant, case java.time.Instant
                      self.backupStatus.foreach{ v => import BackupStatusOps._; result.backupStatus(v.toJava) } // String, case Other
                      self.backupType.foreach{ v => import BackupTypeOps._; result.backupType(v.toJava) } // String, case Other
                      self.backupSizeBytes.map(_.longValue).foreach(v => result.backupSizeBytes(v)) // Long, case Long

      result.build()
    }

  }

  implicit class JavaBackupSummaryOps(val self: JavaBackupSummary) extends AnyVal {

     def toScala: ScalaBackupSummary = {
       ScalaBackupSummary()
            .withTableName(Option(self.tableName)) // String
            .withTableId(Option(self.tableId)) // String
            .withTableArn(Option(self.tableArn)) // String
            .withBackupArn(Option(self.backupArn)) // String
            .withBackupName(Option(self.backupName)) // String
            .withBackupCreationDateTime(Option(self.backupCreationDateTime)) // Instant, Map-11
            .withBackupExpiryDateTime(Option(self.backupExpiryDateTime)) // Instant, Map-11
            .withBackupStatus(Option(self.backupStatus).map{ v => import BackupStatusOps._; v.toScala}) // String, Map-12
            .withBackupType(Option(self.backupType).map{ v => import BackupTypeOps._; v.toScala}) // String, Map-12
            .withBackupSizeBytes(Option(self.backupSizeBytes).map(_.longValue)) // Long
     }

   }

}