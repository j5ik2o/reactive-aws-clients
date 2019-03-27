// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableFromBackupResponse => ScalaRestoreTableFromBackupResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ RestoreTableFromBackupResult => JavaRestoreTableFromBackupResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreTableFromBackupResponseOps {

  implicit class JavaRestoreTableFromBackupResponseOps(val self: JavaRestoreTableFromBackupResponse) extends AnyVal {

    def toScala: ScalaRestoreTableFromBackupResponse = {
      ScalaRestoreTableFromBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}
