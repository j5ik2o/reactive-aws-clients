// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListBackupsResponseBuilderOps(val self: ListBackupsResponse.Builder) extends AnyVal {

  final def backupSummariesAsScala(value: Option[Seq[BackupSummary]]): ListBackupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.backupSummaries(v.asJava)
    } // Seq[BackupSummary]
  }

  final def lastEvaluatedBackupArnAsScala(value: Option[String]): ListBackupsResponse.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedBackupArn(v)
    }
  } // String

}

final class ListBackupsResponseOps(val self: ListBackupsResponse) extends AnyVal {

  final def backupSummariesAsScala: Option[Seq[BackupSummary]] = Option(self.backupSummaries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[BackupSummary]

  final def lastEvaluatedBackupArnAsScala: Option[String] = Option(self.lastEvaluatedBackupArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBackupsResponseOps {

  implicit def toListBackupsResponseBuilderOps(v: ListBackupsResponse.Builder): ListBackupsResponseBuilderOps =
    new ListBackupsResponseBuilderOps(v)

  implicit def toListBackupsResponseOps(v: ListBackupsResponse): ListBackupsResponseOps = new ListBackupsResponseOps(v)

}
